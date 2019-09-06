import java.util.Scanner;

public class InchesToFeet {


    public static void main(String[] args){
        int numInches;
        int numFeet;
        final int NUM_INCHES_IN_FEET = 12;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of inches you have >>> ");
        numInches = keyboard.nextInt();


        numFeet = numInches / NUM_INCHES_IN_FEET;
        numInches = numInches % NUM_INCHES_IN_FEET;
        System.out.print("The number of Feet is " + numFeet + " with " +
                numInches + " inches remaining.");
    }
}

