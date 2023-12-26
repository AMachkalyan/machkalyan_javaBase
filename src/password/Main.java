package password;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Установите пароль доступа: ");
        final long pass = scanner.nextLong();
        boolean passIsAvailable = false;
        do {
            System.out.println("Введите пароль для доступа");
            long passUser = scanner.nextLong();
            if (passUser == pass) {
                passIsAvailable = true;
                System.out.println("Успешно!");
            } else {
                System.out.println("Пароль неверный, повторите попытку!");
            }
        } while (!passIsAvailable);
        scanner.close();
    }
}
