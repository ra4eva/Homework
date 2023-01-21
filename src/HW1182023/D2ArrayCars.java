package HW1182023;

import java.util.Arrays;

public class D2ArrayCars {
    public static void main(String[] args) {
        String[][] cars= {{"American", "German", "Korean", "Italian"},
                {"Tesla", "Mercedes", "Hyundai", "Ferrari"}
        };
        for (int i=0;i< cars.length;i++){
            System.out.println(Arrays.toString(cars[i]));
        }
        System.out.println("* * * * * * * * * * * * * * * * * * ");
        for (String[] car:cars){
            System.out.println(Arrays.toString(car));
        }
    }
}
