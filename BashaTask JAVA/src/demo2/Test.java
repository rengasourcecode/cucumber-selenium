package demo2;

import demo1.Methods;

public class Test extends Methods
{

	public static void main(String[] args) {

		// static methods
		Methods m= new Methods();
		
		m.day();
		Methods.month();
		Methods.year();
	}

}
