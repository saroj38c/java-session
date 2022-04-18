package day13;

public class IsPrimeNumber {
    public boolean isPrime(int number) {
        /*
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
        */

        int count = 0;
        for(int i = number; i >= 1;i--){
            if (number % i == 0) {
                count++;
            }
        }

        if( count == 2 ){
            return true;
        }else{
            return false;
        }


    }

    public static void main(String a[]) {
        IsPrimeNumber ip = new IsPrimeNumber();
        System.out.println("Is 12 prime number? " + ip.isPrime(12));
        System.out.println("Is 23 prime number? " + ip.isPrime(23));
        System.out.println("Is 13 prime number? " + ip.isPrime(13));
    }
}
