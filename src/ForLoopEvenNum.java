public class ForLoopEvenNum {
    public static void main(String[] args) {
        for (int i = 20; i >=1; i -= 2) {
            System.out.println(i);
        }
        System.out.println("********");
        for (int i2=10; i2>0; i2--) {
            System.out.println(i2*2);
        }
        System.out.println("********");
        for (int i3=20; i3>0; i3--){
            if (i3%2==0){
                System.out.println(i3);
            }
        }
    }
}
