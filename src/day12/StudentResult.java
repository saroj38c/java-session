package day12;

import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter the userName");
        String userName=scanner1.nextLine();
        System.out.println("Enter the password");
        String password = scanner1.nextLine();

        if(!password.equals("admin123")){
            System.out.println("You are not authenticated user. Please try again");
            System.exit(0);
        }

        System.out.println("Enter the full name of the student");
        String name = scanner1.nextLine();

        System.out.println("Enter mark for Science: ");
        float science  = scanner.nextFloat();

        System.out.println("Enter mark for Math: ");
        float math  = scanner.nextFloat();

        System.out.println("Enter mark for English: ");
        float english  = scanner.nextFloat();

        System.out.println("Enter mark for History: ");
        float history  = scanner.nextFloat();

        System.out.println("Enter mark for Geography: ");
        float geography  = scanner.nextFloat();

        float total = science + math + english + history + geography;
        float percentage = total/5;

        String output = String.format("The percentage of %s is %.2f", name, percentage);
        System.out.println(output);
    }
}
