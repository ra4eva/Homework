package HW1282023;

public class GetGrade {
    String getGrade(int score){
        if (score>90) {
            return "A";
        } else if (score>80) {
            return "B";
        } else if (score>70) {
            return "C";
        } else if (score>50) {
            return "D";
        }
        return "F";
    }

    public static void main(String[] args) {
        GetGrade grade=new GetGrade();
        System.out.println(grade.getGrade(75));
    }
}
