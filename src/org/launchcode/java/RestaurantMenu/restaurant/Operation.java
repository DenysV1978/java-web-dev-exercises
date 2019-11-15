package org.launchcode.java.RestaurantMenu.restaurant;

import java.util.HashMap;
import java.util.Map;

public class Operation {

    public static void main(String[] args) {

        MenuItem menuItem1 = new MenuItem();
        menuItem1.MenuItem("Tomato soup", "soup from tomatoes", "Soups", 5.00, true, "11/14/2019");

        Menu menuNovember = new Menu();
        menuNovember.Menu(1, menuItem1);





        System.out.println("Stop");
    }
}
