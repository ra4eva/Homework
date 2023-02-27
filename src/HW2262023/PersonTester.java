package HW2262023;

import java.util.Map;
import java.util.TreeMap;

public class PersonTester {
    public static void main(String[] args) {
        Map<Integer, Person> person = new TreeMap<>();
        person.put(1, new Person("Hyun", "Bin", 40, 150000));
        person.put(2, new Person("Son", "Ye-jin", 41, 130000));
        person.put(3, new Person("Kim", "Jung-hyun", 32, 125000));

        System.out.println(person); //This wont work unless you have print method in object class

    }
}
