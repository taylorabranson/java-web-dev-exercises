package org.launchcode.java.demos.lsn4classes2;

import org.launchcode.java.demos.lsn3classes1.Student;

import java.util.ArrayList;
import java.util.Objects;


public class Course {

    private String name;
    private String instructor;
    private int creditHours;
    private ArrayList<org.launchcode.java.demos.lsn3classes1.Student> roster;

    public Course(String name, String instructor, int creditHours, ArrayList<org.launchcode.java.demos.lsn3classes1.Student> roster) {
        this.name = name;
        this.name = instructor;
        this.creditHours = creditHours;
        this.roster = roster;
    }

    public Course(String name, String instructor, int creditHours) {
        this(name, instructor, creditHours, new ArrayList<org.launchcode.java.demos.lsn3classes1.Student>());
    }

    @Override
    public String toString() {
        return "Course: " + name +
                "  Instructor: " + instructor +
                "  Credit Hours: " + creditHours +
                "  Enrolled Students: " + roster.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return name.equals(course.name) &&
                instructor.equals(course.instructor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, instructor);
    }

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String aInstructor) {
        instructor = aInstructor;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int aCreditHours) {
        creditHours = aCreditHours;
    }

    public ArrayList<org.launchcode.java.demos.lsn3classes1.Student> getRoster() {
        return roster;
    }

    private void setRoster(ArrayList<Student> aRoster) {
        roster = aRoster;
    }
}

