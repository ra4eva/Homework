public class ForLoopOddNum {
    public static void main(String[] args) {
        for (int i=20; i <50; i++) {
            if (i%2!=0)
                System.out.println(i);
        }
        System.out.println("************");
        for (int i2=21; i2 <50; i2+=2) {
            System.out.println(i2);
        }
    }
}
