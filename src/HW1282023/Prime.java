package HW1282023;

public class Prime {
    boolean isPrime(int num){
        int count=0;
        for (int i = 1; i <=num; i++) {
            if (num%i==0){
                count++;
            }
        }if (count==2){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        Prime num=new Prime();
        System.out.println(num.isPrime(4));
    }

    }
