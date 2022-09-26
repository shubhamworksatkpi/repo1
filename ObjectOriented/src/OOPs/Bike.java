package OOPs;

public class Bike extends Vehicle{
	
String name2;
    
    public Bike(String name2){
        this.name2 = name2;
    }
	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println(name2+ "bike is gaining speed");
	}

	@Override
	public void breaking() {
		// TODO Auto-generated method stub
		System.out.println(name2+ "bike is reducing speed");
	}

}
