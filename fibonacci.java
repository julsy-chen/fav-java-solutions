import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Variables
        int sum = 1;
        int prevTerm = 0;

        //User Inputs
        System.out.println("Term Number: ");
        String input = sc.nextLine();
        int term = Integer.parseInt(input);

        //For Loop
        for (int i = 2; i <= term; i++) {
            sum = sum + prevTerm;
            prevTerm = sum - prevTerm;
        }

        if (term == 0) {
            System.out.println("0");
        }
        else {
            System.out.println(sum);
        }

        sc.close();
  } 
}
