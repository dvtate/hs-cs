import java.util.*;

public class Ch3Proj3 {

	public static void main(String[] args) throws InputMismatchException {

		Scanner stdin = new Scanner(System.in);

		System.out.print("Enter price of item: $");
		double cost = stdin.nextDouble();

		if (cost > 100)
			cost *= 0.9; // discount
			// free s/h
		else {
			cost *= 1.1; // small order fee
			cost += 5; // $5 for s/h
		}


		System.out.println("final cost = $" + 
			String.format("%.2f", cost)
		);



	}


};
