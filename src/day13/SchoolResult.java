package day13;

import java.util.Scanner;

public class SchoolResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

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

        String division = "";
        if( percentage>=80 ){
            division = "Distinction";
        }else if( percentage>=60 && percentage<80 ){
            division = "First Division";
        } else if( percentage>=40 && percentage<60 ){
            division = "Second Division";
        } else if( percentage>=32 && percentage<40 ){
            division = "Third Division";
        } else {
            division = "fail";
        }

        String output = String.format("The percentage of %s is %.2f ", name, percentage);
        System.out.println(output);
//        if (!"fail".equals(division)){
//            System.out.println(String.format("You have passed in %s division", division));
//        } else{
//            System.out.println("Sorry you are failed");
//        }

        if("fail".equals(division)){
            System.out.println("Sorry you are failed");
        }else{
            System.out.println(String.format("You have passed in %s", division));
        }

    }
}
