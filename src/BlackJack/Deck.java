package BlackJack;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> deck = new ArrayList<>();


    public void setDeck() {
        //Sets the Hearts
        for(int i = 1; i < 11; ++i){
            Card card = new Card();
            card.setValue(i);
            card.setSymbol("Hearts");
            card.setColor("Red");
            deck.add(card);
        }

        //Sets the Diamonds
        for(int i = 1; i < 11; ++i){
            Card card = new Card();
            card.setValue(i);
            card.setSymbol("Diamonds");
            card.setColor("Red");
            deck.add(card);
        }

        //Sets the Spades
        for(int i = 1; i < 11; ++i){
            Card card = new Card();
            card.setValue(i);
            card.setSymbol("Spades");
            card.setColor("Black");
            deck.add(card);
        }

        //Sets the Clubs
        for(int i = 1; i < 11; ++i){
            Card card = new Card();
            card.setValue(i);
            card.setSymbol("Clubs");
            card.setColor("Black");
            deck.add(card);
        }

        //Sets the Face Cards
        FaceCard card1 = new FaceCard(10, "Clubs", "Black", "King");
        FaceCard card2 = new FaceCard(10, "Clubs", "Black", "Queen");
        FaceCard card3 = new FaceCard(10, "Clubs", "Black", "Jack");

        deck.add(card1);
        deck.add(card2);
        deck.add(card3);

        FaceCard card4 = new FaceCard(10, "Spades", "Black", "King");
        FaceCard card5 = new FaceCard(10, "Spades", "Black", "Queen");
        FaceCard card6 = new FaceCard(10, "Spades", "Black", "Jack");

        deck.add(card4);
        deck.add(card5);
        deck.add(card6);

        FaceCard card7 = new FaceCard(10, "Diamond", "Red", "King");
        FaceCard card8 = new FaceCard(10, "Diamond", "Red", "Queen");
        FaceCard card9 = new FaceCard(10, "Diamond", "Red", "Jack");

        deck.add(card7);
        deck.add(card8);
        deck.add(card9);

        FaceCard card10 = new FaceCard(10, "Hearts", "Red", "King");
        FaceCard card11 = new FaceCard(10, "Hearts", "Red", "Queen");
        FaceCard card12 = new FaceCard(10, "Hearts", "Red", "Jack");

        deck.add(card10);
        deck.add(card11);
        deck.add(card12);
    }

    public ArrayList<Card> getDeck(){
        return deck;
    }

    public void shuffleDeck(){
        Collections.shuffle(deck);

    }
}
