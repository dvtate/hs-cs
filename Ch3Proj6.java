import java.util.Scanner;
import java.io.*;



public class Ch3Proj6 {


	public static void main(String[] args) throws IOException {

		Scanner fil;
		try {
			fil = new Scanner(new File("C3P6.txt"));
		} catch (IOException err) {
			System.out.println(args[0] + ": file \"blah.txt\" not found");
		}

		while (fil.hasNext()){

			String line = fil.nextLine();

			for (int i = 0; i < line.length(); i++)
				System.out.println(line.charAt(i));
			
			
			

		}
	}




};



