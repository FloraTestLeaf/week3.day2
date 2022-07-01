package week3.day2.assignment;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//
//Assignment: 1  :(Collections-using List and Set)
//
//The pseudocode has steps to implement using arrays.
//But, now do the same set of programs using Collections. 
//
//
//https://github.com/TestLeafPages/SeleniumAssignments/blob/master/week1/day2/assignments/mandatory/RemoveDuplicates.java
//
//https://github.com/TestLeafPages/SeleniumAssignments/blob/master/week1/day2/assignments/mandatory/FindIntersection.java
//
//https://github.com/TestLeafPages/SeleniumAssignments/tree/master/week1/day2/classroom/arrays
public class CollectionEx {
	

	/*
	 * Pseudo code 
	 
	 * a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";		
	 * b) Initialize an integer variable as count	  
	 * c) Split the String into array and iterate over it 
	 * d) Initialize another loop to check whether the word is there in the array
	 * e) if it is available then increase and count by 1. 
	 * f) if the count > 1 then replace the word as "" 
	 
	 * g) Displaying the String without duplicate words	
	 */
	
	
	///remove duplicates using collection
public static void main(String[] args) {
	String text="We learn java basics as part of java sessions in java week3";
	String[] s=text.split(" ");
	int count=0;
	
	Set<String>seting=new TreeSet<String>();
	
			for (String string : s) {
			seting.add(string);
			
			}
		
			System.out.println(seting);
	
}
	
	
			

}
