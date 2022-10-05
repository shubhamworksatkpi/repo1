package com;

import java.util.ArrayList;

public class Mashir implements Abhitayu{

	@Override
	public void food() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		
		
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


