package mrthomas20121.thermal_extra.init;

import cofh.core.item.CountedItem;
import cofh.core.item.ItemCoFH;
import cofh.core.util.helpers.AugmentDataHelper;
import cofh.lib.util.DeferredRegisterCoFH;
import cofh.thermal.lib.item.AugmentItem;
import mrthomas20121.thermal_extra.filter.AdvancedFilter;
import mrthomas20121.thermal_extra.item.CustomAugmentItem;
import net.minecraft.ChatFormatting;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nonnull;

import java.util.function.Consumer;
import java.util.function.Supplier;

import static cofh.lib.util.constants.NBTTags.*;
import static cofh.thermal.lib.common.ThermalFlags.*;

@Mod.EventBusSubscriber(modid = mrthomas20121.thermal_extra.ThermalExtra.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ThermalExtraItems {

    public static DeferredRegisterCoFH<Item> ITEMS = DeferredRegisterCoFH.create(ForgeRegistries.ITEMS, mrthomas20121.thermal_extra.ThermalExtra.MOD_ID);

    public static Rarity tier0Rarity = Rarity.create("tier_zero", style -> style.withColor(0xf1e8b8));
    public static Rarity tier1Rarity = Rarity.create("tier_one", style -> style.withColor(0xf18f01));
    public static Rarity tier2Rarity = Rarity.create("tier_two", style -> style.withColor(0x439775));
    public static Rarity tier3Rarity = Rarity.create("tier_three", style -> style.withColor(0x006e90));
    public static Rarity tier4Rarity = Rarity.create("tier_four", style -> style.withColor(0x7f2982));

    public static CreativeModeTab resourcesTab = new CreativeModeTab("thermal_extra.resources") {
        @Nonnull
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(dragon_steel_plate.get());
        }
    };

    public static CreativeModeTab blockTab = new CreativeModeTab("thermal_extra.blocks") {
        @Nonnull
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ThermalExtraBlocks.DRAGONSTEEL_BLOCK.get());
        }
    };

    public static CreativeModeTab augmentTab = new CreativeModeTab("thermal_extra.augments") {
        @Nonnull
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(integral_component.get());
        }
    };

    public static final RegistryObject<Item> amethyst_dust = ITEMS.register("amethyst_dust", item((prop) -> prop.tab(resourcesTab).rarity(tier0Rarity)));
    public static final RegistryObject<Item> soul_sand_dust = ITEMS.register("soul_sand_dust", item((prop) -> prop.tab(resourcesTab).rarity(tier1Rarity)));
    public static final RegistryObject<Item> sticky_ball = ITEMS.register("sticky_ball", item((prop) -> prop.tab(resourcesTab).rarity(tier0Rarity)));

	public static final RegistryObject<Item> soul_infused_ingot = ITEMS.register("soul_infused_ingot", item((prop) -> prop.tab(resourcesTab).rarity(tier1Rarity)));
    public static final RegistryObject<Item> soul_infused_nugget = ITEMS.register("soul_infused_nugget", item((prop) -> prop.tab(resourcesTab).rarity(tier1Rarity)));
    public static final RegistryObject<Item> soul_infused_dust = ITEMS.register("soul_infused_dust", item((prop) -> prop.tab(resourcesTab).rarity(tier1Rarity)));
    public static final RegistryObject<Item> soul_infused_plate = ITEMS.register("soul_infused_plate", item((prop) -> prop.tab(resourcesTab).rarity(tier1Rarity), true));
    public static final RegistryObject<Item> soul_infused_gear = ITEMS.register("soul_infused_gear", item((prop) -> prop.tab(resourcesTab).rarity(tier1Rarity), true));
    public static final RegistryObject<Item> soul_infused_coin = ITEMS.register("soul_infused_coin", item((prop) -> prop.tab(resourcesTab).rarity(tier1Rarity), true));

    public static final RegistryObject<Item> shellite_ingot = ITEMS.register("shellite_ingot", item((prop) -> prop.tab(resourcesTab).rarity(tier2Rarity)));
    public static final RegistryObject<Item> shellite_nugget = ITEMS.register("shellite_nugget", item((prop) -> prop.tab(resourcesTab).rarity(tier2Rarity)));
    public static final RegistryObject<Item> shellite_dust = ITEMS.register("shellite_dust", item((prop) -> prop.tab(resourcesTab).rarity(tier2Rarity)));
    public static final RegistryObject<Item> shellite_plate = ITEMS.register("shellite_plate", item((prop) -> prop.tab(resourcesTab).rarity(tier2Rarity), true));
    public static final RegistryObject<Item> shellite_gear = ITEMS.register("shellite_gear", item((prop) -> prop.tab(resourcesTab).rarity(tier2Rarity)));
    public static final RegistryObject<Item> shellite_coin = ITEMS.register("shellite_coin", item((prop) -> prop.tab(resourcesTab).rarity(tier2Rarity), true));

    public static final RegistryObject<Item> twinite_ingot = ITEMS.register("twinite_ingot", item((prop) -> prop.tab(resourcesTab).rarity(tier3Rarity)));
    public static final RegistryObject<Item> twinite_nugget = ITEMS.register("twinite_nugget", item((prop) -> prop.tab(resourcesTab).rarity(tier3Rarity)));
    public static final RegistryObject<Item> twinite_dust = ITEMS.register("twinite_dust", item((prop) -> prop.tab(resourcesTab).rarity(tier3Rarity)));
    public static final RegistryObject<Item> twinite_plate = ITEMS.register("twinite_plate", item((prop) -> prop.tab(resourcesTab).rarity(tier3Rarity), true));
    public static final RegistryObject<Item> twinite_gear = ITEMS.register("twinite_gear", item((prop) -> prop.tab(resourcesTab).rarity(tier3Rarity)));
    public static final RegistryObject<Item> twinite_coin = ITEMS.register("twinite_coin", item((prop) -> prop.tab(resourcesTab).rarity(tier3Rarity), true));

    public static final RegistryObject<Item> dragon_steel_ingot = ITEMS.register("dragonsteel_ingot", item((prop) -> prop.tab(resourcesTab).rarity(tier0Rarity)));
    public static final RegistryObject<Item> dragon_steel_nugget = ITEMS.register("dragonsteel_nugget", item((prop) -> prop.tab(resourcesTab).rarity(tier0Rarity)));
    public static final RegistryObject<Item> dragon_steel_dust = ITEMS.register("dragonsteel_dust", item((prop) -> prop.tab(resourcesTab).rarity(tier0Rarity)));
    public static final RegistryObject<Item> dragon_steel_plate = ITEMS.register("dragonsteel_plate", item((prop) -> prop.tab(resourcesTab).rarity(tier0Rarity), true));
    public static final RegistryObject<Item> dragon_steel_gear = ITEMS.register("dragonsteel_gear", item((prop) -> prop.tab(resourcesTab).rarity(tier0Rarity)));
    public static final RegistryObject<Item> dragon_steel_coin = ITEMS.register("dragonsteel_coin", item((prop) -> prop.tab(resourcesTab).rarity(tier0Rarity), true));

    // augments
    public static final RegistryObject<ItemCoFH> integral_component = ITEMS.register("upgrade_augment", () -> new CustomAugmentItem(new Item.Properties().rarity(tier4Rarity).tab(augmentTab).rarity(Rarity.RARE),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_UPGRADE)
                    .mod(TAG_AUGMENT_BASE_MOD, 4.5F)
                    .build()).setShowInGroups(getFlag(FLAG_UPGRADE_AUGMENTS)));

    public static final RegistryObject<Item> av_item_filter_augment = ITEMS.register("av_item_filter_augment", () -> new AugmentItem(new Item.Properties().rarity(tier1Rarity).tab(augmentTab),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_FILTER)
                    .feature(TAG_FILTER_TYPE, AdvancedFilter.ITEM_FILTER_TYPE)
                    .build()).setShowInGroups(getFlag(FLAG_FILTER_AUGMENTS)));

    public static final RegistryObject<Item> area_radius_augment_1 = ITEMS.register("area_radius_augment_1", () -> new AugmentItem(new Item.Properties().rarity(tier1Rarity).tab(augmentTab),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_AREA_EFFECT)
                    .mod(TAG_AUGMENT_RADIUS, 2.0F)
                    .build()).setShowInGroups(getFlag(FLAG_AREA_AUGMENTS)));

    public static final RegistryObject<Item> area_radius_augment_2 = ITEMS.register("area_radius_augment_2", () -> new AugmentItem(new Item.Properties().rarity(tier2Rarity).tab(augmentTab),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_AREA_EFFECT)
                    .mod(TAG_AUGMENT_RADIUS, 3.0F)
                    .build()).setShowInGroups(getFlag(FLAG_AREA_AUGMENTS)));

    public static final RegistryObject<Item> area_radius_augment_3 = ITEMS.register("area_radius_augment_3", () -> new AugmentItem(new Item.Properties().rarity(tier3Rarity).tab(augmentTab),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_AREA_EFFECT)
                    .mod(TAG_AUGMENT_RADIUS, 4.0F)
                    .build()).setShowInGroups(getFlag(FLAG_AREA_AUGMENTS)));

    public static final RegistryObject<Item> area_radius_augment_4 = ITEMS.register("area_radius_augment_4", () -> new AugmentItem(new Item.Properties().rarity(tier4Rarity).tab(augmentTab),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_AREA_EFFECT)
                    .mod(TAG_AUGMENT_RADIUS, 5.0F)
                    .build()).setShowInGroups(getFlag(FLAG_AREA_AUGMENTS)));

    public static final RegistryObject<Item> potion_amplifier_augment_1 = ITEMS.register("potion_amplifier_augment_1", () -> new AugmentItem(new Item.Properties().rarity(tier1Rarity).tab(augmentTab),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_POTION)
                    .mod(TAG_AUGMENT_POTION_AMPLIFIER, 1.0F)
                    .mod(TAG_AUGMENT_POTION_DURATION, -0.22F)
                    .build()).setShowInGroups(getFlag(FLAG_POTION_AUGMENTS)));

    public static final RegistryObject<Item> potion_amplifier_augment_2 = ITEMS.register("potion_amplifier_augment_2", () -> new AugmentItem(new Item.Properties().rarity(tier2Rarity).tab(augmentTab),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_POTION)
                    .mod(TAG_AUGMENT_POTION_AMPLIFIER, 1.0F)
                    .mod(TAG_AUGMENT_POTION_DURATION, -0.19F)
                    .build()).setShowInGroups(getFlag(FLAG_POTION_AUGMENTS)));

    public static final RegistryObject<Item> potion_amplifier_augment_3 = ITEMS.register("potion_amplifier_augment_3", () -> new AugmentItem(new Item.Properties().rarity(tier3Rarity).tab(augmentTab),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_POTION)
                    .mod(TAG_AUGMENT_POTION_AMPLIFIER, 1.0F)
                    .mod(TAG_AUGMENT_POTION_DURATION, -0.16F)
                    .build()).setShowInGroups(getFlag(FLAG_POTION_AUGMENTS)));

    public static final RegistryObject<Item> potion_amplifier_augment_4 = ITEMS.register("potion_amplifier_augment_4", () -> new AugmentItem(new Item.Properties().rarity(tier4Rarity).tab(augmentTab),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_POTION)
                    .mod(TAG_AUGMENT_POTION_AMPLIFIER, 1.0F)
                    .mod(TAG_AUGMENT_POTION_DURATION, -0.13F)
                    .build()).setShowInGroups(getFlag(FLAG_POTION_AUGMENTS)));

    public static final RegistryObject<Item> potion_amplifier_augment_5 = ITEMS.register("potion_amplifier_augment_5", () -> new AugmentItem(new Item.Properties().rarity(tier4Rarity).tab(augmentTab),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_POTION)
                    .mod(TAG_AUGMENT_POTION_AMPLIFIER, 1.0F)
                    .mod(TAG_AUGMENT_POTION_DURATION, -0.10F)
                    .build()).setShowInGroups(getFlag(FLAG_POTION_AUGMENTS)));

    public static final RegistryObject<Item> potion_duration_augment_1 = ITEMS.register("potion_duration_augment_1", () -> new AugmentItem(new Item.Properties().rarity(tier1Rarity).tab(augmentTab),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_POTION)
                    .mod(TAG_AUGMENT_POTION_DURATION, 1.2F)
                    .build()).setShowInGroups(getFlag(FLAG_POTION_AUGMENTS)));

    public static final RegistryObject<Item> potion_duration_augment_2 = ITEMS.register("potion_duration_augment_2", () -> new AugmentItem(new Item.Properties().rarity(tier2Rarity).tab(augmentTab),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_POTION)
                    .mod(TAG_AUGMENT_POTION_DURATION, 1.4F)
                    .build()).setShowInGroups(getFlag(FLAG_POTION_AUGMENTS)));

    public static final RegistryObject<Item> potion_duration_augment_3 = ITEMS.register("potion_duration_augment_3", () -> new AugmentItem(new Item.Properties().rarity(tier3Rarity).tab(augmentTab),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_POTION)
                    .mod(TAG_AUGMENT_POTION_DURATION, 1.6F)
                    .build()).setShowInGroups(getFlag(FLAG_POTION_AUGMENTS)));

    public static final RegistryObject<Item> potion_duration_augment_4 = ITEMS.register("potion_duration_augment_4", () -> new AugmentItem(new Item.Properties().rarity(tier4Rarity).tab(augmentTab),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_POTION)
                    .mod(TAG_AUGMENT_POTION_DURATION, 1.8F)
                    .build()).setShowInGroups(getFlag(FLAG_POTION_AUGMENTS)));

    public static final RegistryObject<Item> potion_duration_augment_5 = ITEMS.register("potion_duration_augment_5", () -> new AugmentItem(new Item.Properties().rarity(tier4Rarity).tab(augmentTab),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_POTION)
                    .mod(TAG_AUGMENT_POTION_DURATION, 2F)
                    .build()).setShowInGroups(getFlag(FLAG_POTION_AUGMENTS)));

    public static final RegistryObject<Item> rf_coil_augment_1 = ITEMS.register("rf_coil_augment_1", () -> new AugmentItem(new Item.Properties().rarity(yellow),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_RF)
                    .mod(TAG_AUGMENT_RF_STORAGE, 12.0F)
                    .mod(TAG_AUGMENT_RF_XFER, 12.0F)
                    .build()));

    public static final RegistryObject<Item> rf_coil_augment_2 = ITEMS.register("rf_coil_augment_2", () -> new AugmentItem(new Item.Properties().rarity(yellow),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_RF)
                    .mod(TAG_AUGMENT_RF_STORAGE, 36.0F)
                    .mod(TAG_AUGMENT_RF_XFER, 36.0F)
                    .build()));

    public static final RegistryObject<Item> rf_coil_augment_3 = ITEMS.register("rf_coil_augment_3", () -> new AugmentItem(new Item.Properties().rarity(dark_aqua),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_RF)
                    .mod(TAG_AUGMENT_RF_STORAGE, 108.0F)
                    .mod(TAG_AUGMENT_RF_XFER, 108.0F)
                    .build()));

    public static final RegistryObject<Item> rf_coil_augment_4 = ITEMS.register("rf_coil_augment_4", () -> new AugmentItem(new Item.Properties().rarity(dark_purple),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_RF)
                    .mod(TAG_AUGMENT_RF_STORAGE, 324.0F)
                    .mod(TAG_AUGMENT_RF_XFER, 324.0F)
                    .build()));

    public static final RegistryObject<Item> rf_coil_augment_5 = ITEMS.register("rf_coil_augment_5", () -> new AugmentItem(new Item.Properties().rarity(red),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_RF)
                    .mod(TAG_AUGMENT_RF_STORAGE, 972.0F)
                    .mod(TAG_AUGMENT_RF_XFER, 972.0F)
                    .build()));

    public static final RegistryObject<Item> rf_coil_storage_augment_1 = ITEMS.register("rf_coil_storage_augment_1", () -> new AugmentItem(new Item.Properties().rarity(yellow),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_RF)
                    .mod(TAG_AUGMENT_RF_STORAGE, 18.0F)
                    .mod(TAG_AUGMENT_RF_XFER, 6.0F)
                    .build()));

    public static final RegistryObject<Item> rf_coil_storage_augment_2 = ITEMS.register("rf_coil_storage_augment_2", () -> new AugmentItem(new Item.Properties().rarity(yellow),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_RF)
                    .mod(TAG_AUGMENT_RF_STORAGE, 54.0F)
                    .mod(TAG_AUGMENT_RF_XFER, 18.0F)
                    .build()));

    public static final RegistryObject<Item> rf_coil_storage_augment_3 = ITEMS.register("rf_coil_storage_augment_3", () -> new AugmentItem(new Item.Properties().rarity(dark_aqua),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_RF)
                    .mod(TAG_AUGMENT_RF_STORAGE, 162.0F)
                    .mod(TAG_AUGMENT_RF_XFER, 54.0F)
                    .build()));

    public static final RegistryObject<Item> rf_coil_storage_augment_4 = ITEMS.register("rf_coil_storage_augment_4", () -> new AugmentItem(new Item.Properties().rarity(dark_purple),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_RF)
                    .mod(TAG_AUGMENT_RF_STORAGE, 486.0F)
                    .mod(TAG_AUGMENT_RF_XFER, 162.0F)
                    .build()));

    public static final RegistryObject<Item> rf_coil_storage_augment_5 = ITEMS.register("rf_coil_storage_augment_5", () -> new AugmentItem(new Item.Properties().rarity(red),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_RF)
                    .mod(TAG_AUGMENT_RF_STORAGE, 1458.0F)
                    .mod(TAG_AUGMENT_RF_XFER, 486.0F)
                    .build()));

    public static final RegistryObject<Item> rf_coil_xfer_augment_1 = ITEMS.register("rf_coil_xfer_augment_1", () -> new AugmentItem(new Item.Properties().rarity(yellow),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_RF)
                    .mod(TAG_AUGMENT_RF_STORAGE, 6.0F)
                    .mod(TAG_AUGMENT_RF_XFER, 18.0F)
                    .build()));

    public static final RegistryObject<Item> rf_coil_xfer_augment_2 = ITEMS.register("rf_coil_xfer_augment_2", () -> new AugmentItem(new Item.Properties().rarity(yellow),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_RF)
                    .mod(TAG_AUGMENT_RF_STORAGE, 18.0F)
                    .mod(TAG_AUGMENT_RF_XFER, 54.0F)
                    .build()));

    public static final RegistryObject<Item> rf_coil_xfer_augment_3 = ITEMS.register("rf_coil_xfer_augment_3", () -> new AugmentItem(new Item.Properties().rarity(dark_aqua),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_RF)
                    .mod(TAG_AUGMENT_RF_STORAGE, 54.0F)
                    .mod(TAG_AUGMENT_RF_XFER, 162.0F)
                    .build()));

    public static final RegistryObject<Item> rf_coil_xfer_augment_4 = ITEMS.register("rf_coil_xfer_augment_4", () -> new AugmentItem(new Item.Properties().rarity(dark_purple),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_RF)
                    .mod(TAG_AUGMENT_RF_STORAGE, 162.0F)
                    .mod(TAG_AUGMENT_RF_XFER, 486.0F)
                    .build()));

    public static final RegistryObject<Item> rf_coil_xfer_augment_5 = ITEMS.register("rf_coil_xfer_augment_5", () -> new AugmentItem(new Item.Properties().rarity(red),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_RF)
                    .mod(TAG_AUGMENT_RF_STORAGE, 486.0F)
                    .mod(TAG_AUGMENT_RF_XFER, 1458.0F)
                    .build()));

    public static final RegistryObject<Item> tank_augment_1 = ITEMS.register("fluid_tank_augment_1", () -> new AugmentItem(new Item.Properties().rarity(yellow),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_FLUID)
                    .mod(TAG_AUGMENT_FLUID_STORAGE, 8.0F)
                    .build()));

    public static final RegistryObject<Item> tank_augment_1 = ITEMS.register("fluid_tank_augment_1", () -> new AugmentItem(new Item.Properties().rarity(tier1Rarity).tab(augmentTab),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_FLUID)
                    .mod(TAG_AUGMENT_FLUID_STORAGE, 8.0F)
                    .build()).setShowInGroups(getFlag(FLAG_STORAGE_AUGMENTS)));

    public static final RegistryObject<Item> tank_augment_2 = ITEMS.register("fluid_tank_augment_2", () -> new AugmentItem(new Item.Properties().rarity(tier2Rarity).tab(augmentTab),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_FLUID)
                    .mod(TAG_AUGMENT_FLUID_STORAGE, 12.0F)
                    .build()).setShowInGroups(getFlag(FLAG_STORAGE_AUGMENTS)));

    public static final RegistryObject<Item> tank_augment_3 = ITEMS.register("fluid_tank_augment_3", () -> new AugmentItem(new Item.Properties().rarity(tier3Rarity).tab(augmentTab),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_FLUID)
                    .mod(TAG_AUGMENT_FLUID_STORAGE, 16.0F)
                    .build()).setShowInGroups(getFlag(FLAG_STORAGE_AUGMENTS)));

    public static final RegistryObject<Item> tank_augment_4 = ITEMS.register("fluid_tank_augment_4", () -> new AugmentItem(new Item.Properties().rarity(tier4Rarity).tab(augmentTab),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_FLUID)
                    .mod(TAG_AUGMENT_FLUID_STORAGE, 24.0F)
                    .build()).setShowInGroups(getFlag(FLAG_STORAGE_AUGMENTS)));

    public static final RegistryObject<Item> tank_augment_5 = ITEMS.register("fluid_tank_augment_5", () -> new AugmentItem(new Item.Properties().rarity(tier4Rarity).tab(augmentTab),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_FLUID)
                    .mod(TAG_AUGMENT_FLUID_STORAGE, 32.0F)
                    .build()).setShowInGroups(getFlag(FLAG_STORAGE_AUGMENTS)));

    public static final RegistryObject<Item> tank_augment_6 = ITEMS.register("fluid_tank_augment_6", () -> new AugmentItem(new Item.Properties().rarity(tier0Rarity).tab(augmentTab),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_FLUID)
                    .mod(TAG_AUGMENT_FLUID_STORAGE, 64.0F)
                    .build()).setShowInGroups(getFlag(FLAG_STORAGE_AUGMENTS)));

    public static final RegistryObject<Item> machine_speed_augment_1 = ITEMS.register("machine_speed_augment_1", () -> new AugmentItem(new Item.Properties().rarity(tier1Rarity).tab(augmentTab),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_MACHINE)
                    .mod(TAG_AUGMENT_MACHINE_POWER, 1.05F)
                    .mod(TAG_AUGMENT_MACHINE_ENERGY, 1.1F)
                    .build()).setShowInGroups(getFlag(FLAG_MACHINE_AUGMENTS)));

    public static final RegistryObject<Item> machine_speed_augment_2 = ITEMS.register("machine_speed_augment_2", () -> new AugmentItem(new Item.Properties().rarity(tier2Rarity).tab(augmentTab),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_MACHINE)
                    .mod(TAG_AUGMENT_MACHINE_POWER, 1.1F)
                    .mod(TAG_AUGMENT_MACHINE_ENERGY, 1.1F)
                    .build()).setShowInGroups(getFlag(FLAG_MACHINE_AUGMENTS)));

    public static final RegistryObject<Item> machine_speed_augment_3 = ITEMS.register("machine_speed_augment_3", () -> new AugmentItem(new Item.Properties().rarity(tier3Rarity).tab(augmentTab),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_MACHINE)
                    .mod(TAG_AUGMENT_MACHINE_POWER, 1.2F)
                    .mod(TAG_AUGMENT_MACHINE_ENERGY, 1.1F)
                    .build()).setShowInGroups(getFlag(FLAG_MACHINE_AUGMENTS)));

    public static final RegistryObject<Item> machine_speed_augment_4 = ITEMS.register("machine_speed_augment_4", () -> new AugmentItem(new Item.Properties().rarity(tier4Rarity).tab(augmentTab),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_MACHINE)
                    .mod(TAG_AUGMENT_MACHINE_POWER, 1.10F)
                    .mod(TAG_AUGMENT_MACHINE_ENERGY, 0.9F)
                    .build()).setShowInGroups(getFlag(FLAG_MACHINE_AUGMENTS)));

    public static final RegistryObject<Item> machine_efficiency_augment_1 = ITEMS.register("machine_efficiency_augment_1", () -> new AugmentItem(new Item.Properties().rarity(tier1Rarity).tab(augmentTab),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_MACHINE)
                    .mod(TAG_AUGMENT_MACHINE_SPEED, -0.12F)
                    .mod(TAG_AUGMENT_MACHINE_ENERGY, 0.87F)
                    .build()).setShowInGroups(getFlag(FLAG_MACHINE_AUGMENTS)));

    public static final RegistryObject<Item> machine_efficiency_augment_2 = ITEMS.register("machine_efficiency_augment_2", () -> new AugmentItem(new Item.Properties().rarity(tier2Rarity).tab(augmentTab),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_MACHINE)
                    .mod(TAG_AUGMENT_MACHINE_SPEED, -0.12F)
                    .mod(TAG_AUGMENT_MACHINE_ENERGY, 0.83F)
                    .build()).setShowInGroups(getFlag(FLAG_MACHINE_AUGMENTS)));

    public static final RegistryObject<Item> machine_efficiency_augment_3 = ITEMS.register("machine_efficiency_augment_3", () -> new AugmentItem(new Item.Properties().rarity(tier3Rarity).tab(augmentTab),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_MACHINE)
                    .mod(TAG_AUGMENT_MACHINE_SPEED, -0.12F)
                    .mod(TAG_AUGMENT_MACHINE_ENERGY, 0.77F)
                    .build()).setShowInGroups(getFlag(FLAG_MACHINE_AUGMENTS)));

    public static final RegistryObject<Item> machine_efficiency_augment_4 = ITEMS.register("machine_efficiency_augment_4", () -> new AugmentItem(new Item.Properties().rarity(tier4Rarity).tab(augmentTab),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_MACHINE)
                    .mod(TAG_AUGMENT_MACHINE_SPEED, -0.12F)
                    .mod(TAG_AUGMENT_MACHINE_ENERGY, 0.73F)
                    .build()).setShowInGroups(getFlag(FLAG_MACHINE_AUGMENTS)));

    public static final RegistryObject<Item> machine_output_augment_1 = ITEMS.register("machine_output_augment_1", () -> new AugmentItem(new Item.Properties().rarity(tier1Rarity).tab(augmentTab),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_MACHINE)
                    .mod(TAG_AUGMENT_MACHINE_SECONDARY, 0.20F)
                    .mod(TAG_AUGMENT_MACHINE_ENERGY, 1.27F)
                    .build()).setShowInGroups(getFlag(FLAG_MACHINE_AUGMENTS)));

    public static final RegistryObject<Item> machine_output_augment_2 = ITEMS.register("machine_output_augment_2", () -> new AugmentItem(new Item.Properties().rarity(tier2Rarity).tab(augmentTab),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_MACHINE)
                    .mod(TAG_AUGMENT_MACHINE_SECONDARY, 0.25F)
                    .mod(TAG_AUGMENT_MACHINE_ENERGY, 1.30F)
                    .build()).setShowInGroups(getFlag(FLAG_MACHINE_AUGMENTS)));

    public static final RegistryObject<Item> machine_output_augment_3 = ITEMS.register("machine_output_augment_3", () -> new AugmentItem(new Item.Properties().rarity(tier3Rarity).tab(augmentTab),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_MACHINE)
                    .mod(TAG_AUGMENT_MACHINE_SECONDARY, 0.30F)
                    .mod(TAG_AUGMENT_MACHINE_ENERGY, 1.32F)
                    .build()).setShowInGroups(getFlag(FLAG_MACHINE_AUGMENTS)));

    public static final RegistryObject<Item> machine_catalyst_augment_1 = ITEMS.register("machine_catalyst_augment_1", () -> new AugmentItem(new Item.Properties().rarity(tier1Rarity).tab(augmentTab),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_MACHINE)
                    .mod(TAG_AUGMENT_MACHINE_CATALYST, 0.78F)
                    .mod(TAG_AUGMENT_MACHINE_ENERGY, 1.25F)
                    .build()).setShowInGroups(getFlag(FLAG_MACHINE_AUGMENTS)));

    public static final RegistryObject<Item> machine_catalyst_augment_2 = ITEMS.register("machine_catalyst_augment_2", () -> new AugmentItem(new Item.Properties().rarity(tier2Rarity).tab(augmentTab),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_MACHINE)
                    .mod(TAG_AUGMENT_MACHINE_CATALYST, 0.75F)
                    .mod(TAG_AUGMENT_MACHINE_ENERGY, 1.27F)
                    .build()).setShowInGroups(getFlag(FLAG_MACHINE_AUGMENTS)));

    public static final RegistryObject<Item> machine_catalyst_augment_3 = ITEMS.register("machine_catalyst_augment_3", () -> new AugmentItem(new Item.Properties().rarity(tier3Rarity).tab(augmentTab),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_MACHINE)
                    .mod(TAG_AUGMENT_MACHINE_CATALYST, 0.70F)
                    .mod(TAG_AUGMENT_MACHINE_ENERGY, 1.29F)
                    .build()).setShowInGroups(getFlag(FLAG_MACHINE_AUGMENTS)));

    public static final RegistryObject<Item> dynamo_fuel_augment_1 = ITEMS.register("dynamo_fuel_augment_1", () -> new AugmentItem(new Item.Properties().rarity(tier1Rarity).tab(augmentTab),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_DYNAMO)
                    .mod(TAG_AUGMENT_DYNAMO_ENERGY, 1.15F)
                    .build()).setShowInGroups(getFlag(FLAG_DYNAMO_AUGMENTS)));

    public static final RegistryObject<Item> dynamo_fuel_augment_2 = ITEMS.register("dynamo_fuel_augment_2", () -> new AugmentItem(new Item.Properties().rarity(tier2Rarity).tab(augmentTab),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_DYNAMO)
                    .mod(TAG_AUGMENT_DYNAMO_ENERGY, 1.2F)
                    .build()).setShowInGroups(getFlag(FLAG_DYNAMO_AUGMENTS)));

    public static final RegistryObject<Item> dynamo_fuel_augment_3 = ITEMS.register("dynamo_fuel_augment_3", () -> new AugmentItem(new Item.Properties().rarity(tier3Rarity).tab(augmentTab),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_DYNAMO)
                    .mod(TAG_AUGMENT_DYNAMO_ENERGY, 1.25F)
                    .build()).setShowInGroups(getFlag(FLAG_DYNAMO_AUGMENTS)));

    public static final RegistryObject<Item> dynamo_fuel_augment_4 = ITEMS.register("dynamo_fuel_augment_4", () -> new AugmentItem(new Item.Properties().rarity(tier4Rarity).tab(augmentTab),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_DYNAMO)
                    .mod(TAG_AUGMENT_DYNAMO_ENERGY, 1.3F)
                    .build()).setShowInGroups(getFlag(FLAG_DYNAMO_AUGMENTS)));

    public static final RegistryObject<Item> dynamo_output_augment_1 = ITEMS.register("dynamo_output_augment_1", () -> new AugmentItem(new Item.Properties().rarity(tier1Rarity).tab(augmentTab),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_DYNAMO)
                    .mod(TAG_AUGMENT_DYNAMO_POWER, 1.1F)
                    .mod(TAG_AUGMENT_DYNAMO_ENERGY, 0.9F)
                    .build()).setShowInGroups(getFlag(FLAG_DYNAMO_AUGMENTS)));

    public static final RegistryObject<Item> dynamo_output_augment_2 = ITEMS.register("dynamo_output_augment_2", () -> new AugmentItem(new Item.Properties().rarity(tier2Rarity).tab(augmentTab),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_DYNAMO)
                    .mod(TAG_AUGMENT_DYNAMO_POWER, 1.15F)
                    .mod(TAG_AUGMENT_DYNAMO_ENERGY, 0.9F)
                    .build()).setShowInGroups(getFlag(FLAG_DYNAMO_AUGMENTS)));

    public static final RegistryObject<Item> dynamo_output_augment_3 = ITEMS.register("dynamo_output_augment_3", () -> new AugmentItem(new Item.Properties().rarity(tier3Rarity).tab(augmentTab),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_DYNAMO)
                    .mod(TAG_AUGMENT_DYNAMO_POWER, 1.2F)
                    .mod(TAG_AUGMENT_DYNAMO_ENERGY, 0.9F)
                    .build()).setShowInGroups(getFlag(FLAG_DYNAMO_AUGMENTS)));

    public static final RegistryObject<Item> dynamo_output_augment_4 = ITEMS.register("dynamo_output_augment_4", () -> new AugmentItem(new Item.Properties().rarity(tier4Rarity).tab(augmentTab),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_DYNAMO)
                    .mod(TAG_AUGMENT_DYNAMO_POWER, 1F)
                    .mod(TAG_AUGMENT_DYNAMO_ENERGY, 1.1F)
                    .build()).setShowInGroups(getFlag(FLAG_DYNAMO_AUGMENTS)));

    public static Supplier<ItemCoFH> item(Consumer<Item.Properties> consumer) {
        return item(consumer, false);
    }

    public static Supplier<ItemCoFH> item(Consumer<Item.Properties> consumer, boolean count) {
        Item.Properties props = new Item.Properties();
        consumer.accept(props);
        if(count) {
            return () -> new CountedItem(props);
        }
        return () -> new ItemCoFH(props);
    }
}
