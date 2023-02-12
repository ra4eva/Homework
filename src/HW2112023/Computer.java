package HW2112023;

public class Computer {

    public void oN(){
        System.out.println("Computer turns on");
    }
    public void oFF(){
        System.out.println("Computer turns off");
    }
    public void sleepMode(){
        System.out.println("Computer is in sleep mode");
    }
}
class Apple extends Computer{
    public void oN(){
        System.out.println("Mac turns on");
    }
    public void oFF(){
        System.out.println("Mac turns off");
    }
    public void sleepMode(){
        System.out.println("Mac goes into sleep mode");
    }
}
class Lenovo extends Computer{
    public void oN(){
        System.out.println("Lenovo computer turns on");
    }
    public void oFF(){
        System.out.println("Lenovo computer turns off");
    }
    public void sleepMode(){
        System.out.println("Lenovo computer is in sleep mode");
    }
}
class HP extends Computer {
    public void oN(){
        System.out.println("HP Computer turns on");
    }
    public void oFF(){
        System.out.println("HP Computer turns off");
    }
}
class Dell extends Computer{
    public void blueScreen(){
        System.out.println("Dell Computer displays blue screen of death");
    }
}
