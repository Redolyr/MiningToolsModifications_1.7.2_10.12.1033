package MiningTools.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import MiningTools.MiningTools;
import MiningTools.Others.Proxy;

/**
 *
 * This Class [#link BlockPacks] This Mod Contianer Link Master Class
 * is BlockPacks Link Block Data Container Link is Others Class This Mod Block Class Extendsments
 *
 * @author Redolyr75724
 *
 */
public class BlockPacks extends Block
{
    public Block blocks;
    protected static Material material;
    
    public BlockPacks(Material par2Material, String par1Str, String par2Str, float par3Flo, float par4Flo, float par5Flo, int par6Int)
    {
    	super(par2Material.rock);
    	if (Proxy.proxy.Config().GameRegistItem1 == true)
    		this.setCreativeTab(MiningTools.tabsMiningTools);
    	else
    		this.setCreativeTab(CreativeTabs.tabCombat);
        this.setData(par1Str, par1Str, par3Flo, par4Flo, par5Flo, par6Int);
        Proxy.proxy.registerBlock(this, replace(this));
    }
    public Block setData(String par1Str, String par2Str, float par3Flo, float par4Flo, float par5Flo, int par6Int)
    {
        blocks = setBlockName(par2Str);
        //textureName = par1Str + ":" + par2Str;
        textureName = par1Str + par2Str;
        blockHardness = par3Flo;
        lightValue = (int)(15.0F * par4Flo);
        blockResistance = par5Flo;
        lightOpacity = par6Int;
        return this;
    }
    public Block setData(String par1Str, String par2Str, float par3Flo, float par4Flo, float par5Flo, int par6Int, boolean par7EnableDisableStates)
    {
        blocks = setBlockName(par2Str);
        textureName = par1Str + par2Str;
        blockHardness = par3Flo;
        lightValue = (int)(15.0F * par4Flo);
        blockResistance = par5Flo;
        lightOpacity = par6Int;
        enableStats = par7EnableDisableStates;
        return this;
    }
    public Block setData(String par1Str, String par2Str)
    {
        blocks = setBlockName(par2Str);
        textureName = par1Str + par2Str;
        return this;
    }
    public Block setData(float par3Flo, float par4Flo, float par5Flo, int par6Int)
    {
        blockHardness = par3Flo;
        lightValue = (int)(15.0F * par4Flo);
        blockResistance = par5Flo;
        lightOpacity = par6Int;
        return this;
    }
    public Block getBlock()
    {
        return blocks;
    }
    public Material setMaterial(Material material)
    {
        return this.material = material;
    }
    public final String replace(BlockPacks blockPacks)
    {
    	return blockPacks.getUnlocalizedName().replace("tile.", "").replace(".name", "");
    }
//    @Override
//    public Block setCreativeTab(CreativeTabs tabDisplays)
//    {
//    	tabDisplays = MiningTools.tabsMiningTools;
//    	return this;
//    }
}
