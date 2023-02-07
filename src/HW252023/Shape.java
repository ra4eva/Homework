package HW252023;

public class Shape {

    double radius;

    Shape (double R) {
        this.radius = R;

    }

} class Circle extends Shape{

    double pi=3.14159265359;
    double area;

    Circle(double R) {
        super(R);
        area=(R+R)*pi;
    }
    void printR(){
        System.out.println("the area of the circle is " +area);


    }

    public static void main(String[] args) {
        Circle c1=new Circle(10);
        c1.printR();


    }
}
