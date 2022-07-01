package week3.day2.assignment;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionMissingElement {
	// Here is the input
	
public static void main(String[] args) {

	 int[] arr = {1,2,3,4,7,6,8};
	 
	 List<Integer> miss = new ArrayList<>();
	 
	 for (int i = 0; i < arr.length; i++)//edhu list kula add panna indha for loop
	 {
		 miss.add(arr[i]);
	}
	 
	 System.out.println(miss);
	
	 Collections.sort(miss);
	 
	 for (int i =1 ; i <=miss.size(); i++) {
		 if(!miss.contains(i)) {
			 System.out.println(i);
		 }
	 }
	 
//	 for (int i =1; i <miss.size(); i++) {
//		 if(i != miss.get(i-1)) {
//			 System.out.println(i); 
//		 }
//		 
//	 }
//	 
	 
	 
	 
	// Collections.sort(miss);//like Arrays.sort(); ascending order
	 
//      for (int i = 1; i <arr.length; i++)//edhu condition potu answer find panna 
//		{
//			if(i!=arr[i-1])
//			{
//			System.out.println(i);
//
//}
//
//}
	
}
}		

