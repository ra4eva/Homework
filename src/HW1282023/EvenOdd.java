package HW1282023;

public class EvenOdd {
    boolean isEven(int num){
        return num%2==0;
    }

    public static void main(String[] args) {
        EvenOdd num=new EvenOdd();
        System.out.println(num.isEven(17));
    }
}
