package practise;

//wap to reverse an array
public class ReverseArray {

	public static void main(String args[]) {
		int[] arr = {2,5, 5, 7, 3};
		int len = arr.length;
		int[] arrNew = new int[len];
		int n = len;
		for(int i=0;i<len;i++) {
			arrNew[n-1] = arr[i];
			n= n-1;
		}
		for(int i=0;i<arrNew.length; i++) {
			System.out.print(arrNew[i]+ " ");
		}
	}
}
