package WolfShotz.Wyrmroost.client.render.entity.dragon_fruit;

import WolfShotz.Wyrmroost.Wyrmroost;
import WolfShotz.Wyrmroost.client.render.entity.AbstractDragonRenderer;
import WolfShotz.Wyrmroost.entities.dragon.DragonFruitDrakeEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class DragonFruitDrakeRenderer extends AbstractDragonRenderer<DragonFruitDrakeEntity, DragonFruitDrakeModel>
{
    public static final ResourceLocation CHILD = resource("child.png");
    private static final ResourceLocation[] TEXTURES = new ResourceLocation[4];

    public DragonFruitDrakeRenderer(EntityRendererManager manager)
    {
        super(manager, new DragonFruitDrakeModel(), 1.15f);
    }

    @Nullable
    @Override
    public ResourceLocation getEntityTexture(DragonFruitDrakeEntity entity)
    {
        if (entity.isChild()) return CHILD;

        int texture = entity.isMale()? 0 : 2;
        if (entity.getVariant() == -1) texture += 1;
        if (TEXTURES[texture] == null)
        {
            String path = entity.isMale()? "male" : "female";
            if (entity.getVariant() == -1) path += "_s";
            return TEXTURES[texture] = resource(path + ".png");
        }
        return TEXTURES[texture];
    }

    public static ResourceLocation resource(String png) { return Wyrmroost.rl(BASE_PATH + "dragon_fruit_drake/" + png); }
}
