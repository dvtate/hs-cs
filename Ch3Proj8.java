import java.util.*;


/** rock paper scissors
* Dustin Van Tate Testa
* 2016.10.10
* 
*/

public class Ch3Proj8 {

	
	static int pcScore = 0, humanScore = 0, ties = 0;

	private static int getUserResponse(){

		Scanner stdin = new Scanner(System.in);



		// try to get user input until we find something that makes sense...
		for (;;) {
			// prompt
			System.out.print("Pick \"rock\", \"paper\" or \"scissors\" or \"quit\": ");

			// get user input
			String userChoice = stdin.next();
			
			if (userChoice.equals("quit") || userChoice.equals("q"))
				System.exit(0);
			else if (userChoice.equals("rock") || userChoice.equals("r"))
				return 0;
			else if (userChoice.equals("paper") || userChoice.equals("p"))
				return 1;
			else if (userChoice.equals("scissors") || userChoice.equals("s"))
				return 2;
			else
				System.out.println("Invalid choice \"" + userChoice + ".\" , try again.");
		} 

	}
	
	final public static String itoName(final int num){
		switch (num) {
			case 0: return "rock"; 
			case 1: return "paper";
			case 2: return "scissors";
		}
		return "error"; // this should never happen
	}

	final private static void win(int input, int pcChoice){
		System.out.println(itoName(input) + " > " + itoName(pcChoice));
		humanScore++;
	}

	final private static void loose(int input, int pcChoice){
		System.out.println(itoName(input) + " < " + itoName(pcChoice));
		pcScore++;
	}

	final private static void tie(int input){
		System.out.println("The computer also chose " + itoName(input));
		ties++;
	}



	public static void main(String[] args){
	
		Random rand = new Random();

		for (;;) {
			int input = getUserResponse(),
				pcChoice = rand.nextInt(3);

			// determine the combinations 		
			if (input == pcChoice)
				tie(input);
			else if (input == 0)
				if (pcChoice == 1) // l
					loose(input, pcChoice);
				else // if (pcChoice == 2) // w
					win(input, pcChoice);
	
			else if (input == 1)
				if (pcChoice == 2) // l
					loose(input, pcChoice);
				else // if (pcChoice == 0)
					win(input, pcChoice);
			else
				if (pcChoice == 0)
					loose(input, pcChoice);
				else // if (pcChoice == 1)
					win(input, pcChoice);


			System.out.println("Human: " + humanScore + "\tMachine: " + pcScore + " Ties: " + ties);
			System.out.println();


		}
		
	}

};


