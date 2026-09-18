package dev.west.realnmod;


import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Util;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Tilt;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.Map;
import java.util.function.Function;

import static net.minecraft.world.level.block.LeavesBlock.WATERLOGGED;
import static net.minecraft.world.level.block.state.properties.BlockStateProperties.TILT;

public class RealmDripBlock extends HorizontalDirectionalBlock implements SimpleWaterloggedBlock, BonemealableBlock {



    private static final Object2IntMap<Tilt> DELAY_UNTIL_NEXT_TILT_STATE = Util.make(new Object2IntArrayMap(), map -> {
        map.defaultReturnValue(-1);
        map.put(Tilt.UNSTABLE, 10);
        map.put(Tilt.PARTIAL, 10);
        map.put(Tilt.FULL, 100);
    });
    private static final int MAX_GEN_HEIGHT = 5;
    private static final int ENTITY_DETECTION_MIN_Y = 11;
    private static final int LOWEST_LEAF_TOP = 13;

    private static final Map<Tilt, VoxelShape> SHAPE_LEAF = Maps.newEnumMap(
            Map.of(
                    Tilt.NONE,
                    Block.column(16.0, 11.0, 15.0),
                    Tilt.UNSTABLE,
                    Block.column(16.0, 11.0, 15.0),
                    Tilt.PARTIAL,
                    Block.column(16.0, 11.0, 13.0),
                    Tilt.FULL,
                    Shapes.empty()
            )
    );



    protected RealmDripBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(
                (BlockState)((BlockState)((BlockState)((BlockState)this.stateDefinition.any()).setValue(WATERLOGGED, false)).setValue(FACING, Direction.NORTH))
                        .setValue(TILT, Tilt.NONE)
        );

    }
    private Function<BlockState, VoxelShape> makeShapes() {
        Map<Direction, VoxelShape> stems = Shapes.rotateHorizontal(Block.column(6.0, 0.0, 13.0).move(0.0, 0.0, 0.25).optimize());
        return this.getShapeForEachState(
                state -> Shapes.or((VoxelShape)SHAPE_LEAF.get(state.getValue(TILT)), (VoxelShape)stems.get(state.getValue(FACING))), WATERLOGGED
        );
    }

    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return codec();
    }

    @Override
    public boolean isValidBonemealTarget(LevelReader level, BlockPos pos, BlockState state) {
        return false;
    }

    @Override
    public boolean isBonemealSuccess(Level level, RandomSource random, BlockPos pos, BlockState state) {
        return false;
    }

    @Override
    public void performBonemeal(ServerLevel level, RandomSource random, BlockPos pos, BlockState state) {

    }
}
