import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args){
        int monkeys = 5;
        int monkeyAdd;
        int bed;


        System.out.println("Number of monkeys = " + monkeys);

        bed = monkeys;

        System.out.println("Number of monkeys jumping on the bed = " + bed);
        System.out.println("How many monkeys are added to the bed? >>>");
        Scanner inputdevice = new Scanner(System.in);
        monkeyAdd = inputdevice.nextInt();

        bed = monkeys + monkeyAdd;

        System.out.println("There are now " + bed + " monkeys jumping on the bed");

        if(bed > 9) {
            bed = bed/2;
            System.out.println("Due to there being too many monkeys jumping on the bed\n" +
            "Half fell off and now there are only" + bed + " monkeys jumping on the bed");
        }

    }


}

