package InheritanceProblem;

public class Shark extends Fish{
	 static String Kind="Shark";
	public static void main(String[] args)
	{
		//Shark is an Animal which lives in Water, hence it is Aquatic.  
		System.out.println(Kind + " is an " + Family + " which lives in " + Habitat + " hence it is "+ Type);
		
	}

}
