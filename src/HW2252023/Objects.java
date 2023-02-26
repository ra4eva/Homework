package HW2252023;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Objects {
    public static void main(String[] args) {

        HashSet<Student> student=new HashSet<>();
        student.add(new Student("Haruhi",123));
        student.add(new Student("Kyoya",456));
        student.add(new Student("Tamaki",789));


        for (Student s:student){
            s.displayName();
        }
    }
}
