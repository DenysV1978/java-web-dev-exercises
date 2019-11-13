package exercises.controlFlowAndCollections;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer> intList = new ArrayList<>();

        intList.add(1);
        intList.add(3);
        intList.add(4);
        intList.add(15);
        intList.add(34);
        intList.add(150);
        intList.add(81);
        intList.add(24);
        intList.add(49);
        intList.add(50);

        ArrayList<Integer> evenList = new ArrayList<>();
        int sum=0;

        for(int i=0; i<intList.size(); i++) {
            if(intList.get(i)%2==0) {
                evenList.add(intList.get(i));
                sum+=intList.get(i);
            }
        };




        System.out.println(evenList);
        System.out.println(sum);



    }
}
