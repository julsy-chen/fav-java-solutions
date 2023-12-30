import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Gather User Inputs
        System.out.println("Enter your first value: ");
        String input1 = sc.nextLine();
        
        System.out.println("enter your second value: ");
        String input2 = sc.nextLine();
        
        //Conversions
        Double num1 = Double.parseDouble(input1);
        Double num2 = Double.parseDouble(input2);
        
        //Processing
        Double sum = num1 + num2;
        Double difference = num1 - num2;
        Double product = num1 * num2;
        Double quotient = num1 / num2;
        
        //Output
        System.out.println("sum: " + sum + "; difference: " + difference + "; product: " + product + "; quotient: " + quotient);

        sc.close();
    }
}