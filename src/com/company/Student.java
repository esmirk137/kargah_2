package com.company;
/**
 * The Student class represents a student in a student administration system.
 * It holds the student details relevant in our context.
 * @author Sayed Mohammad Ali Mirkazemi
 */
public class Student {
    // the student’s first name
    private String firstName;
    // the student’s last name
    private String lastName;
    // the student ID
    private String id;
    // the grade
    private int grade;
    /** This is our Constructor
     * Create a new student with a given name and ID number.
     * @param fName first name of student
     * @param lname last name of student
     * @param sID student ID
     */
    public Student(String fName, String lname, String sID){
        firstName = fName;
        lastName = lname;
        id = sID;
        grade = 0;
    }
    /**
     * get the first name of student
     * @return firstName field
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * @param firstNameinput set first name of a student
     */
    public void setFirstName(String firstNameinput) {
        firstName = firstNameinput;
    }
    /**
     * get the last name of student
     * @return lastName field
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * @param lastNameinput set first name of a student
     */
    public void setLastName(String lastNameinput) {
        lastName = lastNameinput;
    }
    /**
     * get the ID of student
     * @return ID field
     */
    public String getID() {
        return id;
    }
    /**
     * @param IDinput set first name of a student
     */
    public void setID(String IDinput) {
        id = IDinput;
    }
    /**
     * get the grade of student
     * @return grade field
     */
    public int getGrade() {
        return grade;
    }
    /**
     * @param gradeinput set first name of a student
     */
    public void setGrade(int gradeinput) {
        grade = gradeinput;
    }
    /**
     * Print the student’s last name and ID number to the output terminal.
     */
    public void print() {
        System.out.println(lastName + ", student ID: " + id + ", grade: " + grade);
    }
}
