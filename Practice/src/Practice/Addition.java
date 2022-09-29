package Practice;

import java.util.Scanner;

public class Addition {


			public static void main(String arg[])
		    {  
				try {
					Scanner sc = new Scanner(System.in);
					
					
					System.out.print("Enter first number : ");
					int a=sc.nextInt();
		       
					System.out.print("Enter second number : ");
					int b=sc.nextInt();
					
					System.out.print("Enter third number : ");
					int c=sc.nextInt();
		       
					//throw to catch
					int d=a+b+c;
					System.out.println("Result:"+d);
					
				}
				
			catch (ArithmeticException e) {
				   System.out.println("In the catch block due to Exception = " + e);
				  } 
			catch (ArrayIndexOutOfBoundsException e) {
				   System.out.println("In the catch block due to Exception = " + e);
				
				// here program ends.
				System.out.println("End of Program...");
			}

		    }}
