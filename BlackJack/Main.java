
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Card> cards = Deck.buildDeck();

        LinkedList <Card> myhand = new LinkedList<>();
        LinkedList <Card> dealhand = new LinkedList<>();

        for (int i = 0; i < 2; i++){
        myhand.add(cards.pop());
        dealhand.add(cards.pop());
        }


        boolean mybust = false;
        boolean dealbust = false;
        boolean istand = false;
        boolean dealstand = false;

        while ((mybust == false && dealbust == false) && (istand == false || dealstand == false)){
            Scanner sc = new Scanner(System.in);
            System.out.println("Hit or Stand:");
            String input = sc.nextLine();

            if ("h".equals(input)){
                // hit
            } else if ("s".equals(input)){
                // stand
            } else {
                // invalid: standing by default
            }
        }
        
    }
}
