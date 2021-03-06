package day7;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Employee {
    private String name;// Mand
    private int age;// Mand
    private double salary;// Mand
    private Calendar hireDate; // Mand

    private String drivingLicenceNumber; // optional

    //Default Constructor
    private Employee(){
        System.out.println("Default Constructor");
    }

//    public static Employee getInstance(){
//        return new Employee();
//    }

    // Parameterized Constructor
    public Employee(String name, int age, double salary, Calendar hireDate) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public Employee(String name, int age, double salary, Calendar hireDate, String drivingLicenceNumber) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.hireDate = hireDate;
        this.drivingLicenceNumber = drivingLicenceNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getHireDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy");
        return dateFormat.format(hireDate.getTime());
    }
}
