package HW1242023;

public class StringNumOfSent {
    public static void main(String[] args) {
        String str="It is saturday? Is it raining? Do we have a Java Class today?";
        String [] strArr=str.split("[?]");
        System.out.println(strArr.length);
    }
}
