package cardgame.entities;

import java.util.ArrayList;

public class Hand {
    protected ArrayList<Card> cards;

    public Hand() {
        cards = new ArrayList<Card>();
    }

    public void clear() {
        cards.clear();
    }

    public void add(Card c) {
        cards.add(c);
    }

    public String showHand() {
        String str = "";
        for (Card c : cards) {
            str += c.toString() + "\n";
        }
        if (str.length() == 0) {
            str = "Nothing to display, empty hand!";
        }
        return str;
    }

    public boolean give (Card card, Hand otherHand) {
        if (!cards.contains(card)) {
            return false;
        } 
        else {
            cards.remove(card);
            otherHand.add(card);
            return true;
        }
    }


}
