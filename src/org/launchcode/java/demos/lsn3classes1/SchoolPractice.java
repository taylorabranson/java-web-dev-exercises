package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {

    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student taylorBranson = new Student("Taylor Branson", 117, 1, 4.0);
        System.out.println(taylorBranson.studentInfo());

        Student johnDoe = new Student("John Doe", 123);
        System.out.println(johnDoe.studentInfo());

        Teacher janeDoe = new Teacher("Jane", "Doe", "English", 13);
        System.out.println(janeDoe.teacherInfo());
    }
}
