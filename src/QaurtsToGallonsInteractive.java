import java.util.Scanner;

public class QaurtsToGallonsInteractive {

    public static void main(String[] args){
        int numQuarts;
        int numGallons;
        int quartRemaining;
        final int NUM_QUARTS_IN_GALLONS = 4;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of quarts you have >>> ");
        numQuarts = keyboard.nextInt();


        numGallons = numQuarts / NUM_QUARTS_IN_GALLONS;
        quartRemaining = numQuarts % NUM_QUARTS_IN_GALLONS;
        System.out.print("The number of Gallons is " + numGallons + " with " +
                quartRemaining + " quarts remaining.");
    }
}
