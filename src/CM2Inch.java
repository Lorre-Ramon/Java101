import java.util.Scanner;

public class CM2Inch {

    public static void main(String[] args){
        int inch, feet, remainder;
        double cm;
        Scanner in = new Scanner(System.in);
        final double CM_PER_INCH = 2.54;
        final int IN_PER_FOOT = 12;

        System.out.print("How many centimeters? ");
        cm = in.nextDouble();

        inch = (int) (cm / CM_PER_INCH);
        feet = inch / IN_PER_FOOT;
        remainder = inch % IN_PER_FOOT;
        // System.out.printf("%.3f cm is %d ft, %d in\n", cm, feet, remainder);
        System.out.printf("%.3f cm is %d ft, %d in\n", cm, feet, remainder);

    }
}
