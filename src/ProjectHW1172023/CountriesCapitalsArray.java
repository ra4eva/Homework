package ProjectHW1172023;

import java.util.Arrays;
import java.util.Scanner;

public class CountriesCapitalsArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] countries = new String[4];
        String[] capitals = new String[4];

        for (int i = 0; i < countries.length; i++) {
            System.out.println("Enter country number "+(i+1));
            countries[i] = scanner.nextLine();

        }for (int j = 0; j < capitals.length; j++) {
            System.out.println("Enter the capital of country "+(j+1));
            capitals[j] = scanner.nextLine();

        }
        System.out.println();
        System.out.println(Arrays.toString(countries));
        System.out.println(Arrays.toString(capitals));

}
}
