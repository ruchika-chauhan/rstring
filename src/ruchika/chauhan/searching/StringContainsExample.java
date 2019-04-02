package ruchika.chauhan.searching;

import java.util.HashMap;

//This class is used to find first  repeated character in given string.and also find the count of every
// character in a string
public class StringContainsExample {
	public static void main(String[] args) {
		String str="Ruchika Chauhan is very good girl";
		HashMap<Character,Integer> hm=new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			if(hm.containsKey(ch)) 
			{
				hm.put(ch,hm.get(ch)+1);
				
			}else {
				hm.put(ch,1);
			}
		}
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			if(hm.get(ch)==2) {
				System.out.println("the first  repeated chracter is:"+ch);
				break;
			}
		}
		System.out.println(hm);
	}

}
