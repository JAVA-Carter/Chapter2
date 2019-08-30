import java.util.Scanner;

public class SimpCalc {
    public static void main(String[] args) {
//        int x = 2145000000;
//        double y = 9.9999999;
//        byte z = 12;
//        long l = 1900000000000000000L;
//        short s = 32767;


        // System.out.println(x + " number is how large a data set you can use and it is also\n" +
        //" 4bytes in size.");
        //System.out.println(y + " double data type number is larger than int but in decimals");
        //System.out.println(z+ " a byte date type is rather small in suze and is only 1 byte.");
        //System.out.println(l + " long ata type and takes 8 bytes." );
        //System.out.println(s + " short data type is only 2 bytes of memory");
        double entry1;
        double entry2;
        double total;
        System.out.println("Enter a  number >>>> ");
        Scanner inputDevice = new Scanner(System.in);
        entry1 = inputDevice.nextDouble();
        System.out.println("Enter another number >>>> ");
        entry2 = inputDevice.nextDouble();

        total = entry1 + entry2;
        System.out.println(entry1 +" + " + entry2 + " = "+ total);
        total = entry1 * entry2;
        System.out.println(Sys)
    }

}
