package ddv12138.BlackGold.client;

import ddv12138.BlackGold.common.CommonProxy;
import ddv12138.BlackGold.common.block.BlockLoader;
import ddv12138.BlackGold.common.item.Itemloader;
import ddv12138.BlackGold.common.world.gen.OreGenEventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{
	public void preInit(FMLPreInitializationEvent event)
    {
        super.preInit(event);
        Itemloader.clientInit();
        BlockLoader.clientInit();
    }

    public void init(FMLInitializationEvent event)
    {
        super.init(event);
        OreGenEventHandler.init();
    }
}
