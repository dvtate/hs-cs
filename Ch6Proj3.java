import java.util.*;
import java.io.*;

public class Ch6Proj3 {

	// occurances 1 - 20
	public static void main(String[] arrrrrrggs){
		// open file
		String fileName = "fileNumbers3.txt";
		Scanner fil;
		try { fil = new Scanner(new File(fileName)); }
		catch (FileNotFoundException e) {
			System.out.println("error: " + fileName + " not found");
			return;
		}

		int[] occurances = new int[20]; // 1-20

		// process file
		while (fil.hasNextLine())
			try {
				try {
					occurances[Integer.parseInt(fil.nextLine()) - 1]++;
				} catch (ArrayIndexOutOfBoundsException ind) {
					System.out.println("invalid input, must be between 1 and 20.");
					return;
				}
			} catch (NumberFormatException e) { } // NaN

		// print results
		for (int i = 0; i < 20; i++) {
			System.out.print(i + 1 + "\t");
			for (int freq = 0; freq < occurances[i]; freq++)
				System.out.print('*');
			System.out.println();
		}


/* not required for assignment
		// count numbers for total
		int total = 0;
		for (int i : occurances)
			total += i;

		System.out.println(total + " numbers read");
*/

	}

};
