package eyeq.spreadfertilizer;

import eyeq.spreadfertilizer.event.SpreadFertilizerEventHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import static eyeq.spreadfertilizer.SpreadFertilizer.MOD_ID;

@Mod(modid = MOD_ID, version = "1.0", dependencies = "after:eyeq_util")
public class SpreadFertilizer {
    public static final String MOD_ID = "eyeq_spreadfertilizer";

    @Mod.Instance(MOD_ID)
    public static SpreadFertilizer instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new SpreadFertilizerEventHandler());
    }
}
