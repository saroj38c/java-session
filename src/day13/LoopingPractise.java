package day13;

public class LoopingPractise {
    public static void main(String[] args) {
        int i = 1;

        //while loop
        System.out.println("While Loop");
        while ( i <= 10 ){
            System.out.println(i);
            i++;
        }

        // Do while
        System.out.println("Do..While Loop");
        i = 1;
        do {
            System.out.println(i);
            i++;
        }while ( i <= 10 );

        //For Loop
        System.out.println("For Loop");
        i = 1;
        for ( i = 1; i <= 10 ; i++){
            System.out.println(i);
        }

    }
}
