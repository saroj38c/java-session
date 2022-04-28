package day20;

public class EllipsisOperatorPractice {
    public static void main(String[] args) {
        add(2,3);
        multiply(2,3);
        add(2,3,5);
        multiply(2,3,5);
    }

        //    public static void  add( int a, int b){
//        int temp = a + b;
//        System.out.println(temp);
//    }
//
//    public static void  add( int a, int b, int c){
//        int temp = a + b + c;
//        System.out.println(temp);
//    }

        public static void add(int... values){

            int temp = 0;

            for (int value : values) {
                temp += value;
            }
            System.out.println(temp);
        }

        public static void add(float... values){

            float temp = 0;

            for (float value : values) {
                temp += value;
            }
            System.out.println(temp);
        }

    public static void multiply(int... values){

        int temp = 1;

        for (int value : values) {
            temp *= value;
        }
        System.out.println(temp);
    }

}
