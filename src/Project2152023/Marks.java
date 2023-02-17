package Project2152023;

public abstract class Marks {

    abstract void getPercentage();
}
class A extends Marks{
    int sub1,sub2,sub3;
    double avg;

    A(int sub1, int sub2, int sub3) {
        this.sub1=sub1;
        this.sub2=sub2;
        this.sub3=sub3;

    }

    public void getPercentage() {
        avg = ((sub1+sub2+sub3) / 3);
        System.out.println(avg);
    }
}
class B extends Marks{
    int sub1,sub2,sub3,sub4;
    double avg;

    B(int sub1, int sub2, int sub3,int sub4) {
        this.sub1=sub1;
        this.sub2=sub2;
        this.sub3=sub3;
        this.sub4=sub4;

    }

    public void getPercentage() {
        avg = ((sub1+sub2+sub3+sub4) / 4);
        System.out.println(avg);
    }

    public static void main(String[] args) {
        Marks [] mark={new A(88,98,48),new B(99,100,75,88)};

        for (Marks m:mark){
            m.getPercentage();
        }
    }
}
