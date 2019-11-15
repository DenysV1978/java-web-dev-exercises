package org.launchcode.java.RestaurantMenu.restaurant;

import java.util.Date;

public class MenuItem {

    private String menuItemName;
    private String menuItemDescription;
    private String menuItemCategory;
    private Double menuItemPrice;
    private Boolean menuItemIsNew;
    private String updateOfMenuItem;


    public void MenuItem(String menuItemName, String menuItemDescription, String menuItemCategory, Double menuItemPrice, Boolean menuItemIsNew, String updateOfMenuItem) {

        this.menuItemName = menuItemName;
        this.menuItemDescription = menuItemDescription;
        this.menuItemCategory = menuItemCategory;
        this.menuItemPrice = menuItemPrice;
        this.menuItemIsNew = menuItemIsNew;
        this.updateOfMenuItem = updateOfMenuItem;


    }


    public String getMenuItemName() {
        return menuItemName;
    }

    public void setMenuItemName(String menuItemName) {
        this.menuItemName = menuItemName;
    }

    public String getMenuItemDescription() {
        return menuItemDescription;
    }

    public void setMenuItemDescription(String menuItemDescription) {
        this.menuItemDescription = menuItemDescription;
    }

    public String getMenuItemCategory() {
        return menuItemCategory;
    }

    public void setMenuItemCategory(String menuItemCategory) {
        this.menuItemCategory = menuItemCategory;
    }

    public Double getMenuItemPrice() {
        return menuItemPrice;
    }

    public void setMenuItemPrice(Double menuItemPrice) {
        this.menuItemPrice = menuItemPrice;
    }

    public Boolean getMenuItemIsNew() {
        return menuItemIsNew;
    }

    public void setMenuItemIsNew(Boolean menuItemIsNew) {
        this.menuItemIsNew = menuItemIsNew;
    }

    public Object getUpdateOfMenuItem() {
        return updateOfMenuItem;
    }

    public void setUpdateOfMenuItem(String updateOfMenuItem) {
        this.updateOfMenuItem = updateOfMenuItem;
    }
}
