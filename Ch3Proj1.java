import java.util.*;


class Ch3Proj1 {

	public static void main(String[] args){

		Scanner stdin = new Scanner(System.in);
		
		System.out.print("Gimme a year: ");
		int year = stdin.nextInt(); // get dat year

		if (year <= 1582)
			System.out.println("The gregorian calendar wasn't adopted until 1582... (not a leap year)");
		else if (year % 4 == 0)
			System.out.println("The year " + year + " is a leap year");
		else
			System.out.println("The year " + year + " is a leap year");

		stdin = null;
			
	}



};
