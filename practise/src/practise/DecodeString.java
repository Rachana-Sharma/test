package practise;

import java.util.ArrayList;
import java.util.Collections;

public class DecodeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "stay78$#54$#frhh89";
		System.out.println(str);
		String s1 = str.replace("$#", " ");
		System.out.println(s1);
		//ArrayList<String> list = new ArrayList<String>();
		String[]  s2 = s1.split(" ");
		   ArrayList<String> words = new ArrayList<String>();

		   for(int x =0; x< s2.length;x++)
		   {
		        words.add(s2[x]);
		   }
		   for(int i=0;i<words.size();i++) {
				  System.out.println(words.get(i));
			  }
		   for(int i=0; i<words.size();i++) {
			   String temp = words.get(i);
			   StringBuilder input = new StringBuilder();
				input.append(temp);
				input.reverse();
				temp = input.toString();
				words.set(i, temp);
		   }
		   for(int i=0;i<words.size();i++) {
				  System.out.println(words.get(i));
			}
		   /*for(int i=0;i<words.size();i++) {
			   String temp1 = words.get(i);
				//char c = temp1.charAt(0);
				int ascii = (int) temp1.charAt(0);
				String temp2 = Integer.toString(ascii);
				temp1 = temp2;
				System.out.println("print temp1 : " +temp1);
				words.set(i,temp1);

			}*/
		  
		   for(int i=0; i<words.size(); i++) {
			   String temp1 = words.get(i);
			   char[] ch = temp1.toCharArray();
	           for (int j = 0; j < ch.length; j++) {
	                   if(ch[j]/1>=65 && ch[j]/1<=122){
	                	int a=Integer.parseInt(String.valueOf(ch));
	                    char convertedChar = (char)a;
	                    ch[j] = convertedChar;
	                    
	           }
	           }
	           words.set(i, temp1);
		   }
	}
}