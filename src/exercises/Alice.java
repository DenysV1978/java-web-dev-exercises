package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String alice="Alice was beginning to get very tired of sitting by her sister on the bank,\n and of having nothing to do: once or twice she had peeped into the book her\n sister was reading, but it had no pictures or conversations in it, 'and what\n is the use of a book,' thought Alice 'without pictures or conversation?'";
        //System.out.println(alice);

        Scanner input = new Scanner(System.in);
        System.out.println("Input string you want to search at Alice paragraph, please");
        String search = input.nextLine();
        input.close();

        String lowerCaseSearch = search.toLowerCase();
        String lowerCaseAlice = alice.toLowerCase();

        //System.out.println(lowerCaseAlice);
        //System.out.println(lowerCaseSearch);

        Boolean searchResult = lowerCaseAlice.contains(lowerCaseSearch);

        System.out.println("Alice has search string in it: " + searchResult);

    }
}
