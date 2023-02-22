package HW2192023;

import java.util.Iterator;
import java.util.LinkedList;

public class Card {
    Double interestRate;

    String cardType;

    Card(Double rate, String card) {
        interestRate = rate;
        cardType = card;
    }


    public static void main(String[] args) {
        Card card1 = new Card(17.0, "Capital One");
        Card card2 = new Card(19.0, "Amex");
        Card card3 = new Card(21.0, "Visa");

        LinkedList<Card> cards = new LinkedList<>();
        cards.add(card1);
        cards.add(card2);
        cards.add(card3);

        System.out.println("Method 1");
        for (Card card : cards) {
            System.out.println(card.cardType + "'s Interest rate is:  " + card.interestRate);
        }
        System.out.println();
        System.out.println("Method 2");
        Iterator<Card> c = cards.iterator();
        while (c.hasNext()) {
            Card card = c.next();
            System.out.println(card.cardType + "'s Interest rate is:  " + card.interestRate);

        }
    }
}
