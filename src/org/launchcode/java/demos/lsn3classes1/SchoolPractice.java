package org.launchcode.java.demos.lsn3classes1;

import org.launchcode.java.demos.lsn3classes1.school.Course;
import org.launchcode.java.demos.lsn3classes1.school.Teacher;

import java.util.Objects;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!

        //here I am using setters and getters to create Student object and assign values
        Student denysV = new Student();
        denysV.setName("Denys Vashchenko");
        denysV.setStudentId(12345);
        denysV.setGpa(4.0);
        denysV.setNumberOfCredits(1);

        // here I am using constructor in Student to assign values
        Student olgaV = new Student();
        olgaV.Student("Olga Vashchenko", 5678, 1, 3.5);



        //System.out.println("Stop");

        Course math = new Course();

        //here I am using constructor to create Student and assign it to ArrayList (Course) using one step
        math.Course("math", "peter", 1, "denys vashchenko", 222, 1, 4);


        // here I am using another constructor where you use object Student and create item in ArrayList...
        math.Course("math", "peter", 2, olgaV);

        Teacher calculusTeacher = new Teacher();
        calculusTeacher.Teacher("Peter Johnson", "Calculus", 15);
        Course calculus = new Course();
        calculus.Course("Calculus", calculusTeacher, 1, denysV);








        System.out.println("Stop");


    }
}



