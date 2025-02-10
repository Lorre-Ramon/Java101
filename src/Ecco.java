import java.util.Scanner; // Import statements can’t be inside a class deﬁnition.

public class Ecco {

    public static void main(String[] args) {
        String line; // define a str type variable: line
        Scanner in = new Scanner(System.in);

        System.out.print("Try type in something: ");
        line = in.nextLine(); // intake the input into variable: line
        System.out.println("You said: " + line);
    }
}
