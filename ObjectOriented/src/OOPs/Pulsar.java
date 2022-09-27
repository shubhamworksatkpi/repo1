package OOPs;

//child(pulsar) extends parent(bike)
public class Pulsar extends Bike{

	String name4;
	
public Pulsar(String name4) {
		super(name4);
		this.name4 = name4;
		// TODO Auto-generated constructor stub
	}

public void accelerate() {
	// TODO Auto-generated method stub
	System.out.println(name4+ "bike pulsar is gaining speed");
}

public void breaking() {
	// TODO Auto-generated method stub
	System.out.println(name4+ "bike pulsar is reducing speed");
}

}
