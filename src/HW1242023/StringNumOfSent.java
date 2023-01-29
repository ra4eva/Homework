package HW1242023;

public class StringNumOfSent {
    public static void main(String[] args) {
        String str="It is saturday? Is it raining? Do we have a Java Class today?";
        String [] strArr=str.split("[?]");
        System.out.println(strArr.length);
        System.out.println(strArr[2]);//Which sent it will print
        System.out.println(str.split("[?]").length);//----->this is best method to find num of sent by "?".
    }
}
