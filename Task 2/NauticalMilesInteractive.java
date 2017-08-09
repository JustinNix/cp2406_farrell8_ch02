import javax.swing.JOptionPane;
public class NauticalMilesInteractive {
    public static void main(String[] args){
        double kmInNauticalMile = 1.852;
        double milesInNauticalMile = 1.150779;
        String numOfNauticalMiles;
        double numOfNauticalMilesInt;
        numOfNauticalMiles = JOptionPane.showInputDialog(null,"Enter number of nautical miles", "Nautical Miles Converter",
                JOptionPane.INFORMATION_MESSAGE);
        numOfNauticalMilesInt = Integer.parseInt(numOfNauticalMiles);
        System.out.println("Number of Nautical Miles: " + numOfNauticalMilesInt + "\n" + "Number of KM: " + (numOfNauticalMilesInt*kmInNauticalMile) + "\n" + "Number of Miles: " + (numOfNauticalMilesInt*milesInNauticalMile));
    }
}

