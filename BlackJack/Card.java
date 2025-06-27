public class Card {
    private String suit;
    private String rank;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
    public int getRankNum(boolean aceHigh) {
        try {
            // Try to parse ranks 2-10 directly
            return Integer.parseInt(rank);
        } catch (NumberFormatException e) {
            // If it's not a number, it must be a face card or Ace
            switch (rank) {
                case "Jack":
                    return 10;
                case "Queen":
                    return 10;
                case "King":
                    return 10;
                case "Ace":
                    return aceHigh ? 11 : 1; // Dynamic Ace value
                default:
                    throw new IllegalArgumentException("Unknown card rank: " + rank);
            }
        }
    }
}