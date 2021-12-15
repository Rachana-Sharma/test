package practise;

import java.util.Scanner;

public class Uno {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value of n: ");
		int n = sc.nextInt();
		int sum1=0;
		int sum2=0;
		
		if(n<10000) {
			while( n >0) {
				sum1 = sum1 + n % 10;
				n = n/10;
			}
		}
		while(sum1 >0) {
			sum2 = sum2 + sum1 %10;
			sum1 = sum1/10;
		}
		
		if(sum2 == 1) {
			System.out.println("uno");
		}else {
			System.out.println("not uno");
		}
		
	}

}
