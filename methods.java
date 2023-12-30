import java.util.ArrayList;

public class Methods {

    // Unit 1
    // Addition of Three Numbers
    /**
    * takes three numbers, adds them up, and outputs the sum
    * @param num1 is a double
    * @param num2 is a double
    * @param num3 is a double
    *
    * @return the sum of num1, num2, and num3
    */
    public static double addThreeNums(double num1, double num2, double num3) {
        double result = num1 + num2 + num3;
        return result;
    }

    // Remainder
    /**
    * takes two user inputs, divides them, and outputs the remainder
    * @param dividend is an integer
    * @param divisor is an integer
    *
    * @return the remainder as an integer of dividend divided by the divisor using modulus 
    */
    public static double remainder(int dividend, int divisor) {
        double result = dividend % divisor;
        return result;
    }

    // Unit 2
    
    // Factor Check
    /**
    * takes two user inputs and checks if the second number is a factor of the first
    * @param num1 is an integer
    * @param num2 is an integer
    *
    * @return true if num2 is a factor of num1, otherwise, return false
    */
    public static String factorCheck(int num1, int num2) {
        if (num1 % num2 == 0) {
            return "true";
        }
        else {
            return "false";
        }
    }

    // Weekend Check
    /**
    * Check if the user input day of the week is a weekend
    * @param dayOfWeek is a String
    *
    * @return true if the user input is a weekend, otherwise, return false
    */
    public static String weekendCheck(String input) {
        String dayOfWeek = input.toLowerCase();
        if (dayOfWeek == "saturday" || dayOfWeek == "sunday") {
            return "true";
        }
        else {
            return "false";
        }
    }

    // Unit 3 & 4
    
    // Factors
    /**
    * takes a user input and outputs all possible factors of this user input
    * @param num is an integer
    *
    * @return an arraylist of factors of integer num
    */
    public static ArrayList<Integer> factor(int num) {
        ArrayList<Integer> numsList = new ArrayList<Integer>();
        for (int i = 1; i <= num/2; i++) {
            if (num % i == 0) {
                numsList.add(i);
            }
        }
        numsList.add(num);
        return numsList;
    }

    // Number of Vowels
    /**
    * takes in a string input, counts the number of vowels, and outputs the number of vowels
    * @param str is a String
    *
    * @return the number of vowels in the user input
    */
    public static int vowels(String str) {
        int counter = 0;
        char[] phrase = str.toCharArray();

        for (char ch : phrase) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                counter++;
            }
        }
        return counter;
    }

    // Reverse an Integer
    /**
    * takes in an integer input and outputs the reversed number
    * @param input is an integer
    *
    * @return the reversed version of the user input integer
    */
    public static int reverse(int input) {
        String numString = Integer.toString(input);
        double num = Double.valueOf(input);

        double reversed = 0;
        for (int exponent = numString.length() - 1; exponent >= 0; exponent--) {
            double val = (num % 10) * Math.pow(10, exponent);
            reversed = reversed + val;

            num = Math.floor(num / 10); 
        }
        int answer = (int)reversed;
        return answer;
    }

    // Greatest Common Denominator
    /**
    * takes two integer user inputs and outputs the great common factor of the two
    * @param num1 is an integer
    * @param num2 is an integer
    *
    * @return the greatest common factor of the two user input integers
    */
    public static int GCD(int num1, int num2) {
        int answer = 1;
        if (num1 > num2) {
            for (int i = num2; i > 0; i--) {
                if (num1 % i == 0 && num2 % i == 0) {
                    answer = i;
                    break;
                }
            }
        }
        else {
            for (int i = num1; i > 0; i--) {
                if (num1 % i == 0 && num2 % i == 0) {
                    answer = i;
                    break;
                }
            }
        }
        return answer;
    }

    
    // Bubble Sort
    /**
    * takes integers from an arraylist, sorts the values from smallest to largest, then outputs the sorted arraylist
    * @param nums is an Integer ArrayList
    *
    * @return the the arraylist sorted with the values smallest to largest
    */
    public static ArrayList<Integer> sortNums(ArrayList<Integer> nums) {
        int j = 1;
        int pastNum = 0;
        boolean needSwap = true;
        while (needSwap == true) {
            needSwap = false;
            for (int i = 0; i < nums.size() - 1; i++) {
                j = i+1;
                if (nums.get(i) > nums.get(j)) {
                    pastNum = nums.get(i);
                    nums.set(i, nums.get(j));
                    nums.set(j, pastNum);
                    needSwap = true;
                }
            }
        }
        return nums;
    }

    // Testing
    public static void main(String[] args) {
        //System.out.println(addThreeNums(3.1,2.2,9.3));
        //System.out.println(remainder(5,3));
        //System.out.println(factorCheck(6,3));
        //System.out.println(factor(15));
        //System.out.println(vowels("I have no idea how the hell this works"));
        //System.out.println(reverse("12345"));
        //System.out.println(GCD(14,49));
        //ArrayList<Integer> nums = new ArrayList<Integer>(); //ArrayList
        //nums.add(1); nums.add(6); nums.add(3); nums.add(10); nums.add(2); nums.add(78); nums.add(1);
        //System.out.println(sortNums(nums));
    }
}