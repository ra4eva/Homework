package HW2262023;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Objects {
    public static void main(String[] args) {
        Set<String> string=new LinkedHashSet<>();
        string.add("Set");
        string.add("you");
        string.add("heart");
        string.add("ablaze!");

        String concatStr = String.join("", string);
        System.out.println(concatStr);
    }
}
