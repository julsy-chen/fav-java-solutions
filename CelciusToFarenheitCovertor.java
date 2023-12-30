import java.util.Scanner;

public class CelciusToFarenheitCovertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object

        System.out.println("Insert temperature in Celsius: "); // Get user input
        String user_input = sc.nextLine();

        // processing
        double temp = Double.parseDouble(user_input);
        double farenheit= (temp * (9.0 / 5.0)) + 32.0;

        System.out.println("The converted temperature is: " + farenheit);

        sc.close();
    }
}
