package HW1302023;

public class Students {

    String name;

    int mathGrade;

    int hisGrade;

    int sciGrade;

    double avg;

    Students(String sName, int m, int h, int s) {
        name=sName;
        mathGrade=m;
        hisGrade=h;
        sciGrade=s;

        avg = ((mathGrade+hisGrade+sciGrade) / 3);
    }
    void printInfo() {
        System.out.println("student: " + name + "'s Total Grade Average is: " + avg);
    }
    public static void main(String[] args) {
        Students student1=new Students("Itachi",99,95,100);
        student1.printInfo();
        Students student2=new Students("Gojo",80,75,90);
        student2.printInfo();
        Students student3=new Students("Dazai",90,95,95);
        student3.printInfo();
        Students student4=new Students("Levi",99,99,100);
        student4.printInfo();
        Students student5=new Students("Serena",75,70,55);
        student5.printInfo();
    }
}

