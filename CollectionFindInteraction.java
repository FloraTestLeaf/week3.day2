package week3.day2.assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionFindInteraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Pseudo Code
		
		 * a) Declare An array for {3,2,11,4,6,7};	 
		 * b) Declare another array for {1,2,8,4,9,7};
		 * c) Declare for loop iterator from 0 to array length
		 * d) Declare a nested for another array from 0 to array length
		 * e) Compare Both the arrays using a condition statement
		 
		 *  f) Print the first array (shoud match item in both arrays)
		 */
		
		int[] a= {3,2,11,4,6,7};	
		int[] b= {1,2,8,4,9,7};
		  
//		Set<Integer> s=new HashSet<>();//----first set
//		for (int i = 0; i < a.length; i++) {
//			s.add(a[i]);
//		}
//		System.out.println(s);
//		
//		Set<Integer>s1=new HashSet<>();//second set
//		for (int i = 0; i < b.length; i++) {
//			s1.add(b[i]);
//		}
//		System.out.println(s1);
//		
//		s.retainAll(s1);
		
		List<Integer> list1=new ArrayList<>();
		list1.add(3);
		list1.add(2);
		list1.add(11);
		list1.add(4);
		list1.add(6);
		list1.add(7);
		
		List<Integer> list2=new ArrayList<>();
		list2.add(1);
		list2.add(2);
		list2.add(8);
		list2.add(4);
		list2.add(9);
		list2.add(7);
		
		List<Integer> list3=new ArrayList<>();
		
		for (Integer integer : list1) {
			for (Integer integer2 : list2) {
				if(integer==integer2) {
					System.out.println(integer);
					list3.add(integer);
				}
			}
		}
		
		System.out.println(list3);
		
	}

}
