package day11;

import java.util.Scanner;

public class CalculatePercentage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

        System.out.println("Your total percentage is: " + percentage);

    }
}
