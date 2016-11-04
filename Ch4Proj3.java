import java.util.*;


public class Ch4Proj3 {
	public static void main(String[] javaSoLame我操){
		PairOfDice eyes = new PairOfDice();

		int boxcars = 0;

		// roll the dice 1000 times counting the boxcars (6 + 6)
		for (int i = 0; i < 1000; i++)
			if (eyes.roll() == 12)
				boxcars++;


		System.out.println("In 1000 rolls of a PairOfDice, there were " + boxcars + " boxcars.");
	}



};
