package com.chary.varargs;

public class Test {
	
	
	public void accept(int... arr)
	
	{
		System.out.println("int args");

		
	}
	public void accept(char... args)
	{
		System.out.println("char args");
	}

	public static void main(String[] args) 
	{
		 
            Test t = new Test();
            t.accept(65);
	}

}
