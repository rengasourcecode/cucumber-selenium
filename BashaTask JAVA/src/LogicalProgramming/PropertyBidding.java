package LogicalProgramming;

import java.util.Scanner;

public class PropertyBidding {

	public static void main(String[] args) {

		System.out.println("                                             ");
		System.out.println("LETS BEGIN THE GAME");
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("HERE YOU GO MICHAEL..Your PRICE");
		Scanner scan= new Scanner(System.in);
		
		int michael=scan.nextInt();
		System.out.println("NOW ITS YOUR TURN BRUCE..");
		int bruce=scan.nextInt();
		if(michael>bruce)
		{
			System.out.println("BRAVO MICHAEL , THE PROPERTY IS YOURS.!!");
			System.out.println("MICHAEL'S BID :"+ michael + "BRUCE'S BID :" + bruce);
		}else
		{
			System.out.println("BRAVO BRUCE , THE PROPERTY IS YOURS.!!");
			System.out.println("MICHAEL'S BID :"+ michael + "  BRUCE'S BID :" + bruce);

		}
		
	}

}
