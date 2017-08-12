package ddv12138.BlackGold.common.item;

import ddv12138.BlackGold.BlackGold;
import ddv12138.BlackGold.common.block.BlockLoader;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Itemloader {
	public static Item itemBGingot = new Item_BlackGoldIngot().setUnlocalizedName("bgingot");
	public static Item itemBGpickaxe = new Item_BlackGoldPickAxe().setUnlocalizedName("bgpickaxe");
	public static void init() {
		ForgeRegistries.ITEMS.register(itemBGingot.setRegistryName("bgingot"));
		ForgeRegistries.ITEMS.register(itemBGpickaxe.setRegistryName("bgpickaxe"));
	}
	@SideOnly(Side.CLIENT)
	public static void clientInit() {
		ModelLoader.setCustomModelResourceLocation(itemBGingot, 0, new ModelResourceLocation(itemBGingot.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBGpickaxe, 0, new ModelResourceLocation(itemBGpickaxe.getRegistryName(), "inventory"));
	}
	//���������䷽
	public static void addSmelting() {
		GameRegistry.addSmelting(BlockLoader.blockbg, new ItemStack(itemBGingot), 0.5f);
	}
	public static void addRecipe(){
		
	}
}
