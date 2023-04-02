package cardgame.entities;

public class Card {
    private Suit suit;
    private Rank rank;
    private boolean isFaceup;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
        isFaceup = false;
    }

    public String getSuit() {
        return suit.printSuit();
    }

    public int getRank(){
        return rank.getRank();
    }

    public void flipCard() {
        if (!isFaceup) {
            isFaceup = true;
        } else {
            isFaceup = false;
        }
        
    }


    @Override
    public String toString() {
        String str = "";
        if (isFaceup) {
            str += rank.printRank() + " of " + suit.printSuit();
        }
        else {
            str = "Face Down (Nothing to see)";
        }
       
        return str;
    }

}
