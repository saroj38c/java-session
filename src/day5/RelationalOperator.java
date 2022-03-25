package day5;

public class RelationalOperator {

    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        boolean isEqual = a == b;
        System.out.println(isEqual);

        boolean isNotEqual = a != b;
        System.out.println(isNotEqual);

        boolean isLessThan = a < b;
        System.out.println(isLessThan);

        boolean isLessThanEqual = a <= b;
        System.out.println(isLessThanEqual);

        boolean isGreaterThan = a > b;
        System.out.println(isGreaterThan);

        boolean isGreaterThanEqual = a >= b;
        System.out.println(isGreaterThanEqual);

        boolean x = true;
        boolean y = false;

        //AND Operator &&
        boolean anding = x && y;
        System.out.println(anding);

        boolean and = (a<b) && (a==b);
        System.out.println(and);

        //OR  ||
        boolean oring = x || y;
        System.out.println(oring);

        boolean or = (a<b) || (a==b);
        System.out.println(or);

        //Ternary operator
        int age = 20;
        String message = (age>18) ? "You are eligible" : "You are not eligible";
        System.out.println(message);

    }

}