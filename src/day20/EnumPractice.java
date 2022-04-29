package day20;

import static day20.Size.MEDIUM;
import static day20.Size.SMALL;

public class EnumPractice {
    public static void main(String[] args) {
//        final String SMALL = "1";
//        final String MEDIUM = "2";
//        final String LARGE = "3";
//        final String EXTRA_LARGE = "4";
//
//        String someValue = "2";
//
//        switch (someValue) {
//            case SMALL:
//                System.out.println("Small");
//                break;
//            case MEDIUM:
//                System.out.println("Medium");
//                break;
//            case LARGE:
//                System.out.println("Large");
//
//                break;
//            default:
//                System.out.println("Extra Large");
//                break;
//        }

        String someValue1 = MEDIUM.getAbbr();

        switch (someValue1) {
            case "1":
                System.out.println("Small");
                break;
            case "2":
                System.out.println("Medium");
                break;
            case "3":
                System.out.println("Large");
                break;
            default:
                System.out.println("Extra Large");
                break;
        }
    }
}
