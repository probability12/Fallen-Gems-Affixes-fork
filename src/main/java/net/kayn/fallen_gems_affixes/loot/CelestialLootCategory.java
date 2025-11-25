package net.kayn.fallen_gems_affixes.loot;

import dev.shadowsoffire.apotheosis.adventure.loot.LootCategory;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;

import java.util.Set;

public class CelestialLootCategory {

    static final Set<LootCategory> RANGED_SET = Set.of(LootCategory.BOW, LootCategory.CROSSBOW, LootCategory.TRIDENT);

    public static final LootCategory CELESTIAL_MELEE = LootCategory.register(
            LootCategory.BOW,
            "celestial_melee",
            CelestialLootCategory::isCelestialMelee,
            new EquipmentSlot[]{EquipmentSlot.MAINHAND}
    );

    public static final LootCategory CELESTIAL_RANGED = LootCategory.register(
            LootCategory.BOW,
            "celestial_ranged",
            CelestialLootCategory::isCelestialRanged,
            new EquipmentSlot[]{EquipmentSlot.MAINHAND}
    );

    // Completely disable categorizing ANYTHING as celestial
    private static boolean isCelestialMelee(ItemStack stack) {
        return false;
    }

    private static boolean isCelestialRanged(ItemStack stack) {
        return false;
    }

    // Leave helper here only to avoid crashes if other code references it
    private static boolean isRanged(ItemStack stack) {
        return RANGED_SET.stream().anyMatch(c -> c.isValid(stack));
    }
}
