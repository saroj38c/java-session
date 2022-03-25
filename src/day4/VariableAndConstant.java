package day4;

public class VariableAndConstant {

    public static void main(String[] args){
        String videoID = "quils363gff";
        videoID = "qasde652we";

        final String TITLE = "Constant Title";
        // TITLE = "test"; /* Will not allow to change as TITLE is constant here */

        //Defining constant
        final String SMALL = "S";
        final String MEDIUM = "M";
        final String LARGE = "L";
        final String EXTRA_LARGE = "XL";

        //Enum can be used to replace defining multiple constants
        enum SIZE{
            SMALL,MEDIUM,LARGE,EXTRA_LARGE
        }


        //Assignment operator
        int x = 10;

        x += 8; //x = x + 8;
        x -= 8; //x = x - 8;
        x *= 8; //x = x * 8;
        x /= 8; //x = x / 8;

        //Arithmetic Operation
        int a = 5;
        int b = 8;
        int c = 4;
        int d = 2;
        int calc = 0;
        calc = ((a+b)*(c-d));
        System.out.println(calc);
        int sum = 0;
        sum = a+b;
        sum += c;
        sum += d;
        System.out.println(sum);

    }

}
