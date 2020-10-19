import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessingGame {

	public static void main(String[] args) {
		menu();

	}

	static void menu() {
		System.out.println("1)Play");
		System.out.println("2)Exit");
		Scanner input = new Scanner(System.in);
		String menuChoice = input.nextLine();
		if (menuChoice.contentEquals("1")) {
			guessGame();
		}
	}

	static void guessGame() {
		System.out.println("I'm thinking of a number 1-10. What number am I thinking of?");
		int randomNum = ThreadLocalRandom.current().nextInt(1, 10 + 1);
		Scanner guessi = new Scanner(System.in);
		int guess = guessi.nextInt();
		if (guess == randomNum) {
			System.out.println("You got it! The number was " + guess + ".");
		}

		else {
			System.out.println("Incorrect.");
		}
		menu();
		guessi.close();
	}

}
