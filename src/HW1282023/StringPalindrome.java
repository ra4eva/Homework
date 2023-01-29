package HW1282023;

public class StringPalindrome {
    Boolean ifPalindrome(String input) {
        StringBuilder str = new StringBuilder(input);
        if (input.equals(str.reverse().toString())) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        StringPalindrome str=new StringPalindrome();
        System.out.println(str.ifPalindrome("tacocat"));
    }
}