package Practice;

public class PracticeQuestion_MainClass {
		 
	    // Main driver method
	    public static void main(String[] args)
	    {
	 
	        // Creating objects of bank and Employee class
	    	PracticeQuestion_Class1 bank = new PracticeQuestion_Class1("ICICI");
	    	PracticeQuestion_Class2 emp = new PracticeQuestion_Class2("Shubham");
	 
	    
	        System.out.println(emp.getEmployeeName()
	                           + " is employee of "
	                           + bank.getBankName());
	    }
	}

