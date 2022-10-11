package Practice;

public class PracticeQuestion_Class1 {
		 
	    
	    private String name;
	 
	    // to accept bank name
	    PracticeQuestion_Class1(String name)
	    {
	        
	    	//The this keyword refers to the current object in a method or constructor.
	        this.name = name;
	    }
	 
	    // Method of Bank class
	    public String getBankName()
	    {
	        // Returning name of bank
	        return this.name;
	    }
	}


