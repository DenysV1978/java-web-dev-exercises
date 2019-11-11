package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input the radius of your circle:");
        double radius = input.nextFloat();
        input.close();

        double areaCalculated = Circle.getArea(radius);
        System.out.println(areaCalculated);
    }
}
