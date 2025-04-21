package org.example.topik4;

public class Exercise2 {
    public static void main(String[] args) {

        int cash = 500;

        int [] requests = {60,20,100,80,40,300,200,100};

        boolean noMoreMoney = false;

        for (int i = 0; i < requests.length; i++) {

                if (!noMoreMoney){
                    System.out.println("Cash in the pot: " + cash);
                    System.out.print("Loan amount requested: " + requests[i]);
                }

                if (cash > requests[i]) {
                    System.out.println( " - loan amount granted!");
                    cash -= requests[0];
                    System.out.println();
                    continue;
                }

                if (cash < requests[i] && cash != 0) {
                    System.out.println("The exact loan request amount cannot be processed in full " +
                            "(insufficient funds available)" + "/n" + "However, we will give you what we can... " + cash );
                    cash = 0;
                    System.out.println();
                    System.out.println("Cash in the pot: " + cash);
                    System.out.println();
                    System.out.println("The following loan amount requests could not be facilitated. ");
                    noMoreMoney = true;
                    continue;
                }

                if (cash == 0){
                    System.out.println(requests[i]);
                }

        }
    }
}
