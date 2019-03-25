package LogicalProgramming;

public class MethodOverloading {

	public static void main(String[] args)
	{
		MethodOverloading obj= new MethodOverloading();
		int result=obj.multiply(6,7);
		System.out.println(result);
		double result2=obj.multiply(6.5,7.0);
		System.out.println(result2);


	}
 int multiply(int num1,int num2)
{
	 System.out.println("super class called for overriding");
	 int num3=num1*num2;
	
	 return num3;
	
}
 double multiply(double num1,double num2)
{
	double num3=num1*num2;
	
	return num3;
	
}

}

