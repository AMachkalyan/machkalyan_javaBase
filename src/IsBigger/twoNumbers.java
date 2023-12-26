package IsBigger;

import java.util.Scanner;

public class twoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.println(isBigger(num1, num2));
    }

    public static double isBigger(double num1, double num2) {
        if (num1 > num2) {
            return num1;
        } else if (num1 < num2) {
            return num2;
        }
        System.out.println("Values are equal!");
        return 0;
    }
}
