package HW242023;

public class MTeacher extends Teacher {
    String mathSub;

    int gradelevel;

    int years;

    boolean degree=true;

    public static void main(String[] args) {
        MTeacher teacher1=new MTeacher();

        teacher1.name="Mrs Frizzle";
        teacher1.mathSub="Algebra";
        teacher1.gradelevel=7;

        teacher1.assign();




    }
}
