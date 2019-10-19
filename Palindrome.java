import java.util.Scanner;

/**
 * Palindrome.java ******************************
 * A 3 digit Palindrome checker
 * that asks the user to input a selector to either have the program generate a
 * 3 digit number for them or have the user input there own 3 digit number.
 * ___________________________________________ Trevon Lamb 09/10/2019 CMSC 255
 * Section 2
 */
public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt user to enter number 1 or 2 //
        System.out.println("Enter 1 if you would like to enter a 3-digit number. Enter 2 if you would like to have the computer generate it.");
        int Selector = input.nextInt();

        if (Selector == 1) {
            // Ask the user to enter there own number
            System.out.println("Enter the 3-digit number:");
            int digit = input.nextInt();
            /*
             * if user enters a non 3 digit number the program will print a statement
             */
            if((digit < 100) || (digit > 999)) {
                System.out.println("Incorrect input");
                return;
            }
            /*
             * To check palindrome check if first digit equals last digit
             */
            int first = (digit / 100);
            int last = (digit % 10);

            if (first == last) {
                System.out.println(digit + " is a palindrome");
            } else if (first != last) {
                System.out.println(digit + " is not a palindrome");
            }
            
        } else if (Selector == 2) {
            // generate 3 digit number for user
            double n3 = (Math.random() * 1000);
            // convert double to int using typecasting
            int n2 = (int) n3;
            /*
             * To check palindrome check if first equals last
             */
            System.out.println(n2);
            int first = (n2 / 100);
            int last = (n2) % 10;
            // Print out wether 3 digit # is a palindrome or not
            if (first == last) {
                System.out.println(n2 + " is a palindrome");
            } else {
                System.out.println(n2 + " is not a palindrome");
            }
        }
        /*
         * if user sputs in a selector of any # other than 1 or 2 a statement will print
         * out.
         */
        else if (Selector != 1 || Selector != 2) {
            System.out.println("Incorrect input");
        }
    }
}