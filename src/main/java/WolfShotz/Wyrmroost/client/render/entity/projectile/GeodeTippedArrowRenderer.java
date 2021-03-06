package WolfShotz.Wyrmroost.client.render.entity.projectile;

import WolfShotz.Wyrmroost.Wyrmroost;
import WolfShotz.Wyrmroost.entities.projectile.GeodeTippedArrowEntity;
import WolfShotz.Wyrmroost.registry.WRItems;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class GeodeTippedArrowRenderer extends ArrowRenderer<GeodeTippedArrowEntity>
{
    private static final ResourceLocation BLUE = Wyrmroost.rl("textures/entity/projectiles/arrow/blue_geode_tipped_arrow.png");
    private static final ResourceLocation RED = Wyrmroost.rl("textures/entity/projectiles/arrow/red_geode_tipped_arrow.png");
    private static final ResourceLocation PURPLE = Wyrmroost.rl("textures/entity/projectiles/arrow/purple_geode_tipped_arrow.png");

    public GeodeTippedArrowRenderer(EntityRendererManager renderManagerIn)
    {
        super(renderManagerIn);
    }

    @Override
    public ResourceLocation getEntityTexture(GeodeTippedArrowEntity entity)
    {
        Item item = entity.getItem();
        if (item == WRItems.RED_GEODE_ARROW.get()) return RED;
        else if (item == WRItems.PURPLE_GEODE_ARROW.get()) return PURPLE;
        return BLUE;
    }
}
