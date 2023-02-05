package HW242023;

public class Teacher {

    String subject;

    String gender;

    int age;

    String name;

    void assign(){
        System.out.println(name+ " assigns homework to the students");
    }
    void yells(){
        System.out.println(name+ " yells at bad student");
    }
    void teach(){
        System.out.println(name+ " teaches "+subject);
    }void lunchbrk(){
        System.out.println(name+ " eats lunch");
    }
}
