import java.util.Scanner;

import java.util.*;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, s = 0, originalNumber, remainder;

        System.out.println("Enter a number");
        try {
            n = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
            return;
        }

        originalNumber = n; // Store the original number

        while (n > 0) {
            remainder = n % 10; // Extract the last digit
            s += Math.pow(remainder, 3); // Cube the digit and add to sum
            n /= 10; // Remove the last digit from the number
        }

        if (s == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong Number");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number");
        }
    }
}