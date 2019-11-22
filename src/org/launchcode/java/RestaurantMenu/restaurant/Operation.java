package org.launchcode.java.RestaurantMenu.restaurant;

import java.util.HashMap;
import java.util.Map;

public class Operation {

    public static void main(String[] args) {

        MenuItem menuItem1 = new MenuItem();
        MenuItem menuItem2 = new MenuItem();
        menuItem1.MenuItem("Tomato soup", "soup from tomatoes", "Soups", 5.00, true, "11/14/2019");
        menuItem2.MenuItem("Potato soup", "soup from potatoes", "Soups", 5.00, true, "11/14/2019");

        Menu menuNovember = new Menu();
        menuNovember.Menu(1, menuItem1);
        menuNovember.Menu(2,menuItem2);

        //menuNovember.getItems();
        menuNovember.getItems2();

        //menuNovember.remove(1)

        menuNovember.removeMenuItem("Potato soup");

        menuNovember.getItems2();

        //menuNovember.Menu(1, new MenuItem());



        System.out.println("Stop");
    }
}
