package net.redd56.yuccapalm;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.block.TallFlowerBlock;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.TallBlockItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Main implements ModInitializer {
	public static final TallFlowerBlock Tall_Yucca_Flower = new TallYuccaFlower(FabricBlockSettings.of(Material.REPLACEABLE_PLANT)
			.noCollision()
			.breakInstantly()
			.nonOpaque()
			.sounds(BlockSoundGroup.GRASS));
	@Override
	public void onInitialize() {
		BlockRenderLayerMap.INSTANCE.putBlock(Tall_Yucca_Flower, RenderLayer.getCutout());
		Registry.register(Registry.BLOCK, new Identifier("yuccapalm", "tall_yucca_flower"), Tall_Yucca_Flower);
		Registry.register(Registry.ITEM, new Identifier("yuccapalm", "tall_yucca_flower"), new TallBlockItem(Tall_Yucca_Flower, new FabricItemSettings().group(ItemGroup.MISC)));

	}
}
