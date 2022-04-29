package day22;

import java.time.LocalDate;
import java.util.Objects;

public class Employee implements Comparable<Employee>{

    private String name;
    private LocalDate localDate;
    private double salary;

    public Employee(String name, LocalDate localDate, double salary) {
        this.name = name;
        this.localDate = localDate;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", localDate=" + localDate +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(localDate, employee.localDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, localDate, salary);
    }

    @Override
    public int compareTo(Employee emp) {
        return emp.name.compareTo(this.name);
    }
}
