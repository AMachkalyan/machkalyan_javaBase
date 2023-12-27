package prime_numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        ArrayList<Integer> primeNum = primeList(num1, num2);
        System.out.printf(String.valueOf(primeNum));
        scanner.close();
        scanner.close();
    }

    public static ArrayList<Integer> primeList(int num1, int num2) {
        ArrayList<Integer> primes = new ArrayList<>();
        if (num1 < num2) {
            for (int i = num1 + 1; i < num2 ; i++) {
                boolean isPrime = true;
                for (int j = 2; j < Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                    primes.add(i);
                }
            }
        } else {
            System.out.println("Incorrect sequence of numbers");
        }
        return primes;
    }
}