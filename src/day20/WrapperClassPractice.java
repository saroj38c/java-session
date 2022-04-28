package day20;

import java.util.ArrayList;

public class WrapperClassPractice {
    public static void main(String[] args) {
        Integer b = 25;
        Integer a = 20;

        Boolean someBoolean = true;

        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(2);
        ints.add(3);
        ints.add(4);

        System.out.println(ints);

        Integer someData = ints.get(1);

        System.out.println(someData);

        String money = "500";

        String total = money + 50;

        System.out.println(total);

        //Conversion of string to Int

        float moneyFloat = Float.parseFloat(money);

        float totalSumFloat = moneyFloat + 50.5f;

        System.out.println(totalSumFloat);

        float moneyInt = Integer.parseInt(money);

        float totalSumInt = moneyInt + 50;

        System.out.println(totalSumInt);

    }
}
