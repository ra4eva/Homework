package ProjectHW1172023;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter Number");
        int num= scan.nextInt();
        int count=0;

        for (int i=0;i<=num;i++){
            if (num%1==0){
                count++;
            }
        }
        if (count==2){
            System.out.println("Prime");
        }else {
            System.out.println("Not Prime");
        }
    }
}
