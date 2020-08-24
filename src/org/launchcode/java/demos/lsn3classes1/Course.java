package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;


public class Course {

    private String name;
    private String instructor;
    private int creditHours;
    private ArrayList<Student> roster;

    public Course(String name, String instructor, int creditHours, ArrayList<Student> roster) {
        this.name = name;
        this.name = instructor;
        this.creditHours = creditHours;
        this.roster = roster;
    }

    public Course(String name, String instructor, int creditHours) {
        this(name, instructor, creditHours, new ArrayList<Student>());
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

    public int getCreditHours() {
        return this.creditHours;
    }

    public void setCreditHours(int aCreditHours) {
        this.creditHours = aCreditHours;
    }

    public ArrayList<Student> getRoster() {
        return this.roster;
    }

    private void setRoster(ArrayList<Student> aRoster) {
        this.roster = aRoster;
    }
}
