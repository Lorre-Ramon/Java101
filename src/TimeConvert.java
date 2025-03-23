// Exercise 3.3

// Write a program that converts a total number of seconds to hours, minutes, and seconds. 
// It should (1) prompt the user for input, (2) read an integer from the keyboard, (3) calculate the result, and (4) use printf to display the output. 
// For example, "5000 seconds = 1 hours, 23 minutes, and 20 seconds".

import java.util.Scanner;

public class TimeConvert {
    
    public static void main(String[] args){ 

        // define variables
        int total_seconds, hours, minutes, seconds;
        Scanner in = new Scanner(System.in); 
        
        // prompt the user for input
        System.out.println("This script is designed to convert the total number of seconds into Hour, Minutes, and Seconds");
        System.out.println("How many seconds? ");
        total_seconds = in.nextInt();

        // conversion
        hours = total_seconds / 3600; 
        minutes = total_seconds / 60; 
        seconds = total_seconds % 60; 

        // output
        System.out.printf("%d seconds in total is %dH %dM and %dS.\n", total_seconds, hours, minutes, seconds); // Use `\n` in the end or you will have a `%` at the end of the output.
    }
}
