package practise;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 1, 2, 3, 4, 5, 6 };
		int[] arr2 = { 5, 2, 3, 6 };

		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> intersection = new HashSet<Integer>();

		for (int i : arr1)
			set.add(i);

		for (int i : arr2) {
			if (set.contains(i))
				intersection.add(i);
		}

		for (int i : intersection) {
			System.out.println(i + " ");
		}
		System.out.println(" count of intersection : " + intersection.size());
	}

}
