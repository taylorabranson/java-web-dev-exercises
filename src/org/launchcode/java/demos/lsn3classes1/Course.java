package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;


public class Course {

    private String name;
    private int creditHours;
    private ArrayList<Student> roster;

    public Course(String name, int creditHours, ArrayList<Student> roster) {
        this.name = name;
        this.creditHours = creditHours;
        this.roster = roster;
    }

    public Course(String name, int creditHours) {
        this(name, creditHours, new ArrayList<Student>());
    }

    public String getName() {
        return this.name;
    }

    public void setName(String aName) {
        this.name = aName;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int aCreditHours) {
        this.creditHours = aCreditHours;
    }

    public ArrayList<Student> getRoster() {
        return roster;
    }

    private void setRoster(ArrayList<Student> aRoster) {
        this.roster = aRoster;
    }
}
