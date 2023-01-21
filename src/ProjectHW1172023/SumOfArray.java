package ProjectHW1172023;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter 5 numbers");
        int[] num=new int[5];
        int sum=0;

        for (int i=0;i<num.length;i++){
            num[i]= scan.nextInt();
            sum+=num[i];
        }
        System.out.println(sum);
    }
}
