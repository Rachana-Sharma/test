package practise;

import java.util.HashMap;
import java.util.Map.Entry;



public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "dog";
		String str2 = "god";
		isAnagram(str1, str2);
		
	}
	
	 static boolean isAnagram(String s1, String s2){
		int n = 0;
		int count =0;
		 if(s1.length() == s2.length()) {
			  n= s1.length();
		 }else {
			 System.out.println("not an anagram");
			 return false;

		 }
		 /*if(s1.equals(s2)) {
			 return true;
		 }else {
			 return false;
		 }*/
		 for(int i=0;i<n;i++) {
			for(int j=n-1;j>=0;j--) {
				if(s1.charAt(i)==s2.charAt(j))
					count++;
			}
		
		 }
			if(n == count) {
				System.out.println("true");
				return true;
			}else {
				System.out.println("false");
				return false;	
			}
		
}
}
