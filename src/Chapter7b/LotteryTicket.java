package Chapter7b;

import java.util.Random;

public class LotteryTicket {

    private static final int LENGTH = 6;
    private static final int MAX_NUMBER = 69;
    public static void main(String[] args) {
        int[] ticket = generateNumbers();
        printTicket(ticket);
        
    }

    public static int[] generateNumbers(){

        int[] ticket =new int[LENGTH];
        
        Random random = new Random();

        for(int i = 0; i < LENGTH; i++) {
        int randomNumber; 
        do{randomNumber = random.nextInt(MAX_NUMBER) + 1; 
        }while(search(ticket, randomNumber) );
            ticket[i] = randomNumber; // Generates numbers between 1 and 69
        }
        return ticket;
    }
    public static boolean search(int[] ticket, int numberToSearchFor) {

        for(int value: ticket) {
            if(value == numberToSearchFor) {
                return true;
            }
        }
                return false;
    }
    public static void printTicket(int[] ticket){

        System.out.println("Your Lottery Ticket Numbers are: " + "\n"); 
       for(int i = 0; i < LENGTH; i++) {
            System.out.print(ticket[i] + " | ");
        }
        System.out.println("\n");
        System.out.println("Good Luck!");
    }
          
}
