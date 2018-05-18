package BlackJack;

import java.util.ArrayList;

public class Player {
    public ArrayList<Card> Hand = new ArrayList<>();
    public int Chips = 100;
    public int totalVal = 0;


    public ArrayList<Card> getHand() {
        return Hand;
    }

    @Override
    public String toString() {
        for(Card card : getHand()){
            return card.toString();
        }
        return "";
    }
}
