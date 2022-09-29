package Practice;

public class CompileTime_Polymorphism {

		// First addition function
		public static int prod(int a, int b)
		{
			return a * b;
		}

		// Second addition function
		public static double prod(double a, double b)
		{
			return a * b;
		}

		public static void main(String args[])
		{
			
			System.out.println(prod(8, 12));

		
			System.out.println(prod(2.35, 6.85));
		}
	
}
