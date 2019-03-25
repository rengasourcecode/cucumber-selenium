package LogicalProgramming;

import java.util.HashMap;
import java.util.Scanner;

public class NamePrinting {
	
	static HashMap<Integer,String> map;

	public static void main(String[] args) {

		getName();   //Method-1
		String NAME=nameusingreturn(3);//Method-2
		System.out.println(NAME);
		
	}

	static void getName()
 	{    
	 	mapping();
	    Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your roll number");
		int num=scan.nextInt();
		for (int b :map.keySet())
		{
			if(b==num)
		{
			System.out.println(map.get(b));
		}
		}
		}
 
	static String nameusingreturn(int rollno)
	{ 
	 	String name="";
 	 	mapping();
 		
 	 	for (int b :map.keySet())
 		{
 			if(b==rollno)
 		{
 			//System.out.println(map.get(b));
 			 name= map.get(b).toString();
 		}
 		}
		return name;
 	}
 
static  void mapping()
 {
	    map=new HashMap<Integer,String>();
		map.put(1,"Ram");
		map.put(2,"Sham");
		map.put(3,"Steve");
		map.put(4,"Tim");
 }
}
	
	
		
		
	


