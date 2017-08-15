package ddv12138.BlackGold.common.item.Armor;
import net.minecraftforge.common.util.EnumHelper;

import ddv12138.BlackGold.BlackGold;
import ddv12138.BlackGold.common.tab.bgtab;
import net.minecraft.block.SoundType;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.SoundEvent;

public class Item_BlackGoldArmor extends ItemArmor{
	public final static ItemArmor.ArmorMaterial BLACK_GOLD_ARMOR = EnumHelper.addArmorMaterial("blackgold",BlackGold.MODID + ":" + "blackgold", 10, new int[]{ 3, 8, 6, 3 }, 30, null, 4);
	public Item_BlackGoldArmor(EntityEquipmentSlot armorType) {
		super(BLACK_GOLD_ARMOR, BLACK_GOLD_ARMOR.ordinal(), armorType);
		// TODO 自动生成的构造函数存根
	}
	public static class Helmet extends Item_BlackGoldArmor{
		public Helmet() {
			// TODO 自动生成的构造函数存根
			super(EntityEquipmentSlot.HEAD);
			this.setUnlocalizedName("bghelmet");
			this.setCreativeTab(bgtab.bgtab);
		}
	}
	
	public static class Chestplate extends Item_BlackGoldArmor{
		public Chestplate() {
			// TODO 自动生成的构造函数存根
			super(EntityEquipmentSlot.CHEST);
			this.setUnlocalizedName("bgchestplate");
			this.setCreativeTab(bgtab.bgtab);
			System.out.println(this.getItemEnchantability()+"------------------------------------------------chestplate");
		}
	}
	public static class Leggings extends Item_BlackGoldArmor{
		public Leggings() {
			// TODO 自动生成的构造函数存根
			super(EntityEquipmentSlot.LEGS);
			this.setUnlocalizedName("bgleggings");
			this.setCreativeTab(bgtab.bgtab);
		}
	}
	public static class Boots extends Item_BlackGoldArmor{
		public Boots() {
			// TODO 自动生成的构造函数存根
			super(EntityEquipmentSlot.FEET);
			this.setUnlocalizedName("bgboots");
			this.setCreativeTab(bgtab.bgtab);
		}
	}
}