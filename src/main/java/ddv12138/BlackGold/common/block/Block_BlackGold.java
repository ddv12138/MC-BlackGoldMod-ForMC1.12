package ddv12138.BlackGold.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Block_BlackGold extends Block{

	public Block_BlackGold() {
		// TODO 自动生成的构造函数存根
		super(Material.ROCK);
		this.setSoundType(blockSoundType.STONE);
		this.setHardness(30.0f);
		this.setHarvestLevel("pickaxe", 3);
	}

}
