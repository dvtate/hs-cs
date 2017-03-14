import java.util.*;
import java.io.*;


public class Ch6Proj1 {

	public static void main(String[] args) {

		// open file
		Scanner fil;
		try { fil = new Scanner(new File("numbers.txt")); }
		catch (FileNotFoundException e) {
			System.out.println("error: numbers.txt not found");
			return;
		}

		int[] occurances = new int[51];

		// process file
		while (fil.hasNextLine())
			try { occurances[Integer.parseInt(fil.nextLine())]++; }
			catch (NumberFormatException e) { } // NaN

		// print results
		for (int i = 0; i < 51; i++)
			System.out.println(i + ": " + occurances[i] + " occurances");


		// count numbers for total
		int total = 0;
		for (int i : occurances)
			total += i;

		System.out.println(total + " numbers read");

	}


};
