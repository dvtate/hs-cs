import java.util.*;

public class Ch2Proj4 {

	public static void main(String[] args){


		Scanner stdin = new Scanner(System.in);

		System.out.println("Please enter your monies:");


		System.out.print("\tkwarterz: ");
		int quarters = stdin.nextInt();

		System.out.print("\tdaims: ");
		int dimes = stdin.nextInt();
		
		System.out.print("\tnickels: ");
		int nickels = stdin.nextInt();

		System.out.print("\tpennees: ");
		int pennies = stdin.nextInt();
		
		double totalMoney = quarters * 0.25
						  + dimes 	 * 0.1
						  + nickels	 * 0.05
						  + pennies  * 0.01;






		System.out.println("Total monies = $" + String.format("%.2f", (double)totalMoney) );


	}

};
