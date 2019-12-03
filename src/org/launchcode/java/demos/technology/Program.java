package org.launchcode.java.demos.technology;

public class Program {
    public static void main(String[] args) {
        //Computer computer1 = new Computer(); //as you see when we switched Computer to abstract, IntelliJ does not want to create  instance of computer
        //System.out.println(computer1);

        LapTop lapTop1 = new LapTop();
        System.out.println(lapTop1); // here I see that default constructors from parent and child are merged!!!
        System.out.println(lapTop1.getNameOwner()); // here we see how getters were inherited by child lapTop1 from parent Computer
        System.out.println(lapTop1.message());

        LapTop lapTop2 = new LapTop("Olga", "JJJ", 3.00, true, "big");
        System.out.println(lapTop2);

        LapTop lapTop3 = new LapTop("Dasha");
        System.out.println(lapTop3.sayGoodby());


        System.out.println("Stop");
    }
}
