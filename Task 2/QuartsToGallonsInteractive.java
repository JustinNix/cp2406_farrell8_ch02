import javax.swing.JOptionPane;
public class QuartsToGallonsInteractive {
    public static void main(String[] args){
        int quartsInGallon = 4;
        String quartsForJob;
        int quartsForJobInt;
        quartsForJob = JOptionPane.showInputDialog(null,"Enter number of paint quarts required", "Required Paint",
                JOptionPane.INFORMATION_MESSAGE);
        quartsForJobInt = Integer.parseInt(quartsForJob);
        System.out.println("A job that needs " + quartsForJobInt + " quarts, requires " + (quartsForJobInt/quartsInGallon) + " gallons " + (quartsForJobInt%quartsInGallon) + " quarts of paint");
    }
}
