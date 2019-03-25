package LogicalProgramming;

import java.util.HashMap;
import java.util.Scanner;

public class PercentageAndGrade2 {
	
	static boolean validity(int mark)
	{
		if(mark >= 0 && mark <= 100)
		{
			return true;
		}
		else
		{
		return false;
		}
	}
	
	static void calculate()
	{
		System.out.println("Enter the marks for the following Subjects to Calculate % and Grade");
		Scanner scan = new Scanner(System.in);
		System.out.println("Mathematics");
		int maths=scan.nextInt();
		boolean abc=validity(maths);
		if(!abc)
		{
			System.out.println("enter the valid marks between 0-100");
			int maths2=scan.nextInt();
			maths=maths2;
		}
		
		System.out.println("English");
		int english=scan.nextInt();
		boolean abc2=validity(english);

		if(!abc2)
		{
			System.out.println("enter the valid marks between 0-100");
			int english2=scan.nextInt();
			english=english2;
		}
		

		System.out.println("Science");
		int science=scan.nextInt();
		boolean abc3=validity(science);

		if(!abc3)
		{
			System.out.println("enter the valid marks between 0-100");
			int science2=scan.nextInt();
			science=science2;
		}
		

		System.out.println("SocialScience");
		int social=scan.nextInt();
		boolean abc4=validity(social);

		if(!abc4)
		{
			System.out.println("enter the valid marks between 0-100");
			int social2=scan.nextInt();
			social=social2;
		}
		

		
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

	public static void main(String[] args) {
       calculate();
       System.out.println("Wanna Contiue...yes/no");
       Scanner scan = new Scanner(System.in);
       String str=scan.nextLine();
       
       while(str.equalsIgnoreCase("yes"))
       {
           calculate();
           System.out.println("Wanna Contiue...yes/no");
           Scanner scan2 = new Scanner(System.in);
           String str2=scan2.nextLine();
           str=str2;
         }
       if(str.equalsIgnoreCase("no"))
       {
    System.out.println("THANK YOU");
       }
	}

}
