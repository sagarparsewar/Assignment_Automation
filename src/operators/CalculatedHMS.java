package operators;
import java.util.Scanner;

public class CalculatedHMS {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // prompt the user to enter the number of seconds
        System.out.print("Enter the number of seconds: ");
        int totalSeconds = input.nextInt();
        
        // calculate the hours, minutes, and seconds
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        
        // display the result
        System.out.println(totalSeconds + " seconds is equivalent to " + hours + " hour(s), " + minutes + " minute(s), and " + seconds + " second(s).");
    }
}


