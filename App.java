import java.util.Scanner;

public class App{
    static final Scanner inputScanner = new Scanner(System.in);

    private static String getString(String prompt){
        System.out.println(prompt);
        String userInput = inputScanner.nextLine();
        return userInput;
    }

    private static double getDouble(String prompt){
        System.out.println(prompt);
        double userDouble = inputScanner.nextDouble();
        return userDouble;

    }

    public static void main(String[] args) {
        double num1 = getDouble("Enter in the first number.");
        double num2 = getDouble("Enter in the second number.");

        /*String test1 = String.format("%g + %g = %g", num1, num2, num1 + num2);
        System.out.println(test1); */
        
        System.out.println("the sum is:" + Calculator.add(num1, num2));
        System.out.println("the difference is:" + Calculator.subtract(num1, num2));
        System.out.println("the product is:" + Calculator.multiply(num1, num2));
        System.out.println("the quotient is:" + Calculator.divide(num1, num2));
        //inputScanner.next();
        getString("Do you wish to continue? Press y or n to continue.");
        String response = inputScanner.nextLine();
        boolean responding = false;
        if (response == "yes") {
            responding = true;
            while (responding == true){
                double num3 = getDouble("Enter in the first number.");
                double num4 = getDouble("Enter in the second number.");
    
                System.out.println("the sum is: " + Calculator.add(num3, num4));
                System.out.println("the difference is: " + Calculator.subtract(num3, num4));
                System.out.println("the product is: " + Calculator.multiply(num3, num4));
                System.out.println("the quotient is: " + Calculator.divide(num3, num4));
                getString("Continue? y/n");
                response = inputScanner.nextLine();
            }
        }  {
            System.out.println("Goodbye!");
        }




    }
}