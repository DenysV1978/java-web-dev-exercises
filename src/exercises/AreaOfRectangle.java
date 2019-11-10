package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        int side;

        Scanner input = new Scanner(System.in);
        System.out.println("Hello. What is the size of your rectangular (input only integer)?");
        side = input.nextInt();
        input.close();

        int area = side*side;

        System.out.println("The area of your rectangular is " +area);



    }
}
