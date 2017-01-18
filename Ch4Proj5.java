import java.util.*;


public class Ch4Proj5 {

	public static void main(String[] eww){


		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter the number of numbers to enter: ");
		int numCount = stdin.nextInt();

		// if the number of args isn't supported
		if (numCount < 2 || numCount > 4)
			// this is why function overloading isn't the best solution here
			System.out.println("Due to requirements of the implementation, we can't take that many numbers");
		else if (numCount == 2) {
			System.out.print("enter numbers (separated by spaces): "); // prompt
			double[] nums = { stdin.nextDouble(), stdin.nextDouble() }; // get numbers
			System.out.println("Average = " + Average.average(nums[0], nums[1])); // display answer
			return;
		} else if (numCount == 3) {
			System.out.print("enter numbers (separated by spaces): "); // prompt
			double[] nums = { stdin.nextDouble(), stdin.nextDouble(), stdin.nextDouble() }; // get numbers
			System.out.println("Average = " + Average.average(nums[0], nums[1], nums[2])); // display answer
			return;
		} else if (numCount == 4) {
			System.out.print("enter numbers (separated by spaces): "); // prompt
			double[] nums = { stdin.nextDouble(), stdin.nextDouble(), stdin.nextDouble(), stdin.nextDouble() }; // get numbers
			System.out.println("Average = " + Average.average(nums[0], nums[1], nums[2], nums[3])); // display answer
			return;
		}


	}




};
