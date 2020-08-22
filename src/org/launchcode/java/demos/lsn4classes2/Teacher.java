package org.launchcode.java.demos.lsn4classes2;

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

    public void setFirstName(String firstName) {
        firstName = firstName;
    }

    public void setLastName(String lastName) {
        lastName = lastName;
    }

    public void setSubject(String subject) {
        subject = subject;
    }

    public void setYearsTeaching(int yearsTeaching) {
        yearsTeaching = yearsTeaching;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSubject() {
        return subject;
    }

    public int getYearsTeaching() {
        return yearsTeaching;
    }
}
