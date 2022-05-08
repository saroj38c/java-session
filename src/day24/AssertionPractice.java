package day24;

public class AssertionPractice {
    public static void main(String[] args) {
        int x = -2;

//        if (x < 0) {
//            throw new IllegalArgumentException("The value of x is negative");
//        }


        //For this add -ea on vm option edit configuration
        assert x >= 0 : "The value of x is negative";

        double sqrt = Math.sqrt(x);
        System.out.println(sqrt);

    }
}
