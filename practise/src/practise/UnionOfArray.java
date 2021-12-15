package practise;

import java.util.HashSet;
import java.util.Set;

public class UnionOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {1,2,3,8,9,7,0,0};
		
		Set<Integer> union = new HashSet<Integer>();
		for(int i=0; i<arr1.length; i++) {
			union.add(arr1[i]);
		
		}
		for(int i=0; i<arr2.length; i++) {
			union.add(arr2[i]);
		
		}
		for(int i: union) {
			System.out.println(i +" ");
		}
		System.out.println(" no.of elements in union of two array : " +union.size());
	}

}
