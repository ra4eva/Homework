package HW1182023;

public class D2ArrayGrades {
    public static void main(String[] args) {
        String [][] grades={{"Daizai","Levi","Gojo","Itachi"},
                            {"A","B","C","F",}
        };
        for (int i=0; i< grades.length;i++){
                if (grades[1][i].equals("A")|| grades[1][i].equals("B")){
                    System.out.println(grades[0][i]);
                }
        }
    }
}
