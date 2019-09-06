import java.util.Scanner;

public class Eggs {

    public static void main(String[] args){
        double price;
        double numDozen;
        double numIndy;
        double dozen;
        double indy;
        final double DOZEN_PRICE = 3.25;
        final double INDY_PRICE = 0.45;


        System.out.print("How many dozen(s) of eggs do you want >>> ");
        Scanner keyboard = new Scanner(System.in);
        dozen = keyboard.nextInt();
        System.out.print("How many individual eggs do you want >>> ");
        indy = keyboard.nextInt();

        numDozen = (dozen * DOZEN_PRICE);
        numIndy = indy * INDY_PRICE;

        price = numDozen + numIndy;

        System.out.println("Your price is $" + price);


    }


}
