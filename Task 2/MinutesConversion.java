import java.util.Scanner;

/**
 * Created by jc428352 on 11/08/17.
 */
public class MinutesConversion {
    public static void main(String[] args){
        Scanner userInput = new Scanner( System.in );
        int minutes;
        double hour = 60.0;
        double day = 1440.0;
        System.out.println("Enter number of minutes: ");
        minutes = userInput.nextInt();
        System.out.println("Minutes entered: " + minutes + "\n" + "Hours: " + (minutes/hour) + "\n" + "Days: " + (minutes/day));
    }
}
