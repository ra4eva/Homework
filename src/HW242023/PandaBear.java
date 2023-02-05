package HW242023;

public class PandaBear extends Bears {
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

