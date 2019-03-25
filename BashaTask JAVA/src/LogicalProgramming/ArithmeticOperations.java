package LogicalProgramming;

import java.util.Scanner;

public class ArithmeticOperations {

	static int num1,num2;
	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		System.out.println("Enter The Numbers to Perform ARITHMETIC OPERATIONS");
		num1=scan.nextInt();
		num2=scan.nextInt();
		addition();
		subtraction();
		multiplication();
		}
	static void addition()
	{
		int num3= num1+num2;
		System.out.println("THE ADDITION RESULT IS :" + num3);
		
	}
	static void subtraction()
	{
		int num4= num1-num2;
		System.out.println("THE SUBTRACTION RESULT IS :" + num4);
		
	}
	static void multiplication()
	{
		int num5= num1*num2;
		System.out.println("THE MULTIPLICATION RESULT IS :" + num5);
		
		
	}

}
