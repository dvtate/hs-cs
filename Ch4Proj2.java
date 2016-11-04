import java.util.*;


class Ch4Proj2 {
	public static void main(String[] arg){

		// why can't I just read directly from /dev/stdin ?
		Scanner stdin = new Scanner(System.in);

		System.out.print("How many sides go on the dice?  ");
		Die player = new Die(stdin.nextInt()); // instanciate a dice obj


		// main loop
		for (;;) {

			System.out.println("The die has rolled a " + player.roll());

			System.out.print("Go again? (Y/n) ");
			// ask the user for a response until they get their act together
			for (;;) {
				char input = stdin.next().charAt(0);
				if (input == 'y' || input == 'Y')
					break;
				else if (input == 'n' || input == 'N')
					return;
				else
					System.out.print("Invalid input, try again (Y/n): ");
			}
		}



	}
};
