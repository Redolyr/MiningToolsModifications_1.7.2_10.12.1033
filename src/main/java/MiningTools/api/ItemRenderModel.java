package MiningTools.api;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

public abstract class ItemRenderModel implements IItemRenderer
{
    public static boolean ThreeDModel = true;
    protected ModelBase modeling;
    public ItemRenderModel(Boolean on_off, ModelBase models)
    {
        modeling = models;
        ThreeDModel = on_off;
    }
    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type)
    {
        return MainAPI.Instance().handleRenderType_Rendering(true, ThreeDModel, type);
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper)
    {
        return false;
    }
    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data)
    {
        MainAPI.Instance().ENTITY_Rendering(ThreeDModel, type, 2.5F, 0F, 8F, 125F, -10.0F, 0.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, 0.0F, -10.0F, -0.304800F, -0.500F, -0.09F, "textures/models/ModelItemMiningTools.png", modeling, (Entity) data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
        MainAPI.Instance().EQUIPPED_Rendering(ThreeDModel, type, 2.5F, 0F, 8F, 125F, -10.0F, 0.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, 0.0F, -10.0F, -0.304800F, -0.500F, -0.09F, "textures/models/ModelItemMiningTools.png", modeling, (Entity) data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
        MainAPI.Instance().EQUIPPED_FIRST_PERSON_Rendering(ThreeDModel, type, 2.5F, 0F, 8F, 125F, -10.0F, 0.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, 0.0F, -10.0F, -0.304800F, -0.500F, -0.09F, "textures/models/ModelItemMiningTools.png", modeling, (Entity) data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
    }
}