
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wakfu.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.wakfu.block.Wakfu_mineraiOreBlock;
import net.mcreator.wakfu.block.Wakfu_mineraiBlockBlock;
import net.mcreator.wakfu.block.StasisOreBlock;
import net.mcreator.wakfu.block.StasisBlockBlock;
import net.mcreator.wakfu.block.SpawnroishushuBlock;
import net.mcreator.wakfu.block.Shushu_oreOreBlock;
import net.mcreator.wakfu.block.Shushu_oreBlockBlock;
import net.mcreator.wakfu.block.ShushuPortalBlockBlock;
import net.mcreator.wakfu.block.ShushuDimensionPortalBlock;
import net.mcreator.wakfu.block.HavresacBlock;
import net.mcreator.wakfu.block.HavreileblockBlock;
import net.mcreator.wakfu.block.HavreilePortalBlock;
import net.mcreator.wakfu.block.EliacubeBlock;
import net.mcreator.wakfu.block.DimensionhavresacPortalBlock;
import net.mcreator.wakfu.block.CasqueNoxBlock;
import net.mcreator.wakfu.WakfuMod;

public class WakfuModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, WakfuMod.MODID);
	public static final RegistryObject<Block> ELIACUBE = REGISTRY.register("eliacube", () -> new EliacubeBlock());
	public static final RegistryObject<Block> HAVRESAC = REGISTRY.register("havresac", () -> new HavresacBlock());
	public static final RegistryObject<Block> DIMENSIONHAVRESAC_PORTAL = REGISTRY.register("dimensionhavresac_portal", () -> new DimensionhavresacPortalBlock());
	public static final RegistryObject<Block> CASQUE_NOX = REGISTRY.register("casque_nox", () -> new CasqueNoxBlock());
	public static final RegistryObject<Block> WAKFU_MINERAI_ORE = REGISTRY.register("wakfu_minerai_ore", () -> new Wakfu_mineraiOreBlock());
	public static final RegistryObject<Block> WAKFU_MINERAI_BLOCK = REGISTRY.register("wakfu_minerai_block", () -> new Wakfu_mineraiBlockBlock());
	public static final RegistryObject<Block> SHUSHU_DIMENSION_PORTAL = REGISTRY.register("shushu_dimension_portal", () -> new ShushuDimensionPortalBlock());
	public static final RegistryObject<Block> SHUSHU_PORTAL_BLOCK = REGISTRY.register("shushu_portal_block", () -> new ShushuPortalBlockBlock());
	public static final RegistryObject<Block> SHUSHU_ORE_ORE = REGISTRY.register("shushu_ore_ore", () -> new Shushu_oreOreBlock());
	public static final RegistryObject<Block> SHUSHU_ORE_BLOCK = REGISTRY.register("shushu_ore_block", () -> new Shushu_oreBlockBlock());
	public static final RegistryObject<Block> SPAWNROISHUSHU = REGISTRY.register("spawnroishushu", () -> new SpawnroishushuBlock());
	public static final RegistryObject<Block> HAVREILE_PORTAL = REGISTRY.register("havreile_portal", () -> new HavreilePortalBlock());
	public static final RegistryObject<Block> HAVREILEBLOCK = REGISTRY.register("havreileblock", () -> new HavreileblockBlock());
	public static final RegistryObject<Block> STASIS_ORE = REGISTRY.register("stasis_ore", () -> new StasisOreBlock());
	public static final RegistryObject<Block> STASIS_BLOCK = REGISTRY.register("stasis_block", () -> new StasisBlockBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
