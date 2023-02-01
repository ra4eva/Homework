package HW1292023;

public class VowelsString {

    private static String vowels(String str){
        return str.replaceAll("[^aeiouAEIOU]"," ");
    }

    public static void main(String[] args) {
        System.out.println(VowelsString.vowels("I love Java"));

    }
}
