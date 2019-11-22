package org.launchcode.java.RestaurantMenu.restaurant;

import java.util.HashMap;
import java.util.Map;

public class Menu {

    private HashMap<Integer, MenuItem> menuList = new HashMap<>();


    public void Menu(int number, MenuItem menuItem) {

        menuList.put(number, menuItem);

    };

    public void removeMenuItem(String menuItemName) {

        for(Map.Entry<Integer, MenuItem> item : this.menuList.entrySet()) {

            String itemToBeDeleted;
            MenuItem menuItemSearched = new MenuItem();
            menuItemSearched = item.getValue();

            itemToBeDeleted = menuItemSearched.getMenuItemName();

            if(menuItemName == itemToBeDeleted) {
                Object key;
                key = item.getKey();
                this.menuList.remove(key);

            }
        };

    };

    public void getItems() {

        for(MenuItem item : this.menuList.values()) {

            System.out.println(item.getMenuItemName() + "\t" + item.getMenuItemCategory());
        };

    };

    public void getItems2() {



        for (Map.Entry<Integer, MenuItem> item : this.menuList.entrySet()) {

            System.out.println(item.getValue().getMenuItemName() + "\t" + item.getValue().getMenuItemCategory());
        };


    };

    public void checkIfMenuItemIsNew(String menuItemName) {



        for(Map.Entry<Integer, MenuItem> item : this.menuList.entrySet()) {

            MenuItem menuItemToBeSearched = new MenuItem();
            menuItemToBeSearched = item.getValue();

            String menuItemToBeChecked = menuItemToBeSearched.getMenuItemName();


            if(menuItemName == menuItemToBeChecked) {
                if(menuItemToBeSearched.getMenuItemIsNew()) {
                    System.out.println(menuItemName + " is new item in the menu list.");
                } else {
                    System.out.println(menuItemName + " is NOT new item in the menu list.");
                };



            } else {
                System.out.println("This item is not in the menu list");
            }
        }
    }





}
