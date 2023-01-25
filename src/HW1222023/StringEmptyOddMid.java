package HW1222023;

public class StringEmptyOddMid {
    public static void main(String[] args) {
        String str="Good Vibes Only";

        int mid=str.length()/2;

       if (!str.isEmpty()&&str.length()>=3&&str.length()%2!=0){
           System.out.println(str.charAt(mid));
       }
    }
}
