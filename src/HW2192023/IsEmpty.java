package HW2192023;

import java.util.ArrayList;

public class IsEmpty {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Gojo");
        names.add("Daizai");
        names.add("Itachi");
        names.add("Levi");
        names.add("Tifa");
        System.out.println(names.isEmpty());
        System.out.println(names.contains("Cloud"));
        System.out.println(names.size());
        System.out.println(names);

    }
}

