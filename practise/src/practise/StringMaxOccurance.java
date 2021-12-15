package practise;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;



//prints the characters which occurs maximum times in a string;
public class StringMaxOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hey there";
		returnMaxChar(str);
	}
	
	static void returnMaxChar(String s) {
		int len = s.length();
		char[] ch = s.toCharArray();
		String[] sArr = new String[len];
		for(int i=0;i<ch.length; i++) {
			sArr[i] = Character.toString(ch[i]);
		}
		HashMap<String, Integer> ht = new HashMap<String, Integer>();
		for(int i=0; i<sArr.length; i++) {
			if(ht.containsKey(sArr[i])) {
				int val = ht.get(sArr[i]);
				ht.put(sArr[i], val+1);
			}else {
				ht.put(sArr[i], 1);
			}
		}
		 int maxval = Collections.max(ht.values());		 
		 for(Entry<String, Integer> e : ht.entrySet()) {
			 if(e.getValue() == maxval) {
				 System.out.println("character with maximum occurance is : " + e.getKey());
			 }
		 }
		
	}
	
}
