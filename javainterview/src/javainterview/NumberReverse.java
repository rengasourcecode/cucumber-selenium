package javainterview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import javax.swing.SortingFocusTraversalPolicy;

public class NumberReverse {

	public static void main(String[] args)
	{
		
		
	}
	}
	/*	
		String str="jhbj568hbj89";
		StringBuilder build= new StringBuilder(str);
	for(int i=0;i<build.length();i++)
	{
		if(!(build.charAt(i)<48 || build.charAt(i)>57))
		{
			build.deleteCharAt(i);
			i--;
		}
	}  System.out.println(build); */
	/*	12345678987654321
		 123456787654321
		  1234567654321
		   12345654321
		    123454321
		     1234321
		      12321
		       121
		        1*/
		        
	/*	int num=9,t=num;
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=t;j++)
			{
				System.out.print(j);
			}
			for(int k=t-1;k>=1;k--)
			{
				System.out.print(k);
			}
			t--;
			System.out.println(" ");
			switch(t)
			{
			case 8 :
				System.out.print(" ");
			break;
			case 7 :
				System.out.print("  ");
			break;
			
			case 6 :
				System.out.print("   ");
			break;
			
			case 5:
				System.out.print("    ");
			break;
			
			case 4 :
				System.out.print("     ");
			break;
			
			case 3:
				System.out.print("      ");
			break;
			case 2 :
				System.out.print("        ");
			break;
			case 1 :
				System.out.print("         ");
			break;
			
			}
				}
	} */
		
	/*	for(int i=1;i<=i+2;i=i+3)
		{
			if(i==10)
			{
				break;
			}
			for(int j=i;j<=i+2;j++)
			{
				if(j==5)
				{
					System.out.print("  ");
				}else
				{
				System.out.print(j+" ");
			}}
			System.out.println();*/
		
		/*number reverse 
		int num=4567;
		
		int rev=0;
		while(num!=0)
		{
			rev= (rev*10)+(num%10);
			num=num/10;
		}
	System.out.println(rev);*/
		
		/*string reverse
		String str="renganathan";
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev= rev+str.charAt(i);
		}
		System.out.println(rev);*/
		
		//prime
	/*	int num=9;
		boolean prime=true;
		int temp;
		
		for( int i=2;i<num/2;i++)
		{
			temp=num%i;
			if(temp==0)
			{
				prime=false;
				break;
			}
		}
		if(prime)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not");
		}
			*/
		/*
		 String str = "This This is is done by Saket This";
	    String[] split = str.split(" ");
		
		       	HashMap<String,Integer> map = new HashMap<>();
		       	for(String s :split)
		       	{
		       		if(map.get(s)!=null)
		       		{
		       			map.put(s,map.get(s)+1);
		       		}else
		       		{
		       		map.put(s, 1);
		       		}
		       	}
		       	System.out.println(map);
		       	
		      	Iterator <String> s= map.keySet().iterator();
		       	while(s.hasNext())
		       	{
		       		String temp=s.next();
		       		if(map.get(temp)>1)
		       		{
		       			System.out.println(temp +" appeared " + map.get(temp)+ " times ");
		       		}
		       	}
		       	
		       	for(String n:map.keySet())
		       	{
		       		if(map.get(n)>1)
		       		{
		       			System.out.println(n +" appeared " + map.get(n)+ " times ");
		       		}		    
		       		}*/
		   
	/*	int number,temp;
		boolean prime=true;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		number=scan.nextInt();
		
		for(int i=2;i<=number/2;i++)
		{
			temp=number%i;
			if(temp==0)
			{
				prime=false;
				break;
			}
		
		}
		if(prime)
		{
			System.out.println("prime");
		}else
			System.out.println("not");
	*/
	/*	String str="121";
		StringBuilder build=new StringBuilder();
		build.append(str);
		build=build.reverse();
		System.out.println(build);
		if(str.equals(build.toString()))
		{
			System.out.println("yes");
			
		}
		else 
			System.out.println("no"); */
		
	/*	String str="madam",rev="";
		int strlength=str.length();
		for(int i =strlength-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			
		}if(str.equals(rev))
		{
			System.out.println("yes");

		}
		else			System.out.println("no");*/
		
		//For Example 0,1,1,2,3,5,8,13,21………
	/*	int num=9;
		 ArrayList<Integer> arr= new ArrayList<Integer>();
		arr.add(0);
		arr.add(1);
        for(int i=2;i<num;i++)
      {
	  arr.add(i, arr.get(i-2)+arr.get(i-1));
	
      }
       System.out.println(arr); */
		
	/*	int array[]= new int[9];
		array[0]=0;
		array[1]=1;
		for(int i=2;i<9;i++)
		{
			array[i]=array[i-2]+array[i-1];
			
		}
		for (int i:array)
		{
		System.out.println(i);
		}
	*/
	/*	String str="renganathan";
		String[] arr=str.split("");
		int c=0;
		for(int i=0;i<arr.length;i++)
		{
			//System.out.println(arr[i]);
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for (int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]);
					c++;
					break;
				}
			}
		}
	
*/
      /*  String str = "renganathan";
        int count = 0;
        char[] chars = str.toCharArray();
        System.out.println("Duplicate characters are:");
        for (int i=0; i<str.length();i++) {
                    for(int j=i+1; j<str.length();j++) {
                               if (chars[i] == chars[j]) {
                                          System.out.println(chars[j]);
                                          count++;
                                          break;
                                }
                     }
         }*/
		
		/*String str="renganathan";
		String[] split= str.split("");
		
		HashMap<String,Integer> map= new HashMap<>();
		for (String s :split)
		{
			if(map.get(s)!=null)
		{
			map.put(s,map.get(s)+1);
		}
		else
			
			map.put(s, 1);
		}


System.out.println(map);

for(String s :map.keySet())
{
	if(map.get(s)>1)
	{
		System.out.println(s);
	}
}*/
			
		
		/*int[] array= {10,70,30,60,100};
		int temp;
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]<array[j])
				{
					temp=array[i];
					array[i]=array[j];
				    array[j]=temp;
				}
			}
		}
		for(int i =0;i<array.length;i++)
		{
			System.out.println(array[i]);
		} */
		
		
	
	/*	int num=153;
		int c=0,count=0;
		while(num!=0)
		{
			c=num%10;
			count=count +(c*c*c);
			num=num/10;
		}
					
		System.out.println(count);*/
		
		
		/*int num=198;
		int rev=0;
		while(num!=0)
		{
			rev= (rev*10)+ (num%10);
			num= num/10;
		}
		System.out.println(rev);
		       
		*/
		
	/*	String str="renganathan";
		String[] split=str.split("");
		
		HashMap<String,Integer> map= new HashMap<>();
		
		for(String s:split)
		{
			if(map.get(s)!=null)
			{
				map.put(s,map.get(s)+1);
			}
			else
				
			map.put(s,1);
		}
		System.out.println(map);
		for (String a:map.keySet())
		{
			if(map.get(a)>1)
			{
				System.out.println(a);
			}
		}*/
	/*	String str="renga";
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		*/
		
		//153
		
	/*	int num=153,temp,count=0;
		while(num!=0)
		{
			temp=num%10;
			num=num/10;
			count= count +(temp*temp*temp);
		}
		System.out.println(count);*/
		
	/*	int num=1987,temp=0;
		while(num!=0)
	   	{
			temp=(temp*10)+(num%10);
			num=num/10;
	   	}
		System.out.println(temp);
		
		
	 */
	
	/*	int temp=0,num=567,k;
		while(num!=0){
			temp=temp*10 +(num%10);
			num=num/10;
		}System.out.println(temp); */
		
	/*	String str="renganathan";
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev); */
		
	/*	String str="renganathan";
		StringBuilder build= new StringBuilder();
		build.append(str);
		build=build.reverse();
		System.out.println(build); */
		
	/*	String str="renganathan";
		String[] split=str.split("");
		HashMap<String,Integer> map= new HashMap<>();
		for (String s :split)
		{
		if(map.get(s)!=null)
		{
			map.put(s,map.get(s)+1);
			
		}else
			map.put(s, 1);
		}
		System.out.println(map);
		for (String s:map.keySet())
		{
			if (map.get(s)>1)
			{
				System.out.println(s);
			}
		} */
		
		/*int count;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the count");
		count=scan.nextInt();
		int a[]= new int[count];
		a[0]=0;
		a[1]=1;
		for(int i=2;i<count;i++)
		{
			a[i]=a[i-2]+a[i-1];
		}
		for(int i=0;i<count;i++)
		{
			System.out.println(a[i]);
		}*/
		
/*		String m="madam";
		String rev="";
for(int i=m.length()-1;i>0;i--)
{
	rev=rev+m.charAt(i);
	
}if (m.equals(rev))
{
	System.out.println("yes");
}
else
{
	System.out.println("no");
}*/
	/*	
		int num=153,temp,count=0;
		while(num!=0)
		{
			temp= num%10;
			num=num/10;
			count=count +(temp*temp*temp);
		}System.out.println(count); */
		
		
	/*	int num=15,temp;
		Boolean prime=true;
		for(int i=2;i<num/2;i++)
		{
			temp=num%i;
			if(temp==0)
			{
				prime=false;
				break;
			}
		}
		if(prime)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		} */
		
	//	BUBBLE SORT
	/*	int arr[]= {5,8,3,10,7},temp;
		for (int i =0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					break;
				}			}
		}
		for(int i=0;i<arr.length;i++)
		{
		System.out.println(arr[i]);
		} 
		*/
	/*	for(int i=1;i<=i+2;i=i+3)
		{
			if(i==10)
			{
				break;
			}
			for(int j=i;j<=i+2;j++)
			{   if(j==5)
			{
				System.out.print("  ");
			}else
				System.out.print(j + " ");
			}
			System.out.println("");
		}*/
		

		
		
		

	
