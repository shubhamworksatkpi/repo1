package Practice;

import java.util.Scanner;

public class TWR{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1,num2;
		
		try {
			
			Scanner sc = new Scanner(System.in);
			
			 System.out.print("Enter first number : ");	
			 num1=sc.nextInt();
			 System.out.print("Enter second number : ");	
			 num2=sc.nextInt();
	
				int result = num1*num2;
				System.out.println("Result:"+result);
			
		}
		
			catch (ArithmeticException e)
			{
				e.printStackTrace();
			
			}
			
			finally {
				
				System.out.println("finally block executed");
				
			}
			
			
	}
	}


