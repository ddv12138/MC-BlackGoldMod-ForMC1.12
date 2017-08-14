package ddv12138.BlackGold.common;

import ddv12138.BlackGold.common.block.BlockLoader;
import ddv12138.BlackGold.common.item.Itemloader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
	public void preInit(FMLPreInitializationEvent event) {
		Itemloader.init();
		BlockLoader.init();
		Itemloader.addSmelting();
    }

    public void init(FMLInitializationEvent event)
    {

    }
}
