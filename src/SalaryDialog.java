import javax.swing.*;

public class SalaryDialog {

    public static void main(String[] args){

        String wageString;
        String dependentString;
        int dependents;
        double wage;;
        double weeklypay;
        final double Hours_IN_WEEK = 37.5;
        boolean isYes;
        int selection;

        wageString = JOptionPane.showInputDialog(null, "Enter employee's hourly wage",
                "Salary Dialog 1", JOptionPane.INFORMATION_MESSAGE);
        weeklypay = Double.parseDouble(wageString) * Hours_IN_WEEK;
        dependentString = JOptionPane.showInputDialog(null, "How many dependents",
                "Salary Dialog", JOptionPane.QUESTION_MESSAGE);
        dependents = Integer.parseInt(dependentString);


        JOptionPane.showMessageDialog(null, "Weekly salary is $" +
        weeklypay + "\nDeductions will be made for " + dependents + " dependents");

        selection = JOptionPane.showConfirmDialog(null, "Are we correct?");
        isYes = (selection == JOptionPane.YES_OPTION);
        JOptionPane.showMessageDialog(null, "You have gave us " + isYes + "info.");



    }

}
