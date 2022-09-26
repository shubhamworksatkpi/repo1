package OOPs;

public class Bus extends Vehicle {
	
String name1;
    
    public Bus(String name1){
        this.name1 = name1;
        
    }

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println(name1+ "bus is gaining speed");
		
	}

	@Override
	public void breaking() {
		// TODO Auto-generated method stub
		System.out.println(name1+ "bus is reducing speed");
		
	}

}
