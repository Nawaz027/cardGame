
package cardgame;

import cardgame.entities.Deck;

public class App {

    public static void main(String[] args) {
        // System.out.println("Hellloooooooo");
        // Card c1 = new Card(Rank.NINE, Suit.CLUBS);
        // Card c2 = new Card(Rank.ACE, Suit.DIAMONDS);
        // Hand h1 = new Hand();
        // Hand h2 = new Hand();
        // h1.add(c1);
        // h1.add(c2);
        // h1.give(c1, h2);
        // h1.clear();
        // System.out.println(h1.showHand());
        // System.out.println(h2.showHand());

        Deck d1 = new Deck();
        d1.populate();

        System.out.println("Deck has these cards initially:  " + d1.showHand());
        d1.shuffle();
        System.out.println("Now the deck is shuffled: " + d1.showHand());

    }
}
