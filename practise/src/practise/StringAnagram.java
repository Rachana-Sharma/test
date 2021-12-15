package practise;

import java.util.Arrays;

//to check if two strings are anagram of each other.
public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Tokyo";
		String str2 ="kyoto";
		if(isAnagram(str1,str2)) {
			System.out.println("it is Anagram");
		}else
			System.out.println("it is not an anagram");
	}
	static boolean isAnagram(String s1, String s2) {
		int len =0;
		if(s1.length() == s2.length()) {
			len = s1.length();
		}else
			return false;
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		char[] str1 = s1.toCharArray();
		char[] str2 = s2.toCharArray();
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		for(int i=0; i<len; i++) {
			if(str1[i] != str2[i]) 
				return false;			
		}
		return true;
		
	}

}
