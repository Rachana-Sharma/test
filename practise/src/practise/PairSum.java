package practise;

import java.util.Arrays;

/**
 * @author rachana
 *Given an array A[] and a number x, check for pair in A[] with sum as x
 */
public class PairSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 4, 45, 6, 10, -8 };
		int sum = 16;
		int len = arr.length;
		
		hasNumbers(arr,sum,len);
	}

	static void hasNumbers(int[] arr, int sum, int len) {
		 int l = 0;
		 int r = len - 1;
		 
		 Arrays.sort(arr);
		while(l < r) {
			if(arr[l] + arr[r] == sum) {
				System.out.println("sum = " +arr[l] +" + " +arr[r]);
				//break;
			}	
			else if(arr[l] + arr[r] < sum) {
				l++;
			}else
				r--;
		}
		//System.out.println("sum = " +arr[l] +" + " +arr[r]);
	}
}
