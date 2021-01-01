package io.github.bnmosria.pigdance.Client.Render;

import io.github.bnmosria.pigdance.Client.Render.Entity.Model.DancingPigModel;
import io.github.bnmosria.pigdance.Entity.DancingPigEntity;
import io.github.bnmosria.pigdance.PigDance;
import net.minecraft.client.renderer.entity.layers.SaddleLayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import javax.annotation.Nullable;

@OnlyIn(Dist.CLIENT)
public class DancingPigRenderer extends MobRenderer<DancingPigEntity, DancingPigModel<DancingPigEntity>> {
    private static final ResourceLocation DANCING_PIG_TEXTURES = new ResourceLocation(PigDance.MODID, "textures/entity/dancing_pig/dancing_pig.png");

    public DancingPigRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new DancingPigModel<>(), 0.7F);
        this.addLayer(new SaddleLayer<>(this, new DancingPigModel<>(0.5F), new ResourceLocation(PigDance.MODID, "textures/entity/dancing_pig/dancing_pig_saddle.png")));
    }

    @Nullable
    @Override
    public ResourceLocation getEntityTexture(DancingPigEntity entity) {
        return DANCING_PIG_TEXTURES;
    }
}