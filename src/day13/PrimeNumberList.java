package day13;

public class PrimeNumberList {
    public static void main(String[] args) {
        for(int i =1 ; i<=100; i++){
            int count = 0;
            for (int j = i; j >= 1; j--) {
                if (i % j == 0) {
                   count++;
                }
            }
            if(count==2){
                System.out.println(i);
            }
        }

    }
}
