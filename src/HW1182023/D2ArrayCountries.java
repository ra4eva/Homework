package HW1182023;

import java.util.Arrays;

public class D2ArrayCountries {
    public static void main(String[] args) {
        String[][] countries = {{"U.S,", "Canada", "Mexico"},
                {"Colombia", "Aregentina", "Brazil"},
                {"Italy", "Spain", "Greece"},
                {"Japan", "South Korean", "Singapore"},
                {"Egypt", "Kenya", "Morocco"}
        };
        int count = 0;
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                count++;
            }
        }
        System.out.println("Total number of countries: " +count);

        for (int i = 0; i < countries.length; i++) {
            System.out.println(Arrays.toString(countries[i]));
        }
        System.out.println("* * * * * * * * * * * * * * * * *");
        for (String[] country : countries) {
            System.out.println(Arrays.toString(country));
            }
        }
    }
