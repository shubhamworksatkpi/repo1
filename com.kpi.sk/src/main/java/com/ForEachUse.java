package com;

//import org.junit.Test;

import java.util.ArrayList;

public class ForEachUse {
	
	  
	    public static void main(String[] args)
	    {
	 
	        ArrayList<String> gameslist = new ArrayList<String>();
	  
	        // Add Number to list
	        gameslist.add("Football");
	        gameslist.add("Cricket");
	        gameslist.add("Chess");
	        gameslist.add("Hockey");
	        gameslist.add("Kabaddi");
	        gameslist.add("Taekwando");
	     
	        
	       
	        // forEach method of ArrayList and
	        System.out.println("------Iterating by using forEach loop-----");
	        gameslist.forEach((games) -> System.out.println(games));
	    }
	}


