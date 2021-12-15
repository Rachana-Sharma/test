package practise;
//check if a given string is divisble by seven
//use same method for checking other numbers as well
public class StringDivisbleBySeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "707";
		if(isDivisible(str)) {
			System.out.println("it is divisible by 7");
		}else {
			System.out.println("not divisible by 7");
		}
		
	}
	
	static boolean isDivisible(String s) {
		int n =0;
		int num = Integer.parseInt(s);
		if(num == 0 || num == 7)
			return true;
		if(num <10)
			return false;
		n= num % 7;
		if(n == 0)
			return true;
		else
			return false;
	}

}
