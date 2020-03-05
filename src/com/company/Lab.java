package com.company;
/** The Lab class represents students in a laboratory.
 * @author Sayed Mohammad Ali Mirkazemi
 */
public class Lab {
    // students of laboratory
    private Student[] students;
    // average of students' grades
    private float avg;
    // day of attending to laboratory
    private String day;
    // capacity of laboratory
    private int capacity;
    // current size of laboratory
    private int currentSize=0;

    /**
     * This is constructor of Lab class
     * @param capacityinput set primary value of capacity field
     * @param dayinput set primary value of day
     */

    public Lab(int capacityinput, String dayinput) {
        students = new Student[capacityinput];
        capacity=capacityinput;
        day=dayinput;
    }
    /**
     * This method is for add a student to laboratory
     * If there is no empty space in class print "Lab is full" otherwise add the student
     * @param std is the only parameter that receive
     */
    public void enrollStudent(Student std) {
        if (currentSize < capacity) {
            students[currentSize]=std;
            currentSize++;
        }
        else {
            System.out.println("Lab is full!!!");
        }
    }

    /**
     * This method shows students' information of laboratory
     */
    public void print() {
        for(int i=0; i<capacity; i++) {
            System.out.println("std firstname: " + students[i].getFirstName()
                    + " std id:" + students[i].getID()
                    + " std grade:"+ students[i].getGrade());
        }
        System.out.println("Lab AVG:" + avg);
    }

    /**
     * This method calculates average students' grades
     */
    public void calculationAverage(){
        int sum=0;
        for(int j=0; j<capacity; j++){
            sum+=students[j].getGrade();
        }
        avg=(float) sum/students.length;
    }
    /**
     * get the string of student
     * @return students field
     */
    public Student[] getStudents(){
        return students;
    }
    /**
     * setter method
     * @param students set student of laboratory
     */
    public void setStudents(Student[] students) {
        this.students = students;
    }
    /**
     * get the capacity of laboratory
     * @return capacity field
     */
    public int getCapacity() {
        return capacity;
    }
    /**
     * setter method
     * @param capacityinput set capacity of laboratory
     */
    public void setCapacity(int capacityinput) {
        this.capacity = capacityinput;
    }
    /**
     * get the size of laboratory
     * @return currentSize field
     */
    public int getCurrentSize() {
        return currentSize;
    }
    /**
     * setter method
     * @param sizeinput set size of laboratory
     */
    public void setCurrentSize(int sizeinput) {
        this.currentSize = sizeinput;
    }
    /**
     * get the day of attending to laboratory
     * @return day field
     */
    public String getDay() {
        return day;
    }
    /**
     * setter method
     * @param dayinput set day of attending to laboratory
     */
    public void setDay(String dayinput) {
        this.day = dayinput;
    }
    /**
     * setter method
     * @param avginput set average of students' grades
     */
    public void setAvg(float avginput) {
        this.avg = avginput;
    }
}

