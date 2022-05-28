package com.daya.Exception;

public class ExceptionSuper {

	public static void main(String[] args) 
	{
		Exception e1 = new ArithmeticException("User has provid zero");
		System.out.println(e1);
		
		Exception e2 = new ArrayIndexOutOfBoundsException("Array is out of limit");
		System.out.println(e2);

	}

}
