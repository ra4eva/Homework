package HW2192023;

import java.util.ArrayList;

public class EvenNum {
    public static void main(String[] args) {
        ArrayList<Integer> evenNum=new ArrayList<>();
        for (int i= 1; i <500; i++) {
            if (i%2==0)
                evenNum.add(i);
        }
        evenNum.removeIf(even5 -> even5 % 5 == 0);
        System.out.println(evenNum);
        }
    }

