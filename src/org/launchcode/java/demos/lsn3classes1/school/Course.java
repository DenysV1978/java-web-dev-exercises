package org.launchcode.java.demos.lsn3classes1.school;

import org.launchcode.java.demos.lsn3classes1.Student;

import java.util.HashMap;
import java.util.Objects;

public class Course {

    private String nameOfCourse;
    private String nameOfProfessor;
    private Object teacher;
    private HashMap<Integer, Object> listOfStudents = new HashMap<>();

    public void setNameOfProfessor(String aNameOfProfessor) {
        nameOfProfessor = aNameOfProfessor;
    };
    public void setNameOfCourse(String aNameOfCourse) {
        nameOfCourse = aNameOfCourse;
    };
    public String getNameOfProfessor() {
        return nameOfProfessor;
    };
    public String getNameOfCourse() {
        return nameOfCourse;


    };

    public void Course(String nameOfCourse, String nameOfProfessor, int number, String name, int studentId, int numberOfCredits, double gpa) {
        this.nameOfCourse = nameOfCourse;
        this.nameOfProfessor = nameOfProfessor;
        Student studentToAdd = new Student();
        studentToAdd.Student(name, studentId, numberOfCredits, gpa);

        listOfStudents.put(number, studentToAdd);

    }



    public void Course(String nameOfCourse, String nameOfProfessor, int number, Object studentToAdd) {
        this.nameOfCourse = nameOfCourse;
        this.nameOfProfessor = nameOfProfessor;
        listOfStudents.put(number, studentToAdd);
    };

    public void Course(String nameOfCourse, Object teacher, int number, Object studentToAdd) {
        this.nameOfCourse = nameOfCourse;
        this.teacher = teacher;
        listOfStudents.put(number, studentToAdd);

    };


}

