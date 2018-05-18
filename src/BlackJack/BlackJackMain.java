package BlackJack;

import java.util.ArrayList;
import java.util.Scanner;

public class BlackJackMain {
    public static void main(String[] args){
        boolean gameOver = false;

        Player player = new Player();
        Player dealer = new Player();

        Deck deck = new Deck();
        deck.setDeck();
        deck.shuffleDeck();


        Scanner scan = new Scanner(System.in);


        player.Hand.add(deck.getDeck().get(0));
        player.Hand.add(deck.getDeck().get(1));


        dealer.Hand.add(deck.getDeck().get(deck.getDeck().size()-3));
        dealer.Hand.add(deck.getDeck().get(deck.getDeck().size()-4));


        int cnt = 2;
        int dealerCnt = deck.getDeck().size() - 5;

        while(!gameOver){
            cnt++;
            dealerCnt--;

            for(Card card : player.getHand()){
                player.totalVal += card.getValue();
            }

            for(Card card : player.getHand()){
                System.out.println(card.toString());
            }

            for(Card card : dealer.getHand()){
                dealer.totalVal += card.getValue();
            }

            if(dealer.totalVal < 16){
                dealer.Hand.add(deck.getDeck().get(dealerCnt));
                //dealer.totalVal = 0;
            }
            if(dealer.totalVal == 21){
                gameOver = false;
            }

            System.out.println("Your total points are > " + player.totalVal);
            if(player.totalVal == 21){
                gameOver = true;
                System.out.println("BlackJack! You win!");
            }

            if(player.totalVal > 21){
                gameOver = true;
                System.out.println("You Busted and the dealer has > " + dealer.totalVal);
            }

            if(dealer.totalVal > 21 && player.totalVal < 21){
                System.out.println("You win with " + player.totalVal + " and the dealer busted with " + dealer.totalVal);
            }

            if(player.totalVal < 21){
                System.out.println("Would you like another card > ");
                if(scan.nextLine().equals(("y"))) {
                    player.Hand.add(deck.getDeck().get(cnt));
                    player.totalVal = 0;
                    dealer.totalVal = 0;
                }
                else{
                    if(player.totalVal <= dealer.totalVal){
                        System.out.println("You Lose with " + player.totalVal + " and the dealer has " + dealer.totalVal);
                        gameOver = true;
                        break;
                    }else{
                        System.out.println("You win with " + player.totalVal + " and the dealer has " + dealer.totalVal);
                        gameOver = true;
                        break;
                    }
                }
            }
        }
    }
}
