
import java.util.Random;

public class Ch2Proj3 {
	
	
	public static void main(String[] args){

		Random random = new Random();


		int areaCode = random.nextInt(780),
		      middle3 = random.nextInt(742);
		
		int last4 = random.nextInt(10000);

		if (areaCode > 100)
			System.out.print(areaCode + " - ");
		else if (areaCode > 10)
			System.out.print("0" + areaCode + " - ");
		else
			System.out.print("00" + areaCode + " - ");

                if (middle3 > 100)  
                        System.out.print(middle3 + " - ");
                else if (middle3 > 10)
                        System.out.print("0" + middle3 + " - ");
                else 
                        System.out.print("00" + middle3 + " - "); 


                if (last4 > 1000)  
                        System.out.print(last4);
		else if (last4 > 100)
			System.out.print("0" + last4);
                else if (last4 > 10)
                        System.out.print("00" + last4);
                else 
                        System.out.print("000" + last4); 


		System.out.println();
		
		random = null;

	}
	
	

}
