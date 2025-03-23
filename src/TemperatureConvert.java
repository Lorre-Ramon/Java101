// Exercise 3.2

import java.util.Scanner;

public class TemperatureConvert { 

    public static void main(String[] args){ 
        
        // define variables
        double cel, fah;
        Scanner in = new Scanner(System.in);


        System.out.println("This script is designed only to convert Celsius to Fahrenheit.");
        System.out.print("How many Celsius? ");
        cel = in.nextDouble();
        
        fah = cel * 9 / 5.0 + 32;

        System.out.printf("%.1f Celsius is %.1f Fahrenheit. \nCiao.", cel, fah);
    }
}