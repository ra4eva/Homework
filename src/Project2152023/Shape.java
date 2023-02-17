package Project2152023;

public interface Shape {

    void calculateArea();
    void calculatePerimeter();
}
class circle implements Shape{
    double pi=3.14;
    double radius;

    circle(double r){
        this.radius=r;
    }

    public void calculateArea() {
        double area= (radius * radius) *pi;
        System.out.println(area);
    }

    public void calculatePerimeter() {
        double perimeter= (2 * pi) *radius;
        System.out.println(perimeter);

    }
}
class square implements Shape{

    int s;

    square(int s){
        this.s=s;
    }
    public void calculateArea() {
        int area=s*s;
        System.out.println(area);
    }
    public void calculatePerimeter() {
        int perimeter=4*s;
        System.out.println(perimeter);

    }

    public static void main(String[] args) {
        Shape [] shapes={new square(8),new circle(14)};

        for (Shape shape:shapes){
            shape.calculateArea();
            shape.calculatePerimeter();
        }




    }
}