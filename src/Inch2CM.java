import java.util.Scanner;

public class Inch2CM {

    public static void main(String[] args){
        int inch;
        double cm;
        final double CM_PER_INCH = 2.54; // Assign any literal to a meaningful variable for clarity and better maintenance
        // Declaring that a variable is final (called Constants) means that it cannot be reassigned once it has been initialized.
        // If you try, the compiler gives an error.
        Scanner input = new Scanner(System.in);

        System.out.print("How many inches? ");
        inch = input.nextInt(); // Because inch is an int type, we will have to use input.nextInt() instead of .nextLine()

        cm = inch * CM_PER_INCH;
        System.out.printf("%d in = %.2f cm\n", inch, cm);
        // just like what we do in C, the f in printf stands for `formatted`

    }
}
