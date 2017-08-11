import java.util.Scanner;

/**
 * Created by jc428352 on 11/08/17.
 */
public class ChilliToGoProfit {
    public static void main(String[] args){
        double adultMealPrice = 7.0;
        double childsMealPrice = 4.0;
        double adultMealCost = 4.35;
        double childsMealCost = 3.10;
        int numAdultMeals;
        int numChildsMeals;
        Scanner userInput = new Scanner( System.in );
        System.out.println("Please enter number of adult meals ");
        numAdultMeals = userInput.nextInt();
        System.out.println("Please enter number of Childs meals ");
        numChildsMeals = userInput.nextInt();
        double adultMealProfit = (numAdultMeals*adultMealPrice) - (numAdultMeals*adultMealCost);
        double childMealProfit = (numChildsMeals*childsMealPrice) - (numChildsMeals*childsMealCost);
        System.out.println("Profit for adults meal: " + adultMealProfit + "\n" + "Money collected for childs meal: " + childMealProfit + "\n" + "Total: " + (adultMealProfit + childMealProfit));
    }
}
