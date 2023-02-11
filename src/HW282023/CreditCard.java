package HW282023;

public class CreditCard {

    double balance;

    double interest;

    double getInterest(double balance){
        double Int=19.08;
        return (balance*Int)/100;
    }
}
class Visa extends CreditCard{

}

class AX extends CreditCard{

    double getInterest(double balance){
        double Int=21.98;
        return (balance*Int)/100;
    }

    public static void main(String[] args) {
        CreditCard cc=new CreditCard();
        System.out.println(cc.getInterest(15000));
        Visa cc1=new Visa();
        System.out.println(cc1.getInterest(15000));
        AX cc2=new AX();
        System.out.println(cc2.getInterest(15000));

    }
}