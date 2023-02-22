package HW2192023;

import java.util.ArrayList;

public class Drinks {
    public static void main(String[] args) {
        ArrayList<String> drinks=new ArrayList<>();

        drinks.add("Chocolate Milk");
        drinks.add("Banana Milk");
        drinks.add("Strawberry Milk");
        drinks.add("Milk");

        drinks.replaceAll(drink -> (drink.contains("a") || drink.contains("e")) ? "water" : drink);//Lambda practice
        System.out.println(drinks);

        for (int i = 0; i < drinks.size(); i++) {
            String drink = drinks.get(i);
            if (drink.contains("a") || drink.contains("e")) {
                drinks.set(i, "water");
            }
        }System.out.println(drinks);
    }
}
