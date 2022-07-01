package week3.day2.assignment;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ReverseSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s = new LinkedHashSet<String>();
		
		s.add("red");
		s.add("green");
		s.add("blue");
		s.add("yellow");
		s.add("brown");
		System.out.println("set is:"+ s);
		List<String> list = new ArrayList<String>(s);
		int size = list.size();
		
		for(int i = size-1;i>=0;i--) {
			String st = list.get(i);
			System.out.println(st);
			
		}
	}

}
