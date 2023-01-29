package HW1282023;

public class Larger {

    int numLarger(int num, int num1){
        if (num>num1) {
            return num;
        }else {
            return num1;
        }
    }

    public static void main(String[] args) {
        Larger nums=new Larger();
        System.out.println(nums.numLarger(14,17));

    }
}
