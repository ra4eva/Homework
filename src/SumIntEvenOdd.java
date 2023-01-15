import java.util.Scanner;

public class SumIntEvenOdd {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter start of range value");
        int num= scan.nextInt();
        System.out.println("Please enter end of range value");
        int num1= scan.nextInt();

        int odd=0;
        int even=0;
        for (int i=num;i<=num1;i++){
            if(num%2==0){
                 even+=i;
            }else {
                 odd+=i;
            }
        }
        System.out.println("Sum of even number in range:" +even);
        System.out.println("Sum of odd number in range:" +odd);

    }
}
