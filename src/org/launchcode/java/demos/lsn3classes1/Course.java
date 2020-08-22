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

    public ArrayList<Student> getRoster() {
        return roster;
    }

    private void setRoster(ArrayList<Student> aRoster) {
        roster = aRoster;
    }
}
