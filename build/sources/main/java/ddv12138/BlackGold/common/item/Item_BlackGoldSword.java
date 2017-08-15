package ddv12138.BlackGold.common.item;

import ddv12138.BlackGold.common.tab.bgtab;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class Item_BlackGoldSword extends ItemSword{

	protected Item_BlackGoldSword() {
		super(EnumHelper.addToolMaterial("BLACKGOLD", 4, 0, 30.0F, 1000.0F, 30));
		this.setUnlocalizedName("bgsword");
		this.setCreativeTab(bgtab.bgtab);
		System.out.println(this.getItemEnchantability()+"------------------------------------------------sword");
		// TODO �Զ����ɵĹ��캯�����
	}

}
