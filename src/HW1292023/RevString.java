package HW1292023;

public class RevString {
    public String strRev(String str){
        StringBuilder st=new StringBuilder(str);
        StringBuilder a=st.reverse();
        String reversed=a.toString();
        for (int i = reversed.length()-1; i >=0; i--) {
            return reversed;

         /*   StringBuilder st = new StringBuilder(str);
            st.reverse();
            String revSt = st.toString();
            return revSt;*/ //---->another way to do it
        }
        return str;
    }

        public static void main(String[]args){
        RevString str=new RevString();
        System.out.println(str.strRev("I Love Java"));

        }
}
