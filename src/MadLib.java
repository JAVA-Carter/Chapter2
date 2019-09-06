import java.util.Scanner;

public class MadLib {
    public static void main(String[] args){
        String first;
        String second;
        String third;
        String fourth;
        String fifth;
        String sixth;


        System.out.print("Enter a Color >>> ");
        Scanner keyboard = new Scanner(System.in);
        first = keyboard.nextLine();
        System.out.print("Enter a person's name >>> ");
        second = keyboard.nextLine();
        System.out.print("Enter a word that rhymes with the last >>> ");
        third = keyboard.nextLine();
        System.out.print("Enter a Sound >>> ");
        fourth = keyboard.nextLine();
        System.out.print("Enter a animal >>> ");
        fifth = keyboard.nextLine();
        System.out.print("enter a word that rhymes with the fourth word >>> ");
        sixth = keyboard.nextLine();

        System.out.println("Just Waking up in " + first + " gotta thank " + second +
                ". I don't know, but today seems kinda " + third + " NO " + fourth + " from the" + fifth + ", no smog," +
                " and momma cook no " + sixth);
    }


}
