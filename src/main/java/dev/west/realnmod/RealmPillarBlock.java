package dev.west.realnmod;



import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;




public class RealmPillarBlock extends RotatedPillarBlock {
    private static final VoxelShape SHAPE = Block.box(6,0,6,10,16,10);
    public static final EnumProperty<Direction.Axis> AXIS = BlockStateProperties.AXIS;
    public RealmPillarBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(AXIS, Direction.Axis.Y));
    }



@Override
protected void createBlockStateDefinition(final StateDefinition.Builder<Block, BlockState> builder) {
    builder.add(AXIS);
}

@Override
public BlockState getStateForPlacement(final BlockPlaceContext context) {
    return this.defaultBlockState().setValue(AXIS, context.getClickedFace().getAxis());
}
    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }
}