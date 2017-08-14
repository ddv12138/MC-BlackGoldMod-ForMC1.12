package ddv12138.BlackGold.common.tab;

import ddv12138.BlackGold.common.item.Itemloader;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class bgtab extends CreativeTabs{
	public static bgtab bgtab = new bgtab();
	public bgtab() {
		super("BlackGold");
		//���û�ر�mod����ҳ��ı���ͼƬ
		//this.setBackgroundImageName("tabbackground.png");
	}
	@Override
	public ItemStack getTabIconItem() {
		// TODO �Զ����ɵķ������
		return new ItemStack(Itemloader.itemBGpickaxe);
	}
}
