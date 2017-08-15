package ddv12138.BlackGold.common.item;

import ddv12138.BlackGold.BlackGold;
import ddv12138.BlackGold.common.block.BlockLoader;
import ddv12138.BlackGold.common.item.Armor.Item_BlackGoldArmor;
import ddv12138.BlackGold.common.item.Armor.Item_BlackGoldArmor.Helmet;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Itemloader {
	public static Item itemBGingot = new Item_BlackGoldIngot();
	public static Item itemBGpickaxe = new Item_BlackGoldPickAxe();
	public static Item itemBGsword = new Item_BlackGoldSword();
	
	
	public static Item itemBGhelmet = new Item_BlackGoldArmor.Helmet();
	public static Item itemBGChestplate = new Item_BlackGoldArmor.Chestplate();
	public static Item itemBGLeggings = new Item_BlackGoldArmor.Leggings();
	public static Item itemBGBoots = new Item_BlackGoldArmor.Boots();
	
	
	public static void init() {
		ForgeRegistries.ITEMS.register(itemBGingot.setRegistryName("bgingot"));
		ForgeRegistries.ITEMS.register(itemBGpickaxe.setRegistryName("bgpickaxe"));
		ForgeRegistries.ITEMS.register(itemBGsword.setRegistryName("bgsword"));
		
		ForgeRegistries.ITEMS.register(itemBGhelmet.setRegistryName("bghelmet"));
		ForgeRegistries.ITEMS.register(itemBGChestplate.setRegistryName("bgchestplate"));
		ForgeRegistries.ITEMS.register(itemBGLeggings.setRegistryName("bgleggings"));
		ForgeRegistries.ITEMS.register(itemBGBoots.setRegistryName("bgboots"));
		
	}
	@SideOnly(Side.CLIENT)
	public static void clientInit() {
		ModelLoader.setCustomModelResourceLocation(itemBGingot, 0, new ModelResourceLocation(itemBGingot.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBGpickaxe, 0, new ModelResourceLocation(itemBGpickaxe.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBGsword, 0, new ModelResourceLocation(itemBGsword.getRegistryName(), "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(itemBGhelmet, 0, new ModelResourceLocation(itemBGhelmet.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBGChestplate, 0, new ModelResourceLocation(itemBGChestplate.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBGLeggings, 0, new ModelResourceLocation(itemBGLeggings.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBGBoots, 0, new ModelResourceLocation(itemBGBoots.getRegistryName(), "inventory"));
	}
	//���������䷽
	public static void addSmelting() {
		GameRegistry.addSmelting(BlockLoader.blockbg, new ItemStack(itemBGingot), 100f);
	}
	public static void addRecipe(){
		
	}
}
