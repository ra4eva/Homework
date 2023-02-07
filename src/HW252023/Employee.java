package HW252023;

public class Employee {

    String name;

    String years;

    int id;

    Employee(String name, int id,String years){
        this.name=name;
        this.id=id;
        this.years=years;
    }
    public void printInfor(){
        System.out.println("Employee "+name+" has been working with us for "+years+" years");
    }
    public int getPaycheck(int HrlyRate, int WorkedHrs){
                int pay=HrlyRate*WorkedHrs;
        System.out.println("this is how much you will get paid this paycheck:");
                return pay;

    }
}class FullTime extends Employee{

    int age;


    FullTime(String name,int id, String years,int age) {
        super(name,id,years);
        this.name = name;
        this.id = id;
        this.years = years;
        this.age=age;
    }
    void printInfo(){
        System.out.println("Employee: "+name+ "is "+age+ "years old");

    }
}class PartTime extends Employee {

    String FullName;

    int Id;

    PartTime(String name,int id, String years){
        super(name,id,years);
        this.years=years;
        this.name=name;
        this.id=id;

    }

    public void printInfo(){
        System.out.println(name+"Has been working for"+years);
    }

    public static void main(String[] args) {
        Employee emp1=new Employee("Abeera",123,"3");
        emp1.printInfor();
        System.out.println(emp1.getPaycheck(15,40));


    }
}
