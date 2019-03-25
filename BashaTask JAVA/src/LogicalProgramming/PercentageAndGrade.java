package LogicalProgramming;

import java.util.HashMap;
import java.util.Scanner;

public class PercentageAndGrade {

	public static void main(String[] args) {

		System.out.println("Enter the marks for the following Subjects to Calculate % and Grade");
		Scanner scan = new Scanner(System.in);
		System.out.println("Mathematics");
		int maths=scan.nextInt();
		System.out.println("English");
		int english=scan.nextInt();
		System.out.println("Science");
		int science=scan.nextInt();
		System.out.println("SocialScience");
		int social=scan.nextInt();
		
		int avg=(maths+english+science+social)/4;
		System.out.println("YOUR PERCENTAGE IS " + avg);
		
		HashMap<Integer,String> map= new HashMap<Integer,String>();
		map.put(1,"poor");
		map.put(2,"average");
		map.put(3,"good");
		map.put(4,"very good");
		map.put(5,"excellent");
		 int k;

		if(avg <40)
		{
			k=1;
		}else if(avg >=40 && avg <=59)
		{
			k=2;
		}else if(avg >=60 && avg <=79)
		{
			k=3;
		}
		else if(avg >=80 && avg <=89)
		{
			k=4;
		}
		else
		{
			k=5;
		}
		
		for(int a:map.keySet())
		{
			if(k==a)
			{
				System.out.println("THE GRADE IS "+ map.get(a));
			}
		}
		
	}

}
