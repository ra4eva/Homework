package Project1172023;

public class Swap2WithTemp {
    public static void main(String[] args) {
        int x=20;
        int y=10;

        System.out.println("x before swapping " +x);
        System.out.println("y before swapping " +y);
        x=x+y;
        y=x-y;
        x=x-y;

        System.out.println("x after swapping " +x);
        System.out.println("y after swapping " +y);

    }
}
