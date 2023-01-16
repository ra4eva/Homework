package HW01142023;

import java.util.Scanner;

public class MoneyAndMath {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double total=0;
        for (int i=0; i<3; i++) {
            System.out.println("Please enter the item and its price");
            String item = scan.next();
            double price = scan.nextDouble();
            total=total+price;
            System.out.println("this is the total amount that youhave to pay " +total);
        }
        System.out.println("Please pay for the items");
        double paid=scan.nextDouble();

        if (paid>total){
            double change=paid-total;
            System.out.println("Hey here is your change "+change);
        }
        System.out.println("Thank you for shopping with us");
    }
}
