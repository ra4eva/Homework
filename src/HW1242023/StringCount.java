package HW1242023;

public class StringCount {
    public static void main(String[] args) {
        String str="FutrueSalary-->125k$$$";
        int count=0;

        for (int i = 0; i <str.length() ; i++) {
            if(Character.isAlphabetic(str.charAt(i))||Character.isDigit(str.charAt(i)))
                count++;
        }
        System.out.println(count); //Method 1
        System.out.println(str.replaceAll("[^a-zA-Z0-9]","").length()); //Method 2
    }
}
