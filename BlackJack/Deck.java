import java.util.Collections;
import java.util.LinkedList;

public class Deck {

    public static LinkedList<Card> buildDeck() {
        LinkedList<Card> deck = new LinkedList<>();

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(new Card(suit, rank));
            }
        }

        Collections.shuffle(deck);

        return deck;
    }

    public static void printDeck(LinkedList<Card> deck) {
        for (Card card : deck) {
            System.out.println(card);
        }
    }
}