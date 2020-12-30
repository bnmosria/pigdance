package io.github.bnmosria.pigdance.Client.Render.Entity.Model;

import net.minecraft.client.renderer.entity.model.PigModel;
import net.minecraft.entity.passive.PigEntity;

public class DancingPigModel<T extends PigEntity> extends PigModel<T> {
    public DancingPigModel() {
        super();
    }

    public DancingPigModel(float scale) {
        super(scale);
    }
}
