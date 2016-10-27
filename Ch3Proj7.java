import java.util.*;

public class Ch3Proj7 {

	public static void main(String[] args){

		System.out.println("I'm thinking of a number between" +
						   " 0 and 200, try and guess it. \n" +
						   "Enter a negative number to quit");

		Scanner stdin = new Scanner(System.in);
		Random rand = new Random();

		int value, guess, numberOfGuesses = 0;

		// for each number
		do {
			value = Math.abs(rand.nextInt()) % 201;

			// for each guess
			do {
				++numberOfGuesses;
				guess = stdin.nextInt();

				// check their guess
				if (guess < 0) {
					System.out.println("拜拜 『see ya』"); // bai bai (chinese)
					return;
				} else if (guess < value)
					System.out.println(guess + " is too low.");
				else if (guess > value)
					System.out.println(guess + " is too high.");
				else
					System.out.println("You guessed it!!!!\n" +
									   "Number of guesses = " + 
									   numberOfGuesses);

			} while (guess != value && guess >= 0);


			System.out.println("\nI just picked another one :DDDDD\n");

		} while (guess >= 0);

	}



};
