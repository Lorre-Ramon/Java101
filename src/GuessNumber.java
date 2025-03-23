import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args){
        // define
        Scanner in = new Scanner(System.in);


        // generate a random number  
        Random random = new Random();
        int num  = random.nextInt(100) + 1; // ranging from 1 to 100
    
        // prompt the user
        System.out.println("I'm thinking of an integer number between 1 and 100 (including both).");
        System.out.println("Can you guess what it is?");
        System.out.print("Type a number: ");
        int num_hat = in.nextInt(); 

        int diff = Math.abs(num_hat - num);
        
        // return the results to the user
        System.out.printf("Your guess is: %d\n", num_hat); 
        System.out.printf("The number I was thinking of is: %d\n", num); 
        System.out.printf("You were off by: %d\n", diff);
    }

}
