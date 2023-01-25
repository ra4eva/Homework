package HW1222023;

import java.util.Scanner;

public class StringBabyName {
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
            babyName=dad.substring(0,3) +mom.substring(2);
            System.out.println(babyName.toUpperCase());
        }else if (baby.equalsIgnoreCase("Girl")){
            babyName= mom.substring(0,2) +dad.substring(3) ;
            System.out.println(babyName.toUpperCase());
        }


    }
}
