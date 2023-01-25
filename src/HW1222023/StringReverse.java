package HW1222023;

public class StringReverse {
    public static void main(String[] args) {
        String str1="Good vibes only";

        for (int i =str1.length()-1; i >=0; i--) {
            System.out.print(str1.charAt(i));
        }
    }
}
