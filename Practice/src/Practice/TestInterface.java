package Practice;

public interface TestInterface {
	
	 public void add(int a, int b);
	
	
	default void show()
	
	{
		
		System.out.println("Hence, Default Method Executed");
	}

}


