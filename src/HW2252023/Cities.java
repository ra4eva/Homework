package HW2252023;

import java.util.LinkedHashSet;

public class Cities {
    public static void main(String[] args) {

        LinkedHashSet<String> cities=new LinkedHashSet<>();
        cities.add("New York City");
        cities.add("Los Angeles");
        cities.add("Chicago");
        cities.add("Houston");
        cities.add("Atlanta");

        cities.removeIf(city->city.startsWith("A"));
        System.out.println(cities);

    }
}
