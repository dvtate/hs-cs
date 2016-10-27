import java.util.*;


class Ch3Proj5 {

	public static void main(String[] args){

		Scanner stdin = new Scanner(System.in);
		int value = stdin.nextInt();


		if (value < 2)
			System.out.println("ERROR: Input less than 2.");
		else {
			int sum = 0;
			for (int i = 2; i <= value; i += 2)
				sum += value;
			System.out.println(sum);

		}
	}



};
