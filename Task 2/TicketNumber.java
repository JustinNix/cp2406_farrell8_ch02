import java.util.Scanner;

/**
 * Created by jc428352 on 11/08/17.
 */
public class TicketNumber {
    public static void main(String[] args){
        Scanner userInput = new Scanner( System.in );
        int ticketNum;
        System.out.println("please enter ticket number: ");
        ticketNum = userInput.nextInt();
        int lastTicketNumInt = ticketNum%10;
        int newTicketNumInt = ticketNum/10;
        boolean result = (newTicketNumInt%7) == lastTicketNumInt;
        System.out.println(result);

    }
}
