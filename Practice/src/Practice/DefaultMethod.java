package Practice;

public class DefaultMethod implements TestInterface{
	

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		//return a  + b;
		System.out.println("The addition is: ");
		System.out.println(a+b);
		
	}
	
	public static void main(String[] args)
    {
 
		DefaultMethod dm = new DefaultMethod();
		
		dm.add(6, 4);
		dm.show();

	}
	}