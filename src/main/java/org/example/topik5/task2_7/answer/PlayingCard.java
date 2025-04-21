package org.example.topik5.task2_7.answer;

public class PlayingCard{

    // Attributes
    private int cardID;   // ex: 1
    private CardSuits suit;  // ex: SPADES
    private FaceValue faceValue; // ex: JACK
    private int cardValue;  // 11

    // Constructor
    public PlayingCard(int cardID, CardSuits suit, int cardValue){
        this.cardID = cardID;
        this.suit = suit;
        this.cardValue = cardValue;
        setFaceValue(cardValue); // call setter.
    }

    // Accessor Methods
    public void setCardID(int cardID){
        this.cardID = cardID;
    }

    public int getCardID(){
        return cardID;
    }

    public void setCardSuit(CardSuits suit){
        this.suit = suit;
    }

    public CardSuits getCardSuit(){
        return suit;
    }

    public void setFaceValue(int faceValue){
        // Determine the face value
        switch(faceValue){
            case 1: this.faceValue = FaceValue.ACE;
                break;
            case 2: this.faceValue = FaceValue.TWO;
                break;
            case 3: this.faceValue = FaceValue.THREE;
                break;
            case 4: this.faceValue = FaceValue.FOUR;
                break;
            case 5: this.faceValue = FaceValue.FIVE;
                break;
            case 6: this.faceValue = FaceValue.SIX;
                break;
            case 7: this.faceValue = FaceValue.SEVEN;
                break;
            case 8: this.faceValue = FaceValue.EIGHT;
                break;
            case 9: this.faceValue = FaceValue.NINE;
                break;
            case 10: this.faceValue = FaceValue.TEN;
                break;
            case 11: this.faceValue = FaceValue.JACK;
                break;
            case 12: this.faceValue = FaceValue.QUEEN;
                break;
            case 13: this.faceValue = FaceValue.KING;
                break;
            default: System.out.println("Program error - unreachable code.");
        }// switch

    }// method

    public void setCardValue(int cardValue){
        this.cardValue = cardValue;
    }// method

    public int getCardValue(){
        return cardValue;
    }// method

    public FaceValue getFaceValue(){
        return faceValue;
    }

    public String toString(){
        return getFaceValue() + " of " + getCardSuit();
    }

}// class