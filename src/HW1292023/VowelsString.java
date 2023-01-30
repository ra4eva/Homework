package HW1292023;

public class VowelsString {

    private String vowels(String str){
        return str.replaceAll("[^aeiou]"," ");
    }

    public static void main(String[] args) {
        VowelsString a=new VowelsString();
        System.out.println(a.vowels("I love Java"));

    }
}
