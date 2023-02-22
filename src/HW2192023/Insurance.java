package HW2192023;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class Insurance {
    String insuranceName;


    void getQuote() {

    }
    void cancelInsurance(){

    }
}
class Car extends Insurance {
    String carModel;

    void getQuote() {
        this.carModel="BMW";
        System.out.println("Here is you car insurance quote for your " +carModel);
    }

    void cancelInsurance() {
        this.insuranceName="Alstate";
        System.out.println("Canceled your car insurance with "+insuranceName);
    }
}

class Pet extends Insurance {
    String petType;


    void getQuote() {
        this.petType="dog";
        System.out.println("Here is you pet insurance quote for your " +petType);
    }

    void cancelInsurance() {
        this.insuranceName="Healthy Paws";
        System.out.println("Canceled your pet insurance "+insuranceName);
    }
}


class Health extends Insurance {

    void getQuote() {
        this.insuranceName="United Healthcare";
        System.out.println("Here is your health insurance quote with"+insuranceName);

    }

    void cancelInsurance() {
        this.insuranceName="United Healthcare";
        System.out.println("Canceled your health insurance "+insuranceName);
    }

    public static void main(String[] args) {
        Car car=new Car();
        Pet pet=new Pet();
        Health health=new Health();

        ArrayList<Insurance> test=new ArrayList<>();
        test.add(car);
        test.add(pet);
        test.add(health);

        System.out.println("Print Method 1");
        for (int i = 0; i < test.size(); i++) {
            Insurance in=test.get(i);
            in.getQuote();
            in.cancelInsurance();
        }
        System.out.println();
        System.out.println("Print Method 2");
        for (Insurance i: test){
            i.getQuote();
            i.cancelInsurance();
        }
        System.out.println();
        System.out.println("Print Method 3");
        Iterator<Insurance> iterator = test.iterator();
        while (iterator.hasNext()) {
            Insurance i = iterator.next();
            i.getQuote();
            i.cancelInsurance();
        }
        }

    }
