package HW2192023;

import java.util.ArrayList;

public class Words {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("Set");
        words.add("Your");
        words.add("Heart");
        words.add("Ablaze");

        words.removeIf(word->word.endsWith("e"));

        System.out.println(words);

    }
}
