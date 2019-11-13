package exercises.controlFlowAndCollections;

import java.util.Arrays;
import java.util.Scanner;

public class arrayPlayWith {
    public static void main(String[] args) {


        int[] someArray = {1,1,2,3,5,8};

        for(int i=0; i<someArray.length; i++) {
            if(someArray[i]%2!=0) {
                System.out.println(someArray[i]);
            };
        }


        //System.out.println(Arrays.toString(someArray));
    }
}
