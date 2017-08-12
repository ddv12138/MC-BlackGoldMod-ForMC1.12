package ddv12138.BlackGold;

import ddv12138.BlackGold.common.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = BlackGold.MODID, name=BlackGold.NAME, version=BlackGold.VERSION)
public class BlackGold {
	public static final String MODID = "blackgold";
    public static final String NAME = "blackgold";
    public static final String VERSION = "0.2";
    
    @SidedProxy(clientSide = "ddv12138.BlackGold.client.ClientProxy", serverSide = "ddv12138.BlackGold.common.CommonProxy")
    public static CommonProxy proxy;
    
    @Instance(MODID)
    public static BlackGold instance;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
    	proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event){
    	proxy.init(event);
    }
}
