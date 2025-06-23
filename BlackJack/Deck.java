
import java.util.LinkedList;

public class Deck {

    LinkedList<String> buildDeck(){
        LinkedList<String> out = new LinkedList<>();
        String[] suits = {"♠", "♥", "♦", "♣"};

        for (int i = 1; i < 14; i++){;
            for (String suit : suits){
            switch (i) {
                case 1 -> out.add("A" + suit);
                case 11 -> out.add("J" + suit);
                case 12 -> out.add("Q" + suit);
                case 13 -> out.add("K" + suit);
                default -> out.add(Integer.toString(i) + suit);
            }
            }
        }

        return out;
    }
}
