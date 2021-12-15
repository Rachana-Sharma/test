package practise;

import java.util.HashSet;

/**
 * @author rachana
 *Given an array A[] and a number x, check for pair in A[] with sum as x
 */
public class PairSum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 4, 45, 6, 10, -8,12,15 };
		int sum = 16;
		
		printPair(arr, sum);
	}

	static void printPair(int[] arr, int sum) {
		
		HashSet<Integer> s = new HashSet<Integer>();
		for(int i=0; i<arr.length; i++) {
			int temp = sum - arr[i];
			
			if(s.contains(temp)) {
				System.out.println("Pair with given sum "
	                    + sum + " is (" + arr[i]
	                            + ", " + temp + ")");
			}
			s.add(arr[i]);
		}
	}
}
