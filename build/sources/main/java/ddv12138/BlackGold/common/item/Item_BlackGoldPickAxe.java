package ddv12138.BlackGold.common.item;

import java.util.HashSet;
import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.item.ItemTool;

public class Item_BlackGoldPickAxe extends ItemTool{

	protected Item_BlackGoldPickAxe() {
		super(100f,10.0f,ToolMaterial.DIAMOND,new HashSet());
		this.setHarvestLevel("shovel", 4);
		this.setHarvestLevel("axe", 4);
		this.setHarvestLevel("pickaxe", 4);
		this.setMaxDamage(0);
		// TODO �Զ����ɵĹ��캯�����
	}

}
