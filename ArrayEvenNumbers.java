package week3.day2.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;



public class ArrayEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(12);
		list.add(22);
		list.add(34);
		list.add(31);
		list.add(97);
		list.add(1154);
		list.add(32);
		list.add(2445);
		list.add(57);
		list.add(88);
		list.add(88);
		
		
	int size = list.size();
	for (int i = 0; i < size; i++) {
		 int num  = list.get(i);
		 if(num%2==0) {
			 System.out.println(num);
		 }
		 
		 
		
	}
	}

}
