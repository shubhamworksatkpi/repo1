package OOPs;

public class Truck extends Vehicle{
	
	String name;
    
    public Truck(String name){
        this.name = name;
    
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println(name+ "truck is gaining speed");
	}

	@Override
	public void breaking() {
		// TODO Auto-generated method stub
		System.out.println(name+ "truck is reducing speed");
	}
	
	

}
