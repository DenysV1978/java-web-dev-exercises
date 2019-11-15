package org.launchcode.java.RestaurantMenu.restaurant;

import java.util.HashMap;
import java.util.Map;

public class Menu {

    private HashMap<Integer, Object> menuList = new HashMap<>();


    public void Menu(int number, Object menuItem) {

        menuList.put(number, menuItem);

    };


}
