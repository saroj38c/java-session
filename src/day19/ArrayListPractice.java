package day19;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();
        ArrayList<String> strings1 = new ArrayList<>();
        strings.add("ABC");
        strings.add("EDF");
        strings.add("GHI");
        System.out.println(strings);

//        strings.remove(1);
//        System.out.println(strings);

        strings.add(1,"Saroj");
        System.out.println(strings);

        strings1.addAll(strings);
        System.out.println(strings1.size());
        strings1.clear();
        System.out.println(strings1.isEmpty());
    }
}
