package day23;

import java.io.IOException;

public class ExceptionPractice {
    public static void main(String[] args) {
        SomeOperation so = new SomeOperation();
        try{
            so.divideTwoNumber(4,6);
        }
        catch(ArithmeticException | NullPointerException | IndexOutOfBoundsException e){
            System.out.println("Sending these errors to analytics server");
        }

        try {
            so.SomeRuntimeException();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
