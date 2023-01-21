package HW1182023;

public class D2ArrayEvenSum {
    public static void main(String[] args) {
        int[][] nums = {{10, 20, 31,40},
                {100, 200, 301,400},
                {1000, 2000, 3011,4000}
        };
        int sumE=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] % 2 == 0) {
                    sumE+=nums[i][j];
            }
        }
    } System.out.println(sumE);
}
}
