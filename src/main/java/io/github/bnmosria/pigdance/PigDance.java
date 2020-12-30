package io.github.bnmosria.pigdance;

import io.github.bnmosria.pigdance.Entity.DancingPigEntity;
import io.github.bnmosria.pigdance.Init.EntityTypes;
import io.github.bnmosria.pigdance.Init.ModItems;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(PigDance.MODID)
public class PigDance {
    public static final String MODID = "pigdancemod";

    public PigDance() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        ModItems.ITEMS.register(modEventBus);
        EntityTypes.ENTITY_TYPES.register(modEventBus);
    }

    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            GlobalEntityTypeAttributes.put(EntityTypes.DANCING_PIG.get(), DancingPigEntity.setCustomAttributes().create());
        });
    }
}
