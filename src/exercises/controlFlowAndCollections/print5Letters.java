package exercises.controlFlowAndCollections;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class print5Letters {
    public static void main(String[] args) {
        List<String> listOfWords = new ArrayList<>();

        String poem = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] splitStringArray = poem.split(" ");
        System.out.println(Arrays.toString(splitStringArray));

        listOfWords = Arrays.asList(splitStringArray);
        System.out.println(listOfWords);

        Scanner input = new Scanner(System.in);
        System.out.println("Input how many letters you want to search in the Array List?");
        int howManyLetters;
        howManyLetters = input.nextInt();

        for(int i=0; i<listOfWords.size(); i++) {
            if(listOfWords.get(i).length()==howManyLetters) {
                System.out.println(listOfWords.get(i));
            }
        }
    }
}
