package week3.day2.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionArraysSecLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//FindSecondLargest.java
//
//MissingElementInAnArray.java
//
//PrintDuplicatesInArray.java
		
		// Here is the input
			
				
				    int[] data = {3,2,11,4,6,7};
				    
				    List<Integer> dataList=new ArrayList<Integer>();
				   
//				    for (int i = 0; i < data.length; i++) {
//						dataList.add(data[i]);
//				    }
//				    Collections.sort(dataList);
//				    
//				    System.out.println(dataList.get(dataList.size()-2));	
//				 
			        
				for (Integer integer : data) {
					dataList.add(integer);
					
				}
				System.out.println(dataList.get(dataList.size()-1));
				    
				    
				    
				/*
				 Pseudo Code:
				 1) Arrange the array in ascending order
				 2) Pick the 2nd element from the last and print it
				 */
				
	}

}
