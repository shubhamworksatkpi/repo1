package OOPs;

public class Employer {
	
	String name;
	int salary;
	int empID;

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getSalary() {
		return salary;
		
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	
	protected int getEmpId() {
		return empID;
	}
		
	protected void setEmpId(int empID) {
		this.empID=empID;
	}
	

}