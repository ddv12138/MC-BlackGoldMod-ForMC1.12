package ddv12138.BlackGold.common.tab;

import ddv12138.BlackGold.common.item.Itemloader;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class bgtab extends CreativeTabs{
	public static bgtab bgtab = new bgtab();
	public bgtab() {
		super("BlackGold");
		//启用或关闭mod工具页面的背景图片
		//this.setBackgroundImageName("tabbackground.png");
	}
	@Override
	public ItemStack getTabIconItem() {
		// TODO 自动生成的方法存根
		return new ItemStack(Itemloader.itemBGpickaxe);
	}
}
