package org.example.topik4;

public class Exercise1
{
    public static void main( String[] args ) {

        int [] player1 = {10,6,8,9,7,12,7};

        int [] player2 = {7,6,9,5,2,8,11};

        int rounds = 7;

        int player1WINS = 0, player2WINS = 0;

        for (int i =0; i < rounds; i++){
            if (player1[i] < player2[i]){
                player2WINS++;
                System.out.println("Round " + (i+1) + ": " + "Player 2 wins the round : "
                        + player2[i] + " beats " + player1[i]);
            }else if (player2[i] < player1[i]){
                player1WINS++;
                System.out.println("Round " + (i+1) + ": " + "Player 1 wins the round : "
                        + player1[i] + " beats " + player2[i]);
            }else if (player1[i] == player2[i]){
                System.out.println("Round " + (i+1) + " Tie " + player1[i] + " ties with " + player2[i]);
            }
        }

       if (player1WINS < player2WINS){
           System.out.println("Player Two wins!! He won " + player2WINS + " rounds beating Player Two who won "
                   + player1WINS + " rounds");
       } else if (player1WINS > player2WINS) {
           System.out.println("Player One wins!! He won " + player1WINS + " rounds beating Player Two who won "
                   + player2WINS + " rounds" );
       } else {
        System.out.println("Tie " + player1WINS + " ties with " + player2WINS);
    }
       }
}
