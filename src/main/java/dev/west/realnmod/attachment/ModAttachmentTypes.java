package dev.west.realnmod.attachment;

import com.mojang.serialization.Codec;
import dev.west.realnmod.Realm_Mod;
import net.fabricmc.fabric.api.attachment.v1.AttachmentRegistry;
import net.fabricmc.fabric.api.attachment.v1.AttachmentSyncPredicate;
import net.fabricmc.fabric.api.attachment.v1.AttachmentType;
import net.minecraft.core.BlockPos;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.resources.Identifier;

public class ModAttachmentTypes {
    public static final AttachmentType<Integer> MANA = AttachmentRegistry.create(Identifier.fromNamespaceAndPath(Realm_Mod.MOD_ID, "mana"),
            builder -> builder.persistent(Codec.INT).syncWith(ByteBufCodecs.INT, AttachmentSyncPredicate.all()));
    public static final AttachmentType<BlockPos> HOME_POS = AttachmentRegistry.create(Identifier.fromNamespaceAndPath(Realm_Mod.MOD_ID, "home_pos"),
            blockPosBuilder -> blockPosBuilder.persistent(BlockPos.CODEC).syncWith(BlockPos.STREAM_CODEC, AttachmentSyncPredicate.all()));

    public static void registerModAttachments() {
        Realm_Mod.LOGGER.info("Registering Mod Attachments for " + Realm_Mod.MOD_ID);
    }
}
