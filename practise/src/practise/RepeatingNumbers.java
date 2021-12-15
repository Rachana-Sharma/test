package practise;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RepeatingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,5,1,6,6,9,2,7,6};
		int n = arr.length;
		
		Hashtable<Integer, Integer> tb = new Hashtable<Integer, Integer>();
		
		for(int i=0; i<n; i++) {
			System.out.println("inside for loop arr[i]" +arr[i]);
			System.out.println("inside for loop arr[i]" +(arr[i]+1));
			try {
				System.out.println("entering try");
				tb.put(arr[i], tb.get(arr[i])+1);
			}
			catch(Exception e){
				System.out.println("entering catch");
				System.out.println("inside catch arr[i]" +arr[i]);
				tb.put(arr[i], 1);
			}
		}
		
		for(Entry<Integer, Integer> e: tb.entrySet()) {
			if(e.getValue() == 3) {
				System.out.println(e.getKey() + " ");
			}
		}
		
	}

	
}
