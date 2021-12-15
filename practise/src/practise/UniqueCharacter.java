package practise;

import java.util.HashSet;
import java.util.Set;

//print distinct/unique character of a string
public class UniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "decode";
		returnUniqueCharacter(str);
	}
	
	static void returnUniqueCharacter(String s) {
		char[] ch = s.toCharArray();
		
		String[] str = new String[ch.length];		
		for(int i=0; i<ch.length; i++) {
			str[i] = Character.toString(ch[i]);
		}
		Set<String> set = new HashSet<>();
		for(int i=0; i<str.length;i++) {
			set.add(str[i]);
		}
		for(String i : set) {
			System.out.print(i + " ");
		}
	}

}
