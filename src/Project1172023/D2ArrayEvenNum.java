package Project1172023;

public class D2ArrayEvenNum {
    public static void main(String[] args) {
        int sumE = 0;
        int[][] nums = {{10, 21, 30},
                        {40, 51, 60}
        };
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] % 2 == 0) {
                    sumE+=nums[i][j];

                }
            }
        }System.out.println(sumE);
    }
}
