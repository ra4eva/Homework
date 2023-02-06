package HW242023;

public class Animals {
    String birds;

    String mammals;

    String fish;


    static void printF(){
        System.out.println("This is a beautiful Animal");
    }

    void hiberte() {
        System.out.println("Hibernating");
    }

    void eat() {
        System.out.println("Eats");
    }
} class Bears extends Animals {
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
} class PandaBear extends Bears {
    String earColor="black";
    String eyeColor="Black";
    String bodyColor="White";

    String live;

    boolean canSwim=true;

    void swim(){
        System.out.println("Swimming");
    }

    public static void main(String[] args) {
        PandaBear bear1=new PandaBear();
        bear1.live="China";
        bear1.species="Panda";
        bear1.food="Bamboo";
        bear1.age=2;

        bear1.sleep();

    }
}

