package LogicalProgramming;

import java.util.HashMap;

public class HashMapping {

	public static void main(String[] args) {

		HashMap<String,String> map= new HashMap<String,String>();
		map.put("salim","male1");
		map.put("mohammed","male2");
		map.put("anwar","male3");
		
		for(String s :map.keySet())
		{
			System.out.println("THE KEYS ARE "+ s);
		}
		System.out.println("");
		for(String a:map.keySet())
		{
			System.out.println("THE VALUES ARE "+ map.get(a));
		}
		System.out.println("");
		System.out.println(map);
	}

}
