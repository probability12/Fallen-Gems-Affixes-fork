package net.kayn.fallen_gems_affixes.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.ForgeRegistries;

public class BossUtil {

    public static final TagKey<EntityType<?>> BOSS_TAG = TagKey.create(
            Registries.ENTITY_TYPE,
            new ResourceLocation("forge", "bosses")
    );

    public static Item getApotheosisGem() {
        return ForgeRegistries.ITEMS.getHolder(new ResourceLocation("apotheosis", "gem"))
                .map(h -> h.value())
                .orElse(null);
    }
}
