package HW1292023;

public class ArraySum {

    int arrSum(int[] arr) {
        int sum = 0;
        for (int a : arr) {
            sum += a;
        }
        return sum;
    }

    public static void main(String[] args) {
        ArraySum a=new ArraySum();
        int[] arr={10,20,30};
        System.out.println(a.arrSum(arr));
    }
}