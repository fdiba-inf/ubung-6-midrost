package exercise6;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean flag;

        do {
            int digitCounter = 0;
            flag = true;

            String password = input.nextLine();
            for (int i = 0; i < password.length(); i++) {
                if (!Character.isLetterOrDigit(password.charAt(i))) {
                    flag = false;
                }

                if (Character.isDigit(password.charAt(i))) {
                    digitCounter++;
                }
            }
            if (password.length() < 8) {
                flag = false;
            } else if (digitCounter < 2) {
                flag = false;
            }

        } while (!flag);

        System.out.println("Password valid!");

    }
}
