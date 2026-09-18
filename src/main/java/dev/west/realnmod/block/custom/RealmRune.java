package dev.west.realnmod.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.phys.shapes.VoxelShape;


import java.util.function.Function;

public class RealmRune extends Block {

    public RealmRune(Properties properties) {
        super(properties);
    }

    @Override
    protected VoxelShape getBlockSupportShape(BlockState state, BlockGetter level, BlockPos pos) {
        return super.getBlockSupportShape(state, level, pos);
    }

    @Override
    protected Function<BlockState, VoxelShape> getShapeForEachState(Function<BlockState, VoxelShape> shapeCalculator, Property<?>... ignoredProperties) {
        return super.getShapeForEachState(shapeCalculator, ignoredProperties);
    }
}

