package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {

    private String name;
    private String instructor;
    private double credits;
    private ArrayList<Student> roster;

    public Course(String name, String instructor, double credits, ArrayList<Student> roster) {
        this.name = name;
        this.name = instructor;
        this.credits = credits;
        this.roster = roster;
    }

    public Course(String name, String instructor, double credits) {
        this(name, instructor, credits, new ArrayList<Student>());
    }

    public String getName() {
        return this.name;
    }

    public void setName(String aName) {
        this.name = aName;
    }

    public String getInstructor() {
        return this.instructor;
    }

    public void setInstructor(String aInstructor) {
        this.instructor = aInstructor;
    }

    public double getCreditHours() {
        return this.credits;
    }

    public void setCreditHours(double aCreditHours) {
        this.credits = aCreditHours;
    }

    public ArrayList<Student> getRoster() {
        return this.roster;
    }

    private void setRoster(ArrayList<Student> aRoster) {
        this.roster = aRoster;
    }
}
