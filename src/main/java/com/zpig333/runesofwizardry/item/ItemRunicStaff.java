package com.zpig333.runesofwizardry.item;


public class ItemRunicStaff extends WizardryItem {
	private final String name = "runic_staff";
    public ItemRunicStaff(){
    	super();
        this.setMaxDamage(50);
    }
    public String getName(){
    	return name;
    }
}
