package HW242023;

public class PianoTeacher extends Teacher {

    String  teachLvl;

    int years;

    public static void main(String[] args) {
        PianoTeacher teacher1=new PianoTeacher();

        teacher1.name="Mrs A";
        teacher1.teachLvl="beginners";
        teacher1.years=5;

        teacher1.yells();




    }
}
