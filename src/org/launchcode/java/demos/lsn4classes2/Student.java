package org.launchcode.java.demos.lsn4classes2;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;
    private String gradeLevel = null;

    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }


     //TODO: Uncomment and complete the getGradeLevel method here:
    public String getGradeLevel() {

        if(this.numberOfCredits<=30) {
            this.gradeLevel = "Freshman";
        } else if(this.numberOfCredits>30 && this.numberOfCredits<=59) {
            this.gradeLevel = "Sophmore";
        } else if(this.numberOfCredits>60 && this.numberOfCredits<=89) {
            this.gradeLevel = "Junior";
        } else {
            this.gradeLevel = "Senior";
        }
        return this.gradeLevel;
    };

//        // Determine the grade level of the student based on numberOfCredits
//    }

    // TODO: Complete the addGrade method.
    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
        double newQualityScore = grade * courseCredits;
        double oldQualityScore = this.gpa * this.numberOfCredits;
        double newTotalQualityScore = newQualityScore + oldQualityScore;
        this.numberOfCredits = this.numberOfCredits + courseCredits;
        this.gpa = newTotalQualityScore / this.numberOfCredits;
    };



    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather
    //  than just the class fields.

    public String toString() {
        return "Student " + this.name + " has ID number " + this.studentId + ". The number of credits taken is " + this.numberOfCredits + " with GPA " + this.gpa + ". Sally is " + this.gradeLevel + ".";
    };


    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Student objects equal.

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public static void main(String[] args) {
        Student sally = new Student("Sally",1,1,4.0);

        //getGradeLevel has not been applied yet. So, it should say Null
        System.out.println(sally);

        sally.getGradeLevel();
        //now it should show calculated gradeLevel
        System.out.println(sally);

        System.out.println("The Student class works! " + sally.getName() + " is a student!");
        System.out.println(" Sally`s old GPA is: " + sally.getGpa());
        System.out.println("Sally`s number of credits received: " + sally.getNumberOfCredits());
        sally.addGrade(12, 3.5);

        // here override of toString is tested:
        //System.out.println(sally);


        sally.addGrade(25, 3.8);

        //here gradeLevel will still be Freshman because method getDradeLevel was NOT reapplied... One of the ideas is to input in .toString this.getGradeLevel and it will automatically run getGradeLevel every time when we want to see sally (run .toString())...
        System.out.println(sally);

        System.out.println("Sally`s new GPA: " + sally.getGpa());
        System.out.println("Sally`s number of credits received: " + sally.getNumberOfCredits());


        //System.out.println(sally);

        System.out.println("Sally is " + sally.getGradeLevel() + ".");
    }
}
