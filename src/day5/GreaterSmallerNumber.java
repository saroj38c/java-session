package day5;

public class GreaterSmallerNumber {
    public static void main(String[] args){
        int a = 73;
        int b = 10;
        int c = 20;
        int large = a;
        int small = a;

        if( b > large ){
            large = b;

        }
        if( c > large ){
           large = c;
        }
        if( b < small ){
            small = b;
        }
        if( c < small ){
            small = c;
        }

        System.out.println("Greater number is "+large);
        System.out.println("Smaller number is "+small);


    }
}
