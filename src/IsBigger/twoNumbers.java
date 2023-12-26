package IsBigger;

import java.util.Scanner;

public class twoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        isBigger(num1, num2);
    }


    public static void isBigger(double num1, double num2) {
        if (num1 > num2)System.out.println(num1 + " is bigger");
        else if (num1 < num2)System.out.println(num2 + " is bigger");
        else System.out.println("Values are equal!");
    }
}
