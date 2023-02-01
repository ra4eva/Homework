package HW1302023;

public class Student {

    String name;

    String address;

    Student(String n,String add){
        name=n;
        address=add;
    }
    void displayInfo(){
        System.out.println("Student: "+name+"'s address is: "+address);
    }
    public static void main(String[] args) {
        Student s1=new Student("Gojo","123 Epic st, Sedai, Miyagi Prefecture");
        s1.displayInfo();
    }
}
