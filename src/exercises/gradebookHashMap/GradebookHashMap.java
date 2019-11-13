package exercises.gradebookHashMap;

import java.util.Scanner;
import java.util.HashMap;


public class GradebookHashMap {
    public static void main(String[] args) {
        HashMap<String, String> students = new HashMap<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your students");
        String newStudent;

        do {
           System.out.println("input student ID");
           newStudent = input.nextLine();

           if(!newStudent.equals("")) {
               System.out.println("Input student`s name");
               String newName = input.nextLine();
               students.put(newStudent, newName);
               input.nextLine();
           }

        } while(!newStudent.equals(""));

        System.out.println(students);
    }
}
