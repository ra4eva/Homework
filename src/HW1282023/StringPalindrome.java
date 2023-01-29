package HW1282023;

public class StringPalindrome {
    String reverseStr1(String input){
        return new StringBuilder(input).reverse().toString();
        }

    public static void main(String[] args) {
        StringPalindrome str=new StringPalindrome();
        System.out.println(str.reverseStr1("Good Vibes Only"));

    }
}