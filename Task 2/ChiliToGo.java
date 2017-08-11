/**
 * Created by jc428352 on 11/08/17.
 */
import java.util.Scanner;
public class ChiliToGo {
    public static void main(String[] args){
        int adultMeal = 7;
        int childsMeal = 4;
        int numAdultMeals;
        int numChildsMeals;
        Scanner userInput = new Scanner( System.in );
        System.out.println("Please enter number of adult meals ");
        numAdultMeals = userInput.nextInt();
        System.out.println("Please enter number of Childs meals ");
        numChildsMeals = userInput.nextInt();
        System.out.println("Money collected for adults meal: " + (adultMeal*numAdultMeals) + "\n" + "Money collected for childs meal: " + (childsMeal*numChildsMeals) + "\n" + "Total: " + ((numAdultMeals*adultMeal) + (numChildsMeals*childsMeal)));
    }
}
