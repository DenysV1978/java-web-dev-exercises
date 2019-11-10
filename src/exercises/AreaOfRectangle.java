package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        float length;
        float width;

        Scanner input = new Scanner(System.in);
        System.out.println("Hello. What is the length of your rectangular?");
        length = input.nextFloat();
        System.out.println("Hello. What is the width of your rectangular?");
        width = input.nextFloat();
        input.close();

        float area = length*width;

        System.out.println("The area of your rectangular is " +area);



    }
}
