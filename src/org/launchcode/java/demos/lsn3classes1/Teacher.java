package org.launchcode.java.demos.lsn3classes1;

public class Teacher {

    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    public Teacher(String firstName, String lastName, String subject, int yearsTeaching) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.yearsTeaching = yearsTeaching;
    }

    public void setFirstName(String aFirstName) {
        this.firstName = aFirstName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String aLastName) {
        this.lastName = aLastName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setSubject(String aSubject) {
        this.subject = aSubject;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setYearsTeaching(int aYearsTeaching) {
        this.yearsTeaching = aYearsTeaching;
    }

    public int getYearsTeaching() {
        return this.yearsTeaching;
    }

    public String teacherInfo() {
        return (getFirstName() + ' ' + getLastName() + " teaches " + getSubject() + " and has taught for " + getYearsTeaching() + " years." );
    }
}
