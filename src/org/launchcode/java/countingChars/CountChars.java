package org.launchcode.java.countingChars;

import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;



public class CountChars {
    public static void main(String[] args) {

        //create String to count Chars;
        String searchString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        //create HasMap variable
        HashMap<String, Integer> result = new HashMap<>();
        // convert String to Array of chars
        String[] searchArrString = searchString.split("");

        //System.out.println(Arrays.toString(searchArrString));

        for(int i=0; i<searchArrString.length; i++) {
            if(!result.containsKey(searchArrString[i])) {

                String keyChar = searchArrString[i];
                result.put(keyChar,0);
            }
        }

        HashMap<String, Integer> finalResult = new HashMap<>();

        //System.out.println(result.keySet());

        for(String entry: result.keySet()) {
            int sum = 0;
            for(int j=0; j<searchArrString.length; j++) {

                if(entry.equals(searchArrString[j])) {
                    sum=sum+1;
                    //System.out.println(sum);
                }
            }

            finalResult.put(entry, sum);
        }


        //System.out.println(result);

        //System.out.println("FinalResult" + finalResult);


    }


}
