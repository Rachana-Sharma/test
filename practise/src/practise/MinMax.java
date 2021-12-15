package practise;

import java.util.Arrays;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1000, 3, 67, 1, 3000, 56,3000};
		//int[] arr = {1000};
		int arrSize = arr.length;
		
		getMinMax(arr, arrSize);
		mM(arr,arrSize);
	}
	//first approach
	static void getMinMax(int[] arr, int n) {
		int min =0;
		int max = 0;
		
		if(n == 1) {
			min = arr[0];
			max = arr[0];
		}
		
		if(arr[0] > arr[1]){
			max = arr[0];
			min = arr[1];
		}else {
			max = arr[1];
			min = arr[0];
		}
		
		for(int i=2; i < n; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}else if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("max num: " +max);
		System.out.println("min num: " +min);

		
	}
	//Second approach
	static void mM(int[] arr, int n) {
		if(n == 1) {
			int min = arr[0];
			int max = arr[0];
		}
		Arrays.sort(arr);
		int min = arr[0];
		int max = arr[n-1];
		System.out.println("second method : ");
		System.out.println("max num: " +max);
		System.out.println("min num: " +min);
	}
}
