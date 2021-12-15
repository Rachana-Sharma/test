package practise;



import java.util.*;

public class Array {
//print common elements from two arrays
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {2,4,1,8,0,6,9} ;
		int[] arr2 = new int[] {3,7,8,9,4,1,6};
		
		
		findCommonElement(arr1, arr2);
	}
	public static void findCommonElement(int[] arr1,int[] arr2) {
		Set<Integer> set = new HashSet<>();
		for(int i=0; i < arr1.length; i++) {
			for(int j=0; j < arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					set.add(arr1[i]);
					//break;
				}
			}
		}
		
		for (int i : set) {
			System.out.println(i +" ");
		}
	}

}
