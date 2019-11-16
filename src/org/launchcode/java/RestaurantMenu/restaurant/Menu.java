package org.launchcode.java.RestaurantMenu.restaurant;

import java.util.HashMap;
import java.util.Map;

public class Menu {

    private HashMap<Integer, MenuItem> menuList = new HashMap<>();


    public void Menu(int number, MenuItem menuItem) {

        menuList.put(number, menuItem);

    };

    public void getItems() {

        for(MenuItem item : this.menuList.values()) {

            System.out.println(item.getMenuItemName() + "\t" + item.getMenuItemCategory());
        };

    };

    public void getItems2() {

        for (Map.Entry<Integer, MenuItem> item : this.menuList.entrySet()) {

            System.out.println(item.getValue().getMenuItemName() + "\t" + item.getValue().getMenuItemCategory());
        }
        ;

    }



}
