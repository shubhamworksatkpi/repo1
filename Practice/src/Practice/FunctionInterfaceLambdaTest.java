package Practice;

public class FunctionInterfaceLambdaTest {
	
		   public static void main(String args[]) {
		      // Using Anonymous inner class
		      Functional_Interface test1 = new Functional_Interface() {
		         public void display() {
		            System.out.println("Display using Anonymous inner class");
		         }
		      };
		      test1.display();
		      // Using Lambda Expression
		      Functional_Interface test2 = () -> {    // lambda expression
		         System.out.println("Display using Lambda Expression");
		      };
		      test2.display();
		   }
		}


