package co.uk.silvania.cities.econ.items;

import co.uk.silvania.cities.econ.FlenixCities_Econ;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemNote20 extends ItemNote {

	public ItemNote20(int id) {
		super(id);
		this.setCreativeTab(FlenixCities_Econ.tabEcon);
		this.setMaxStackSize(50);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon("flenixcities:Note2000");
	}
	
    @Override
    public double getMoneyValue() {
        return 20.00;
    }
}
