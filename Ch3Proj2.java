import java.util.*;


class Ch3Proj2 {

	public static void main(String[] args){

		Scanner stdin = new Scanner(System.in);

		
		System.out.print("Gimme a year: ");
		int year = stdin.nextInt();

		// NOTE: this is terribly inefficient, but I'm doing as I was instructed..
		if (year <= 1582 && year % 4 == 0)
			System.out.println("The year " + year + " is a leap year");
		else if (year >= 1582)
			System.out.println("The year " + year + " is not leap year");
		else
			System.out.println("The gregorian calendar wasn't adopted until 1582... (not a leap year)");

		// delete the stdin object
		stdin = null;
		
	}



};
