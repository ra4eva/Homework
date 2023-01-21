package HW1182023;

import java.lang.reflect.Array;
import java.util.Arrays;

public class D2ArraySum {
    public static void main(String[] args) {
        int[][] nums = {{10, 20, 30},
                {100, 200, 300},
                {1000, 2000, 3000}
        };
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                sum += nums[i][j];
            }
        }
        System.out.println(sum);
    }
}
