package HW1282023;

public class Prime {
    boolean isPrime(int a){
        boolean num=true;
        if (a>1){
            for (int i = 2; i < a; i++) {
                if (a%i==0) {
                    num = false;
                    break;
                }
            }

        }else {
            num = false;
        }
        return num;
    }
    public static void main(String[] args) {
        Prime num=new Prime();
        System.out.println(num.isPrime(10));
    }
}
