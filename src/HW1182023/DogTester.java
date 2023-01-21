package HW1182023;

public class DogTester {
    public static void main(String[] args) {
        Dog husky=new Dog();

        husky.name="Snoopy";
        husky.breed="Siberian";
        husky.age=4;
        husky.weight=45.5;
        husky.color="Black and White";

        husky.bark();
        husky.pullSled();
        husky.fetch();


        Dog bulldog=new Dog();

        bulldog.name="Toto";
        bulldog.breed="French";
        bulldog.age=2;
        bulldog.weight=20.0;
        bulldog.color="Chocolate";

        bulldog.eat();
        bulldog.sleep();

        Dog lab=new Dog();

        lab.name="Coco";
        lab.breed="Retriever";
        lab.age=8;
        lab.weight=72.8;
        lab.color="Golden";

        lab.bark();
        lab.fetch();
        lab.down();





    }
}
