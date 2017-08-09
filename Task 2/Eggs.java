import javax.swing.JOptionPane;
public class Eggs {
    public static void main(String[] args){
        double dozenCost = 3.25;
        double individualCost = 0.45;
        int numOfEggsInt;
        String numOfEggs;
        numOfEggs = JOptionPane.showInputDialog(null,"Enter the number of eggs you would like", "Eggs",
                JOptionPane.INFORMATION_MESSAGE);
        numOfEggsInt = Integer.parseInt(numOfEggs);
        System.out.println("You have ordered " + numOfEggsInt + " eggs. Thats " + (numOfEggsInt/12) + " dozens at $3.25 each and " + (numOfEggsInt%12) + " loose eggs at 45 cents each for a total of " + (((numOfEggsInt/12)*dozenCost) + ((numOfEggsInt%12)*individualCost)));

    }
}
