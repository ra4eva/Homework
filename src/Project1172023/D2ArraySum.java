package Project1172023;

public class D2ArraySum {
    public static void main(String[] args) {
        int sum=0;
        int [][] nums={{10,20,30},
                       {40,50,60}
        };
        for (int i=0;i< nums.length;i++){
            for (int j=0;j<nums[i].length;j++) {
                sum += nums[i][j];
            }
        }
        System.out.println(sum);
    }
}
