import java.util.*;
import java.io.*;


public class Ch6Proj2 {


	// handles values [-25, 25]
	public static void main(String[] args) {

		// open file
		Scanner fil;
		try { fil = new Scanner(new File("numbers2.txt")); }
		catch (FileNotFoundException e) {
			System.out.println("error: numbers2.txt not found");
			return;
		}

		int[] occurances = new int[51];

		// process file
		while (fil.hasNextLine())
			try { occurances[25 + Integer.parseInt(fil.nextLine())]++; }
			catch (NumberFormatException e) { } // NaN

		// print results
		for (int i = 0; i < 51; i++)
			System.out.println(i - 25 + ": " + occurances[i] + " occurances");


		// count numbers for total
		int total = 0;
		for (int i : occurances)
			total += i;

		System.out.println(total + " numbers read");

	}


};
