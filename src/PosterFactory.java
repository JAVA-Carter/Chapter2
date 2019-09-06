import javax.swing.*;

public class PosterFactory {
    public static void main(String[] args){

        int postersBought;
        int boxesFilled;
        int postersRemain;
        String postersBoughtString;
        final int BOX_LIMIT = 11;

        postersBoughtString = JOptionPane.showInputDialog(null, "How many posters ordered today",
                "Order Dialog", JOptionPane.INFORMATION_MESSAGE);
        postersBought = Integer.parseInt(postersBoughtString);

        boxesFilled = postersBought/BOX_LIMIT;
        postersRemain = postersBought % BOX_LIMIT;

        JOptionPane.showMessageDialog(null, "You have filled" + boxesFilled + " boxes, with"
                + postersRemain + "posters left over");


    }
}
