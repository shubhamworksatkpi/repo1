package Practice;

public class Employee implements Salary,Leaves{
	
	 public static void main(String[] args) {  
	    	
	    	Employee emp = new Employee();   
	        emp.sickleave("this method is for the sickleaves"); 
	 }

	@Override
	public String casualleave() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int fixed() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void sickleave(String msg) {
		// TODO Auto-generated method stub
		System.out.println(msg);  	}

}
