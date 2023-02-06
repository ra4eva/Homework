package HW242023;

public class School {
    public static void main(String[] args) {
        Teacher tc=new Teacher();
        tc.name="Mrs. frizle";
        tc.subject="math";

        System.out.println("This is the "+tc.subject+ "teacher"+tc.name);

        MTeacher mt=new MTeacher();

        mt.name="Mrs. Gigi";
        mt.gradelevel=9;
        mt.age=27;

    }
}
