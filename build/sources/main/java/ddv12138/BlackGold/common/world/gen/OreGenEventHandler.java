package ddv12138.BlackGold.common.world.gen;

import ddv12138.BlackGold.common.block.BlockLoader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.event.terraingen.TerrainGen;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class OreGenEventHandler {
	private static WorldGenerator GenBGblock = new WorldGenMinable(BlockLoader.blockbg.getDefaultState(), 10);
	public static void init() {
		MinecraftForge.ORE_GEN_BUS.register(OreGenEventHandler.class);
	}
	@SubscribeEvent
	public static void onGenerateMinable(OreGenEvent.GenerateMinable event) {
		if (event.getType() != OreGenEvent.GenerateMinable.EventType.IRON)
	        return;

	    if (!TerrainGen.generateOre(event.getWorld(), event.getRand(), GenBGblock, event.getPos(), OreGenEvent.GenerateMinable.EventType.CUSTOM))
	        return;

	    for (int i = 0; i < 5; i++)
	    {
	        int posX = event.getPos().getX() + event.getRand().nextInt(16);
	        int posY = 50 + event.getRand().nextInt(16);
	        int posZ = event.getPos().getZ() + event.getRand().nextInt(16);
	        BlockPos blockpos = new BlockPos(posX, posY, posZ);
	        GenBGblock.generate(event.getWorld(), event.getRand(), blockpos);
	        System.out.println(posX+"--"+posY+"--"+posZ+"������----------------------");
	    }
	}
}
