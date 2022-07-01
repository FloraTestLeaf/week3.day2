package week3.day2.assignment;

import java.util.HashSet;
import java.util.Set;

public class CollectionDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		// get the length of the array
		// declare an int variable named count
		
		// iterate from 0 to the array length-1 (outer loop starts here)
		
			// assign 0 to count 
			
			// iterate from i to the length of the array by adding 1 to it (inner loop starts here)
			
					// compare both the loop variables & check they're equal
				
							// increase the count if both the arrays are equal
					
			// Out of the inner loop, check and print the first array variable if count is more than 0
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		Set<Integer> s = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			s.add(arr[i]);
	
		}
		System.out.println(s);
		
	}

}


//Integer[] a = {14,12,13,11,15,14,18,16,17,19,18,17,20};
//
//List<Integer> list = new ArrayList<Integer>(Arrays.asList(a));//to add all in list
//Collections.sort(list);
//System.out.println(list);
//
//Set<Integer> set = new HashSet<Integer>();
//
//for(Integer value : list) {
//	if((list.indexOf(value))!=(list.lastIndexOf(value)))
//	{
//		set.add(value);
//	}
//}	
//System.out.println(set);