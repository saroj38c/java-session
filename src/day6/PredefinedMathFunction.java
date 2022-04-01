package day6;

public class PredefinedMathFunction {
    public static void main(String[] args) {

        double pi = Math.PI;

        double sqrtValue = Math.sqrt(10);
        System.out.println(sqrtValue);

        double ceilValue = Math.ceil(4.51);
        System.out.println(ceilValue);

        double floorValue = Math.floor(4.51);
        System.out.println(floorValue);

        long roundValue = Math.round(4.51);
        System.out.println(roundValue);

        double randomValue = Math.random();
        System.out.println(randomValue);

        double randomValue1 = Math.random();
        System.out.println(Math.round( randomValue1*10 ));


    }
}
