package OOPs;

public class Yoot extends Vehicle {
	
String name3;
    
    public Yoot(String name3){
        this.name3 = name3;
    }

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println(name3+ "yoot is gaining speed");
	}

	@Override
	public void breaking() {
		// TODO Auto-generated method stub
		System.out.println(name3+ "yoot is reducing speed");
	}

}
