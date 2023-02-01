package HW1292023;

public class RevString1 {
        public static String strRev(String input) {
            return new StringBuilder(input).reverse().toString();
        }


        public static void main(String[] args) {
                //When you use static , then u can call method by (className.methodName)
                System.out.println(RevString1.strRev("I love Java"));

        }
}
