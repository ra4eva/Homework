package HW242023;

public class Bears extends Animals {
    String color;

    String species;

    int age;

    int size;

    String food;

    void reusePrintF(){
        Animals.printF();
    }

    void walk() {
        System.out.println("Walks on heels");
    }
    void sleep(){
        System.out.println("Sleeps");

    }

    public static void main(String[] args) {
        Bears firstAnimal=new Bears();

        firstAnimal.reusePrintF();

        firstAnimal.mammals="Bear";
        firstAnimal.food="fish";
        firstAnimal.eat();

    }
}
