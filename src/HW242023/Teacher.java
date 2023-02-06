package HW242023;

public class Teacher {

    String subject;

    String gender;

    int age;

    String name;

    public void assign(){
        System.out.println(name+ " assigns homework to the students");
    }
    public void yells(){
        System.out.println(name+ " yells at bad student");
    }
    public void teach(){
        System.out.println(name+ " teaches "+subject);
    }
    public void lunchbrk(){
        System.out.println(name+ " eats lunch");
    }
}
class CTeacher extends Teacher {

    int gradelevel;

    int years;


}
 class MTeacher extends Teacher {
    String mathSub;

    int gradelevel;

    int years;

    boolean degree=true;
}
class PianoTeacher extends Teacher {

    String  teachLvl;

    int years;
}





