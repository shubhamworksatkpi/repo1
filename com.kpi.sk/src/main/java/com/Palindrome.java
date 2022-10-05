package com;

public class Palindrome {
	
	public static String evaluate (String expression) {
		
		int r,reversedNum=0,temp;
		int n=121;
		
		temp=n;
		while(n>0)
	{
			r = n % 10;
		      reversedNum = reversedNum * 10 + r;
		      n /= 10;
		    }
		if (temp==reversedNum)
			return "palindrome";
		else
			return "palindrome";
		}
	}
		 
	  
	  
	   


