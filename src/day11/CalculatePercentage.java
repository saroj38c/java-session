package day11;

import java.util.Scanner;

public class CalculatePercentage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter mark for Science: ");
        int science  = scanner.nextInt();

        System.out.println("Enter mark for Math: ");
        int math  = scanner.nextInt();

        System.out.println("Enter mark for English: ");
        int english  = scanner.nextInt();

        System.out.println("Enter mark for History: ");
        int history  = scanner.nextInt();

        System.out.println("Enter mark for Geography: ");
        int geography  = scanner.nextInt();

        int total = science + math + english + history + geography;
        float percentage = total/5;

        System.out.println("Your total percentage is: " + percentage);

    }
}
