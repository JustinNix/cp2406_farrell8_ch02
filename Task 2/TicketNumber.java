import java.util.Scanner;

/**
 * Created by jc428352 on 11/08/17.
 */
public class TicketNumber {
    public static void main(String[] args){
        Scanner userInput = new Scanner( System.in );
        String ticketNum;
        System.out.println("please enter ticket number: ");
        ticketNum = userInput.next();
        String lastTicketNum = ticketNum.substring(5,6);
        String newTicketNum = ticketNum.substring(0,5);
        int lastTicketNumInt = Integer.parseInt(lastTicketNum);
        int newTicketNumInt = Integer.parseInt(newTicketNum);
        boolean result = (newTicketNumInt%7) == lastTicketNumInt;
        System.out.println(result);

    }
}
