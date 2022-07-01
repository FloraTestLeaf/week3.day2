package week3.day2.assignment;

import java.util.ArrayList;
import java.util.List;

public class ReverseCollection {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Red");
		list.add("Green");
		list.add("Blue");
		list.add("Yellow");
		list.add("Brown");
		int size = list.size();
		for(int i=size-1;i>=0;i--)
		{
			String listvalues = list.get(i);
			System.out.println("The Reverse list is:" +listvalues);
		}
		
		
	}
}
