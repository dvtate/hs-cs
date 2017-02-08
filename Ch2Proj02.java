

// this is a clock that has a pre-programmed time to custom format
public class Ch2Proj02 {

	public static void  main(String[] args){
		
		int hours = 2, minutes = 3, seconds = 4;

		System.out.print("The current time is:\n\t");
		
		if (hours < 10)
			System.out.print("0" + hours);
		else
			System.out.print(hours);

		System.out.print(':');

		if (minutes < 10)
			System.out.print("0" + minutes);
		else
			System.out.print(minutes);

		System.out.print(':');

		if (seconds < 10)
			System.out.print("0" + seconds);
		else
			System.out.print(seconds);

		System.out.println();
		
	}




};
