import java.rmi.*;
import java.util.*;

public class Client {

    public static void main(String[] args) {

        try {
            String serverUrl = "rmi://localhost/Server";

            ServerIntf serverIntf = (ServerIntf) Naming.lookup(serverUrl);

            Scanner sc = new Scanner(System.in);

            // 1. Power Calculation
            System.out.println("Enter base and exponent:");
            double base = sc.nextDouble();
            double exponent = sc.nextDouble();
            double powerResult = serverIntf.power(base, exponent);
            System.out.println("Result of Power = " + powerResult);

            // 2. Fahrenheit to Celsius
            System.out.println("Enter temperature in Fahrenheit:");
            double fahrenheit = sc.nextDouble();
            double celsius = serverIntf.fahrenheitToCelsius(fahrenheit);
            System.out.println("Temperature in Celsius = " + celsius);

            // 3. Simple Interest Calculation
            System.out.println("Enter Principal, Rate, and Time:");
            double principal = sc.nextDouble();
            double rate = sc.nextDouble();
            double time = sc.nextDouble();
            double simpleInterest = serverIntf.simpleInterest(principal, rate, time);
            System.out.println("Simple Interest = " + simpleInterest);

            sc.nextLine(); // consume leftover newline

            // 4. Count Vowels
            System.out.println("Enter a string to count vowels:");
            String inputString = sc.nextLine();
            int vowelsCount = serverIntf.countVowels(inputString);
            System.out.println("Number of vowels = " + vowelsCount);

            // 5. Factorial
            System.out.println("Enter a number to find factorial:");
            int factNum = sc.nextInt();
            long factorialResult = serverIntf.factorial(factNum);
            System.out.println("Factorial = " + factorialResult);

            sc.nextLine(); // consume leftover newline

            // 6. Compare 2 Strings
            /*System.out.println("Enter two strings to compare:");
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();
            boolean areEqual = serverIntf.compareStrings(str1, str2);
            System.out.println("Are strings equal? " + areEqual);*/

            // 7. Echo server
            System.out.println("Enter a message to echo:");
            String message = sc.nextLine();
            String echoMessage = serverIntf.echo(message);
            System.out.println("Echoed Message = " + echoMessage);

            // 8. Miles to Km
            System.out.println("Enter distance in miles:");
            double miles = sc.nextDouble();
            double km = serverIntf.milesToKm(miles);
            System.out.println("Distance in Kilometers = " + km);

        } catch (Exception e) {
            System.out.println("Exception Occurred: " + e.getMessage());
        }
    }
}

