package io.github.bnmosria.pigdance.Client;

import io.github.bnmosria.pigdance.Client.Render.DancingPigRenderer;
import io.github.bnmosria.pigdance.Init.EntityTypes;
import io.github.bnmosria.pigdance.PigDance;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@EventBusSubscriber(modid = PigDance.MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public final class ClientModEventSubscriber {
	private static final Logger LOGGER = LogManager.getLogger(PigDance.MODID + " Client Mod Event Subscriber");

	@SubscribeEvent
	public static void onFMLClientSetupEvent(final FMLClientSetupEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(EntityTypes.DANCING_PIG.get(), DancingPigRenderer::new);
		LOGGER.debug("Registered Entity Renderers");
	}
}
