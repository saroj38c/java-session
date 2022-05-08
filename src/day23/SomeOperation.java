package day23;

import java.io.IOException;

public class SomeOperation{
    public void divideTwoNumber(int a,int b) throws ArithmeticException, NullPointerException, IndexOutOfBoundsException{
        float total = a / b;
        System.out.println(total);
//        try{
//            float total = a / b;
//            System.out.println(total);
//        } //catch(Exception e){
//        catch(ArithmeticException e){
//            e.printStackTrace();
//            System.out.println("Exception has occured" + e.getMessage());
//        }

    }

    public void someFunctionThatThrowsIOException() throws IOException {

    }
}
