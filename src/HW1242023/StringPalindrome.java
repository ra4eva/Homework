package HW1242023;

public class StringPalindrome {
    public static void main(String[] args) {
        System.out.println("Is this a Palindrome?");
        String str="radar";
        String revStr="";
        int strLength = str.length();

        for (int i = (strLength - 1); i >=0; --i) {
            revStr = revStr + str.charAt(i);
        }
        if (str.toLowerCase().equals(revStr.toLowerCase())){
            System.out.println("true: " +str);
        }else{
            System.out.println("False: " +str);
        }
    }
}
