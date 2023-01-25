package HW1242023;

public class StringReverse {
    public static void main(String[] args) {
        String input = "This is sentence I want to reverse";
        String[] words = input.split(" ");
        StringBuilder str = new StringBuilder();

        for (String word : words) {
            str.append(new StringBuilder(word).reverse().toString() + " ");
        }
        String output = str.toString().trim();
        System.out.println(output);
    }
}
