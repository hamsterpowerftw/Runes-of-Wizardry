package com.zpig333.runesofwizardry.dusts;

import com.zpig333.runesofwizardry.api.IDust;
import com.zpig333.runesofwizardry.core.References;
import com.zpig333.runesofwizardry.core.WizardryRegistry;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RWDusts {

    public class DustInert extends IDust {
        public DustInert(){
            super();
        }
        @Override
        public String getDustName() {
            return "inert";
        }

        @Override
        public int getPrimaryColor() {
            return 0xE5E6E8;
        }

        @Override
        public int getSecondaryColor() {
            return 0xC5C6C8;
        }
        @Override
        public void registerIcons(IIconRegister ireg){
            this.itemIcon=ireg.registerIcon(References.texture_path+"dust_inert");
        }

        @Override
        public ItemStack getInfusionItem() {
            //TODO auto-generated method: getInfusionItem
            throw new UnsupportedOperationException("Not supported yet: getInfusionItem");
        }
    }

    public class DustPlant extends IDust {
        public DustPlant(){
            super();
        }
        @Override
        public String getDustName() {
            return "plant";
        }

        @Override
        public int getPrimaryColor() {
            return 0x068F08;
        }

        @Override
        public int getSecondaryColor() {
            return 0x045C05;
        }
       /* @Override
        public void registerIcons(IIconRegister ireg){
            this.itemIcon=ireg.registerIcon(References.texture_path+"dust_plant");
        }
        */
        @Override
        public ItemStack getInfusionItem() {
            return new ItemStack(WizardryRegistry.plant_balls, 1, 1);
        }
    }

    public class DustAqua extends IDust {
        @Override
        public String getDustName() {
            return "aqua";
        }
        public DustAqua(){
            super();
        }
        @Override
        public int getPrimaryColor() {
            return 0x32A3FF;
        }

        @Override
        public int getSecondaryColor() {
            return 0x96D1FF;
        }
        @Override
        public void registerIcons(IIconRegister ireg){
            this.itemIcon=ireg.registerIcon(References.texture_path+"dust_aqua");
        }
        @Override
        public ItemStack getInfusionItem() {
            //TODO auto-generated method: getInfusionItem
            throw new UnsupportedOperationException("Not supported yet: getInfusionItem");
        }
    }

    public class DustBlaze extends IDust{
        public DustBlaze(){
            super();
        }
        @Override
        public String getDustName() {
            return "fire";
        }

        @Override
        public int getPrimaryColor() {
            return 0xEA8A00;
        }

        @Override
        public int getSecondaryColor() {
            return 0xFFFE31;
        }

        @Override
        public int getPlacedColor() {
            return 0xFF6E1E;
        }
        @Override
        public void registerIcons(IIconRegister ireg){
            this.itemIcon=ireg.registerIcon(References.texture_path+"dust_flame");
        }
        @Override
        public ItemStack getInfusionItem() {
            return new ItemStack(WizardryRegistry.lavastone,1);
        }
    }

    public class DustGlowstone extends IDust {
        public DustGlowstone(){
            super();
        }
        @Override
        public String getDustName() {
            return "glowstone";
        }

        @Override
        public int getPrimaryColor() {
            return 0xD2D200;
        }

        @Override
        public int getSecondaryColor() {
            return 0x868600;
        }

        @Override
        public int getPlacedColor() {
            return 0xD2D200;
        }
        @Override
        public void registerIcons(IIconRegister ireg){
            this.itemIcon=ireg.registerIcon(References.texture_path+"dust_glowstone");
        }
        @Override
        public ItemStack getInfusionItem() {
            //TODO auto-generated method: getInfusionItem
            throw new UnsupportedOperationException("Not supported yet: getInfusionItem");
        }
    }

    public class DustEnder extends IDust {
        public DustEnder(){
            super();
        }
        @Override
        public String getDustName() {
            return "ender";
        }

        @Override
        public int getPrimaryColor() {
            return 0x105E51;
        }

        @Override
        public int getSecondaryColor() {
            return 0x0B4D42;
        }

        @Override
        public int getPlacedColor() {
            return 0x0B4D42;
        }
        @Override
        public void registerIcons(IIconRegister ireg){
            this.itemIcon=ireg.registerIcon(References.texture_path+"dust_ender");
        }
        @Override
        public ItemStack getInfusionItem() {
            //TODO auto-generated method: getInfusionItem
            throw new UnsupportedOperationException("Not supported yet: getInfusionItem");
        }
    }

}
