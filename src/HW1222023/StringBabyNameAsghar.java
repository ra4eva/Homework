package HW1222023;

import java.util.Scanner;

public class StringBabyNameAsghar {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("What is the mothers first name?");
        String mom= scan.next();
        System.out.println("What is the fathers first name? ");
        String dad=scan.next();
        System.out.println("Is it a Boy or Girl?");
        String baby=scan.next();


        String babyName;

        if(baby.equalsIgnoreCase("Boy")){
            String firstHalf=dad.substring(0,dad.length()/2);
            String secondHalf=mom.substring(0,mom.length()/2);
        }else{

        }
    }
}
