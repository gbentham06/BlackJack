
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

        int mysum = 0, dealsum = 0;
        boolean mybust = false;
        boolean dealbust = false;
        boolean istand = false;
        boolean dealstand = false;

        Card myupcard = myhand.getFirst();
        Card dealerupcard = dealhand.getFirst();

        while (istand == false || dealstand == false){
            mysum = 0; dealsum = 0;

            for (Card c: myhand){
                mysum = mysum + c.getRankNum(false);
            }

            for (Card c: dealhand){
                dealsum = dealsum + c.getRankNum(false);
            }

            if (mysum > 21){
                mybust = true;
                break;
            } else if (dealsum > 21){
                dealbust = true;
                break;
            }

            Scanner sc = new Scanner(System.in);
            System.out.println("Your Hand is:");
            for (Card c: myhand){
                System.out.println("- "+ c);
            }
            System.out.println("You total is: " + mysum);
            System.out.println("The dealer's Upcard is: " + dealerupcard);
            System.out.println("Hit or Stand:");
            String input = sc.nextLine();

            if ("h".equals(input)){
                myhand.add(cards.pop());
            } else if ("s".equals(input)){
                istand = true;
            } else {
                // invalid: standing by default
            }

            if (dealsum < 17){
                dealhand.add(cards.pop());
            }
        }

        System.out.println("You: " + mysum + " House: " + dealsum);

        if (dealbust == true && mybust == true){
            System.out.println("Both bust, house wins");
        } else if (dealbust == true){
            System.out.println("House bust, You win!");
        } else if (mybust == true){
            System.out.println("You Bust, House wins");
        } else{

            if (mysum > dealsum){
                System.out.println("You win!");
            } else {
                System.out.println("House wins");
            }
        }
        
    }
}
