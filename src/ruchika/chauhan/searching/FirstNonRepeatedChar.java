package ruchika.chauhan.searching;

import java.util.HashMap;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		
		String str="ruchikah";
		System.out.println("Input Value ::"+str);
		HashMap<Character, Integer>hm=new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char sr=str.charAt(i);
			if(!hm.containsKey(sr)) {
				hm.put(sr, 1);
			}
			else {
				hm.put(sr, 2);
			}
			
		}
		System.out.println("Hashmap::"+hm);
		for (int i = 0; i < str.length(); i++) {
			
			if(hm.get(str.charAt(i))==2) {
				System.out.println("Frist repeated Chracter:::"+str.charAt(i));
				break;
			}
			/*if(hm.get(str.charAt(i))!=2) {
				System.out.println("Frist repeated Chracter:::"+str.charAt(i));
			}*/
			
		}
	}
}
