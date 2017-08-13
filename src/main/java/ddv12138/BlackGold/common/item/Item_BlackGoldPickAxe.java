package ddv12138.BlackGold.common.item;

import java.util.HashSet;
import java.util.Set;

import ddv12138.BlackGold.common.tab.bgtab;
import net.minecraft.block.Block;
import net.minecraft.item.ItemTool;
import net.minecraftforge.common.util.EnumHelper;

public class Item_BlackGoldPickAxe extends ItemTool{

	protected Item_BlackGoldPickAxe() {
		super(100f,10.0f,EnumHelper.addToolMaterial("BLACKGOLD", 4, 2000, 15.0F, 10.0F, 15),new HashSet());
		this.setHarvestLevel("shovel", 4);
		this.setHarvestLevel("axe", 4);
		this.setHarvestLevel("pickaxe", 4);
		this.setMaxDamage(0);
		this.setCreativeTab(bgtab.bgtab);
		// TODO 自动生成的构造函数存根
	}

}
