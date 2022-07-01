package net.diamonc.arthmobs;
import net.diamonc.arthmobs.entity.client.RaccoonRenderer;
import net.diamonc.arthmobs.entity.ModEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class ArthMobsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.RACCOON, RaccoonRenderer::new);
    }
}
