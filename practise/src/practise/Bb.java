package practise;

import java.util.*;
import java.util.Map.Entry;
//program to count no.of occurance(any given condition) of numbers in an array
public class Bb{
	public static void main(String args[]) {
		int[] arr = {2,4,1,9,77,3,2,1,6,77,77,3,2,2,1};
		int len = arr.length;
		repeatingNumbers(arr,len);
	}
	//we will take values from array as key, and store its no. of occurance as value
	//in hashtable.
	static void repeatingNumbers(int[] arr, int n) {
		Hashtable<Integer,Integer> ht = new Hashtable<Integer,Integer>();
		for(int i=0; i<n; i++) {
			//check if hashtable already has that key, if yes 
			//icrement the value by 1 and store it in hashtable against the key.
			if(ht.containsKey(arr[i])) {
				int val = ht.get(arr[i]);
				ht.put(arr[i], val+1);
			}else {
				//if no, the store the value as 1 against the key
				ht.put(arr[i], 1);
			}
		}
		for(Entry<Integer,Integer> e : ht.entrySet()) {
			if(e.getValue() ==3) {
				System.out.println(e.getKey());
			}
		}
	}
}
