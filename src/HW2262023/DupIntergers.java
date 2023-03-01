package HW2262023;

import java.util.ArrayList;

public class DupIntergers {
    public static void main(String[] args) {
        ArrayList<Integer> duplicateNum=new ArrayList<>(); //Can't think of any list that takes duplicates but this or linkedlist
        duplicateNum.add(100);
        duplicateNum.add(500);
        duplicateNum.add(600);
        duplicateNum.add(500);
        duplicateNum.add(700);

        int sum = 0;
        for (Integer n : duplicateNum) {
            sum += n;
        }
        System.out.println(sum);
    }
}
