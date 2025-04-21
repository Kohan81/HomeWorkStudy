package org.example.topik5.task2_7.answer;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    // Instance Variables
    ArrayList<PlayingCard> cardDeck = new ArrayList<PlayingCard>(); // store the card deck.
    ArrayList<PlayingCard> cardsInPlay = new ArrayList<PlayingCard>(); // the cards in play.

    public static void main(String[] args){
        Main obj = new Main();
        obj.createCards();
        obj.playGame();
        obj.determineOutcome();
    }// main

    public void createCards(){
        // The deck has 52 cards.
        // 13 cards per suit.

        int cardID = 1;

        // Hearts
        for(int i=1; i<=13; i++){
            cardDeck.add(new PlayingCard(cardID++,CardSuits.HEARTS, i));
        }// loop

        // Spades
        for(int i=1; i<=13; i++){
            cardDeck.add(new PlayingCard(cardID++,CardSuits.SPADES, i));
        }// loop

        // Clubs
        for(int i=1; i<=13; i++){
            cardDeck.add(new PlayingCard(cardID++,CardSuits.CLUBS, i));
        }// loop

        // Diamonds
        for(int i=1; i<=13; i++){
            cardDeck.add(new PlayingCard(cardID++,CardSuits.DIAMONDS, i));
        }// loop

    }// method

    public void playGame(){
        loop: while(cardsInPlay.size() < 3){
            // We can label a loop if we so wish.
            // Generate a random number from 1-52 inc.
            int randomNo = new Random().nextInt(53); // 0 to 52
            if( (randomNo == 0) || determineIfCardInPlay(randomNo) ){
                // bad card
                continue loop;
            }else{
                cardsInPlay.add(cardDeck.get(randomNo-1)); // ArrayList is zero-based.
            }
        }// loop
    }// method

    public boolean determineIfCardInPlay(int randomNo){
        for(PlayingCard pc:cardsInPlay){
            if(randomNo == pc.getCardID()){
                return true;
            }else{
                return false;
            }
        }// for
        return false;
    }// method

    public void determineOutcome(){
        final int pointsCeiling = 21;
        int gameTally = 0;
        for(PlayingCard pc:cardsInPlay){
            gameTally += pc.getCardValue();
            System.out.println(pc.toString());
        }// loop

        System.out.println("Your score is: " + gameTally);

        if(gameTally <= pointsCeiling){
            System.out.println("Result - Victory - You beat the house!");
        }else{
            System.out.println("Result - Defeat - house wins!");
        }
    }// method

}// class