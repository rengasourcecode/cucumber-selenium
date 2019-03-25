package LogicalProgramming;

import java.util.Scanner;

public class JackandJillGame {

	public static void main(String[] args) {

		System.out.println("JACK HERE...");
		System.out.println("");
		System.out.println("Lets Begin the Game..");
		System.out.println("");
		System.out.println("Hey Jill , We have Ten Cards Man Numbered From 1-10");
		System.out.println("Select Any number to get a message about YOU Man");
		System.out.println("");
		Scanner scan = new Scanner(System.in);
		int num= scan.nextInt();
		switch(num)
		{
		case 1: System.out.println("Hey jill You have Pressed 1..");
		        System.out.println("reading you man ");
		        System.out.println("Hey, You love Football Man..");
		        break;
		        
		case 2: System.out.println("Hey jill You have Pressed 2..");
        		System.out.println("reading you man ");
        		System.out.println("Hey, You are a Foodie..");
        		break;
        
		case 3: System.out.println("Hey jill You have Pressed 3..");
				System.out.println("reading you man ");
				System.out.println("Hey, You Hate dogs..");
				break;
				
		case 4: System.out.println("Hey jill You have Pressed 4..");
				System.out.println("reading you man ");
				System.out.println("Hey, You are a Party Freak..");
				break;

		case 5: System.out.println("Hey jill You have Pressed 5..");
        		System.out.println("reading you man ");
        		System.out.println("Hey, You are a Swimmer..");
        		break;

		case 6: System.out.println("Hey jill You have Pressed 6..");
				System.out.println("reading you man ");
				System.out.println("Hey, You live in NewJersey..");
				break;

		case 7: System.out.println("Hey jill You have Pressed 7..");
				System.out.println("reading you man ");
				System.out.println("Hey, You hate icecreams..");
				break;

		case 8: System.out.println("Hey jill You have Pressed 8..");
        		System.out.println("reading you man ");
        		System.out.println("Hey, you love to be Single..");
        		break;

		case 9: System.out.println("Hey jill You have Pressed 9..");
				System.out.println("reading you man ");
				System.out.println("Hey, You love to play golf in weekends..");
				break;

		case 10:System.out.println("Hey jill You have Pressed 10..");
				System.out.println("reading you man ");
				System.out.println("Hey, You are a Rockstar Man.You love to play the Strings in Partys.");
				break;

        

       
		        
		}
		
	}

}
