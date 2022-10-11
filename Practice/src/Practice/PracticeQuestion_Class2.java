package Practice;

public class PracticeQuestion_Class2 {
	
	    
	    private String name;
	    // to accept employee name
	    PracticeQuestion_Class2(String name)
	    {
	    	// this keyword refers to the current object in a method or constructor.
	        this.name = name;
	    }
	 
	    // Method of Employee class
	    public String getEmployeeName()
	    {
	        // returning the name of employee
	        return this.name;
	    }
	}

