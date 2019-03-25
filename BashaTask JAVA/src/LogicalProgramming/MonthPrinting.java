package LogicalProgramming;

import java.util.HashMap;
import java.util.Scanner;

public class MonthPrinting {

	public static void main(String[] args) {

		HashMap<Integer,String> map= new HashMap<Integer,String>();
		map.put(1,"January");
		map.put(2,"February");
		map.put(3,"March");
		map.put(4,"April");
		map.put(5,"May");
		map.put(6,"June");
		map.put(7,"July");
		map.put(8,"August");
		map.put(9,"September");
		map.put(10,"October");
		map.put(11,"November");
		map.put(12,"December");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number to know the Month (1-12)");
		int num=scan.nextInt();
		
		
		for(int i:map.keySet())
		{
			if(i==num)
			{
				System.out.println("The Month is "+map.get(i));
			}
		}

		
	}

}
