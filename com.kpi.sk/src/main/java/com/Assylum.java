package com;

/*
 4 boys n 4 old man go to assylum all are mad now after 8 months, 
2 among those recover the condition for recovery was they are mentally stable. 
WAP to find out who are those two people who recovered?
*/

interface mental{
	
	boolean mentalstatus(boolean value);
}


public class Assylum {

	private boolean operator(boolean a, mental value) 
	{
		return value.mentalstatus(a);
	}
	
	public static void main(String[] args) {
		
		
		Assylum yesorno = new Assylum();
		
		mental skboy = (boolean a) -> a;
		mental ajboy = (boolean a) -> a;
		mental cnboy = (boolean a) -> a;
		mental vbboy = (boolean a) -> a;
		mental skold = (boolean a) -> a;
		mental ajold = (boolean a) -> a;
		mental cnold = (boolean a) -> a;
		mental vbold = (boolean a) -> a;
		System.out.println(yesorno.operator(true,skboy));
		System.out.println(yesorno.operator(false,ajboy));
		System.out.println(yesorno.operator(false,cnboy));
		System.out.println(yesorno.operator(false,vbboy));
		System.out.println(yesorno.operator(false,skold));
		System.out.println(yesorno.operator(true,ajold));
		System.out.println(yesorno.operator(false,cnold));
		System.out.println(yesorno.operator(true,vbold));
		
		
		if(yesorno.operator(true,skboy)==true)
		{
			System.out.println(yesorno.operator(true,skboy));
		}
		// remaining code yet to be done
		}
	
}
		


	
	


