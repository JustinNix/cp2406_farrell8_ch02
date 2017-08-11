import java.util.Scanner;

/**
 * Created by jc428352 on 11/08/17.
 */
public class Dollars {
    public static void main(String[] args){
        Scanner userInput = new Scanner( System.in );
        double numDollars;
        System.out.println("Please enter the number of dollars: ");
        numDollars = userInput.nextDouble();
        double numTwentyCents = Math.round((numDollars/0.2) - (numDollars%2));
        System.out.println(numDollars + " Dollars, equals" + "\n" + numTwentyCents + " Twenty Cents");
        numDollars = numDollars - (numTwentyCents * 0.2);
        double numTenCents = Math.round((numDollars/0.1) - (numDollars%1));
        System.out.println(numDollars + " Dollars, equals" + "\n" + numTenCents + " Ten Cents");
        numDollars = numDollars - (numTenCents*0.1);
        System.out.println(numDollars);
        double numFiveCents = Math.round((numDollars/0.05) - (numDollars%0.5));
        System.out.println(numDollars + " Dollars, equals" + "\n" + numFiveCents + " Five Cents");


    }
}
