package day16;

public class Office {
    public static void main(String[] args) {
//        Employee employee = new Employee("ABC", 30, 5000);
//
//        Manager boss = new Manager("DEF", 35, 8000, 1000);
//
//        Executive executive = new Executive("GHI", 35, 8000, 1000, 1000);
//
//        Cleaner cleaner = new Cleaner("JKL", 40, 1000);
//
//        System.out.println(employee.getSalary());
//        System.out.println(boss.getSalary());
//        System.out.println(executive.getSalary());
//        System.out.println(cleaner.getSalary());

        Employee employee = new Employee("ABC", 30, 5000);
        Employee employee1 = new Employee("ABC", 30, 5000);

        Employee boss = new Manager("DEF", 35, 8000, 1000);

        Employee executive = new Executive("GHI", 35, 8000, 1000, 1000);

        Employee cleaner = new Cleaner("JKL", 40, 1000);

        Employee[] employees = new Employee[4];
        employees[0] = employee;
        employees[1] = boss;
        employees[2] = executive;
        employees[3] = cleaner;

        System.out.println(employees[0].getSalary());
        System.out.println(employees[1].getSalary());
        System.out.println(employees[2].getSalary());
        System.out.println(employees[3].getSalary());

    }
}
