package io.github.bnmosria.pigdance.Init;

import io.github.bnmosria.pigdance.Entity.DancingPigEntity;
import io.github.bnmosria.pigdance.PigDance;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class EntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, PigDance.MODID);
    public static final String DANCING_PIG_NAME = "dancing_pig";
    public static final RegistryObject<EntityType<DancingPigEntity>> DANCING_PIG = ENTITY_TYPES.register(DANCING_PIG_NAME, () ->
            EntityType.Builder.<DancingPigEntity>create(DancingPigEntity::new, EntityClassification.CREATURE)
                    .size(EntityType.PIG.getWidth(), EntityType.PIG.getHeight())
                    .build(new ResourceLocation(PigDance.MODID, DANCING_PIG_NAME).toString())
    );
}