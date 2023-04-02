package cardgame.entities;

import java.util.Random;


public class Deck extends Hand{
    Random rand = new Random();

    public void populate() {
        for (Suit suit: Suit.values()) {
            for (Rank rank: Rank.values()) {
                Card card = new Card(rank, suit);
                card.flipCard();
                this.add(card);
            }
        }
    }

    public void shuffle() {
        for (int i = cards.size()-1; i>0; i--) {
            int pick = rand.nextInt(i);
            Card randCard = cards.get(pick);
            Card lastCard = cards.get(i);
            cards.set(i, randCard);
            cards.set(pick, lastCard);
        }
    }
}
