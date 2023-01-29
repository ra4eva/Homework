package HW1242023;

public class StringReverseAsghar {
    public static void main(String[] args) {
        String str = "this is sentence I want toe reverse";
        String[] strArr = str.split(" "); //spilts the wrods in the sentence
/*
        for (String word:strArr){
        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.print(" ");*/

        for (String word : strArr) {
            StringBuilder st = new StringBuilder(word);
            st.reverse();
            System.out.print(st);
            System.out.print(" ");

           /* for (String word:strArr) {
                System.out.println(new StringBuilder(word).reverse()+" ");*/
            }
        }
    }
