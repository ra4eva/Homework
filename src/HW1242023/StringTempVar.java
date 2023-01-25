package HW1242023;

import com.sun.tools.javac.Main;

public class StringTempVar {
    public static void main(String[] args) {
        String str="Hello";
        String str1="World";

        System.out.println(str+ " before swapping with " +str1);

        str=str+str1;

        str1=str.substring(0,str.length()-str1.length());

        str=str.substring(str1.length());

        System.out.println(str+ " after swapping with " +str1);



    }
}
