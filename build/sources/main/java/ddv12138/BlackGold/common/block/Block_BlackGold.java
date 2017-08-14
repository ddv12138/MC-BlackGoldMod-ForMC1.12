package ddv12138.BlackGold.common.block;

import ddv12138.BlackGold.common.tab.bgtab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Block_BlackGold extends Block{

	public Block_BlackGold() {
		// TODO �Զ����ɵĹ��캯�����
		super(Material.ROCK);
		this.setSoundType(blockSoundType.STONE);
		this.setHardness(30.0f);
		this.setHarvestLevel("pickaxe", 3);
		this.setCreativeTab(bgtab.bgtab);
	}

}
