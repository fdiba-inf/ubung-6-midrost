package exercise6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int remainder, reverseNumber = 0;
        int numberCopy = number;

        while (numberCopy > 0) {
            remainder = numberCopy % 10;
            reverseNumber = (reverseNumber * 10) + remainder;
            numberCopy = numberCopy / 10;
        }

        if (reverseNumber == number) {
            System.out.println("Palindrome: true");
        } else {
            System.out.println("Palindrome: false");
        }
    }
}
