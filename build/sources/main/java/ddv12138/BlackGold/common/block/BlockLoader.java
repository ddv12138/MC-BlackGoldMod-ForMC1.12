package ddv12138.BlackGold.common.block;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockLoader {
	public static Block blockbg = new Block_BlackGold().setUnlocalizedName("bgblock");
	public static void init() {
		ForgeRegistries.BLOCKS.register(blockbg.setRegistryName("bgblock"));
		ForgeRegistries.ITEMS.register(new ItemBlock(blockbg).setRegistryName(blockbg.getRegistryName()));
	}
	@SideOnly(Side.CLIENT)
	public static void clientInit() {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockbg), 0, new ModelResourceLocation(blockbg.getRegistryName(), "inventory"));
	}
}
