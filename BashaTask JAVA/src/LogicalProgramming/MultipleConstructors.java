package LogicalProgramming;

public class MultipleConstructors {

	
	MultipleConstructors(int rollno)
	{
		System.out.println("The Roll Number is " + rollno);
	}
	MultipleConstructors(float grade)
	{
		System.out.println("The Grade is " + grade);
	}
	MultipleConstructors()
	{
		System.out.println("DefaultConstructor");
	}
	
	
	public static void main(String[] args) {
		MultipleConstructors obj = new MultipleConstructors();
		MultipleConstructors obj2 = new MultipleConstructors(6);
		MultipleConstructors obj3 = new MultipleConstructors(4.5f);


		

	}

}
