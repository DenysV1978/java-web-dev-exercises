package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        int milesDriven;
        int gallonsSpent;

        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        milesDriven = input.nextInt();
        System.out.println("How many gallons has been spent?");
        gallonsSpent = input.nextInt();
        input.close();

        int milesPerGallon = milesDriven/gallonsSpent;

        System.out.println("The consumption of your car is " + milesPerGallon + " miles per gallon");
    }
}
