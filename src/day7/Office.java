package day7;

import java.time.LocalDate;
import java.util.Calendar;

public class Office {
    //    var i = 3; // Not be able to use var outside the function

    public static void main(String[] args) {

//        Employee employee = new Employee();

        var i = 3;

        Employee saroj = new Employee("Saroj", 28, 8000, Calendar.getInstance());
        System.out.println(saroj.getName());
        System.out.println(saroj.getAge());
        System.out.println(saroj.getSalary());
        System.out.println(saroj.getHireDate());

        Employee abc = new Employee("ABC", 28, 6000, Calendar.getInstance(), "275680");
        System.out.println(abc.getName());
        System.out.println(abc.getAge());
        System.out.println(abc.getSalary());
        System.out.println(abc.getHireDate());

//        Employee employee1 = new Employee("Employee1",20, null,LocalDate.now());
//        System.out.println(employee1.getName());
//        System.out.println(employee1.getAge());
//        System.out.println(employee1.getSalary());
//        System.out.println(employee1.getHireDate());
//
//        Employee employee2 = new Employee("Employee2",30, 5000,LocalDate.now());



    }
}
