package ddv12138.BlackGold.common.item;

import java.util.HashSet;
import java.util.Set;

import ddv12138.BlackGold.common.tab.bgtab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemTool;
import net.minecraftforge.common.util.EnumHelper;

public class Item_BlackGoldPickAxe extends ItemPickaxe{
	public static final Item.ToolMaterial BLACKGOLD = EnumHelper.addToolMaterial("BLACKGOLD", 4, 0, 30.0F, 10.0F, 30);
	protected Item_BlackGoldPickAxe() {
		//EnumHelper.addToolMaterial("BLACKGOLD", 4, 2000, 15.0F, 10.0F, 30)
		super(BLACKGOLD);
		this.setUnlocalizedName("bgpickaxe");
		this.setCreativeTab(bgtab.bgtab);
		// TODO 自动生成的构造函数存根
	}

}
