package com.company;
/**
 * This class for runnig student class and testing code
 * @author Sayed Mohammad Ali Mirkazemi
 */
public class Run {
    public static void main(String[] args) {
        Student std1 = new Student("Ehsan","Edalat", "9031066");
        Student std2 = new Student("Seyed", "Ahmadpanah", "9031806");
        Student std3 = new Student("Ahmad", "Asadi", "9031054");
        Lab laboratory_1= new Lab(3,"Saturday");
        std1.print();
        std1.setGrade(15);
        std1.print();
        std2.print();
        std2.setGrade(11);
        std2.print();
        std3.print();
        std3.setFirstName("HamidReza");
        std3.print();
        System.out.println("******************************************");
        laboratory_1.enrollStudent(std1);
        laboratory_1.enrollStudent(std2);
        laboratory_1.enrollStudent(std3);
        laboratory_1.calculationAverage();
        laboratory_1.print();
    }
}
