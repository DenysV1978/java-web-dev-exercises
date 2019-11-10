package exercises;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        String response;

        Scanner input = new Scanner(System.in);
        System.out.println("Hello, what is your name?");
        response = input.nextLine();
        input.close();

        System.out.println("Hello, " + response + "!");
    }

}
