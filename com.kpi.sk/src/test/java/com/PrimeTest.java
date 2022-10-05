package com;
import java.util.Scanner;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


	public class PrimeTest {
		
	@Test
	
		 public void evaluatesExpression() {
			 
			 Prime prime = new Prime();
			  String s = prime.isPrime(11);
		        assertEquals("prime",s);
	}
}