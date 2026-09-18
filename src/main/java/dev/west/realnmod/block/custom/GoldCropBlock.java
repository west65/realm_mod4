package dev.west.realnmod.block.custom;


import dev.west.realnmod.item.RealmItems;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public  class GoldCropBlock extends CropBlock {
    /**
     * Access widened by fabric-transitive-access-wideners-v1 to accessible
     *
     * @param properties
     */
    public GoldCropBlock(Properties properties) {
        super(properties);
    }
    @Override
    protected ItemLike getBaseSeedId() {
        return RealmItems.GOLD_SEEDS;
    }

    @Override
    protected IntegerProperty getAgeProperty() {
        return AGE;
    }

    @Override
    public int getMaxAge() {
        return MAX_AGE;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }
}

