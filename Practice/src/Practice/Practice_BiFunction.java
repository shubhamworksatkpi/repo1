package Practice;

public class Practice_BiFunction {
	

	    public static void main(String[] args) {

	        // takes two Integers and return an Integer
	        BiFunction<Integer, Integer, Integer> func = (x1, x2) -> x1 + x2;

	        Integer result = func.apply(2, 3);

	        System.out.println(result); 

	    }}
