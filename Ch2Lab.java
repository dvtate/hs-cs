
import java.util.Scanner;

// java implementation of herons formula
public class Ch2Lab {

	public static void main(String[] args){

		Scanner stdin = new Scanner(System.in);
		
		System.out.println("Enter the side lengths separated by spaces: ");

		double sideA, sideB, sideC;

		sideA = stdin.nextFloat();
		sideB = stdin.nextFloat();
		sideC = stdin.nextFloat();
		
		double semiP = ( sideA + sideB + sideC ) / 2; 

		System.out.println("The triangle's area is: " + 
			String.format("%.3f", Math.sqrt(semiP * (semiP - sideA) * (semiP - sideB) * (semiP - sideC)))
		);

	}




};
