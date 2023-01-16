package HW01142023;

import java.util.Scanner;

public class RangeOfNumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter two numbers starting point and end point");
        int start= scan.nextInt();
        int end= scan.nextInt();

        int sumE=0;
        int sumO=0;

        for (int i=start;i<=end;i++){
            if (i%2==0){
                sumE+=i;  //can write it like this
            }else{
                sumO=sumO+i; //can also write it like this
            }
        }
        System.out.println("Sum of all the even numbers " +sumE);
        System.out.println("Sum of all the odd numbers " +sumO);



    }
}
