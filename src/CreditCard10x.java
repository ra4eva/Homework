import java.util.Scanner;

public class CreditCard10x {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        for (int i=0;i<=10;i++){
            System.out.println("Do you need a credit card?");
            if (scan.nextLine().equals("yes")){
                break;
            }
        }
    }
}
