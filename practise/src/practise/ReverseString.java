package practise;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "geekyAnts fhhgd";
		method1(str);
		method2(str);
		
	}
	//using string builder
	static void method1(String s) {
		StringBuilder input = new StringBuilder();
		input.append(s);
		input.reverse();
		System.out.println(input);
	}
	
	//using char array
	static void method2(String s1) {
		char[] input = s1.toCharArray();
		
		for(int i=input.length-1; i>=0;i--) {
			System.out.print(input[i]);
		}
	}

}
