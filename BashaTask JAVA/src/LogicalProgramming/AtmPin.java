package LogicalProgramming;

import java.util.Scanner;

public class AtmPin {

	public static void main(String[] args) {

		int pin=1989;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your AtmPin");
		int pin1=scan.nextInt();
	
        if (pin1==pin)
        {
        	System.out.println("Your Pin is correct..lets begin the process");
        }
        else
        {
        	System.out.println("WRONG PIN : TWO MORE ATTEMPT ARE BENDING");
        	int pin2=scan.nextInt();
        	if(pin2==pin)
        	{
        		System.out.println("Its Correct..go ahead");
        	}
        	else
        	{
        		System.out.println("WRONG PIN : FINAL ATTEMPT");
        		int pin3=scan.nextInt();
        		
        		if(pin3==pin)
        		{
        			System.out.println("Its Correct..go ahead");
        		}
        		else
        		{
        			System.out.println("YOUR CARD IS BLOCKED");
        		}
        	}
        }
			
	}

}
