package week3.day2.assignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FindMostDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* input: abbabba
		 * output: b
		 * 
		 * 
		 */
		
		String  input = "abbabba";
		int count = 0; 
		char[] charArray = input.toCharArray();
		
		Map<Character,Integer> map = new HashMap<>();
		
		for (int i = 0; i < charArray.length; i++) {
			char x=charArray[i];
		
		if(map.get(x)==null) {
			
			map.put(x, 1);
		}else {
			map.put(x,map.get(x)+1);
		}
			
		}
		
		System.out.println("frank --> "+map);
		
		
		
		
		
		/*
		 * Psuedocode
		 * 
		 * 1) Map -> HashMap 
		 * 2) String -> ch[] -> Get all the character -> occurance
		 * 3) Keep comparing the occurance with other values -> max value -> character
		 * 
		 */
		
//		String  input = "abbaba";
//		int count = 0; 
//		char s = input.charAt(0);
//		Map<Character,Integer> map = new HashMap<>();
//		char[] charArray = input.toCharArray();
//		for (int i = 0; i < charArray.length; i++) {
//			//reference
//			//map.put(null, null) 
//			//map.getOrDefault(charArray, null) 
//			map.put(charArray[i], map.getOrDefault(charArray[i], 0)+1);
//			if(map.get(charArray[i])>count) {
//				s = charArray[i];
//				count = map.get(charArray[i]);
//			}
//		}
//		System.out.println(s+"="+count);
		//System.out.println(s);//which character u sollum
		//System.out.println(count);//ethana times repeated nu count matum sollum
		
		
	}

}
