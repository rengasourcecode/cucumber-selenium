package LogicalProgramming;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArrayLIst {

	public static void main(String[] args) {

		ArrayList<Integer> array= new ArrayList<Integer>();
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the count of elemets to be added");
		int count=scan.nextInt();
		for(int i=0;i<count;i++)
		{
			System.out.println("Enter Element number "+ i + " array");
			int ad= scan.nextInt();
			array.add(ad);
		}
		System.out.println(array);
		for(int k=0;k<count;k++)
		{
			System.out.println("we gonna remove this "+ array.get(k));
			array.remove(k);
			k--;
		}
		
		//System.out.println("EMPTY ARRAYLIST " + array);
	}

}
