package LogicalProgramming;

public class MethodOverriding extends MethodOverloading{

	public static void main(String[] args) 
	{
		MethodOverriding obj= new MethodOverriding();
		int result=obj.multiply(5,6);
		System.out.println(result);
	}
	 int multiply(int num1,int num2)
	{
	    super.multiply(num1, num2);
		int num3=num1*num2;
		System.out.println("base class method");
		
		return num3;
		
	}


}
