package com;

interface MathOperation{
	
	int operation(int a, int b);
}

public class LambdaPractice {
	
	private int operate(int a, int b, MathOperation mathoperation) 
	{
		return mathoperation.operation(a,b);
	}
	
	public static void main(String[] args) {
		
		
		LambdaPractice lambda = new LambdaPractice();
		
		MathOperation addition = (int a, int b) -> a + b;
		MathOperation subtraction = (a, b) -> a - b;
		MathOperation multiplication = (a, b) -> {return a * b;};
		MathOperation division = (int a, int b) -> a / b;
		System.out.println(lambda.operate(10,5,addition));
		System.out.println(lambda.operate(10,5,subtraction));
		System.out.println(lambda.operate(10,5,multiplication));
		System.out.println(lambda.operate(10,5,division));
	}

}
