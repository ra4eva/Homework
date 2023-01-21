package HW1182023;

import java.util.Arrays;

public class D2ArrayGroceryList {
    public static void main(String[] args) {
        String [][] groceries={{"Potatoes","Tomatoes","Onions","Bell Peppers"},
                                {"Watermelon","Mango","Banana","Strawberries","Apple"},
                                {"Milk","Cheese","Yogurt","Cream","Butter"},
                                {"Chocolate cake","Ice Cream","Pie","Cookies","Mini M&M's"}
        };
        for (int i=0;i< groceries.length;i++){
            System.out.println(Arrays.toString(groceries[i]));
        }
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * *");
        for (String[] grocery:groceries){
            System.out.println(Arrays.toString(grocery));
        }

    }
}
