package numberGuess;

import java.util.Scanner;
import java.util.Random;

public class Main {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Random rnd = new Random();
		System.out.println("Enter numbers between 1 and 100: ");

		int guess = input.nextInt();
		int number = rnd.nextInt(101);
		while (guess != number) {
			if (guess < 0 || guess > 100) {
				System.out.println("Enter numbers between 1 and 100: ");
				guess = input.nextInt();
			} else if (guess < number) {
				System.out.println("Enter a larger number: ");
				guess = input.nextInt();
			} else {
				System.out.println("Enter a smaller number: ");
				guess = input.nextInt();
			}
		}

		System.out.println("Congratulations!");

	}

}
