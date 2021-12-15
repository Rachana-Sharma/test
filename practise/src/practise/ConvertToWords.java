package practise;

public class ConvertToWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		convert_to_words("8".toCharArray());
	}

	static void convert_to_words(char[] num) {
		
		int len = num.length;
		
		if(len == 0) {
			System.out.println("empty string");
			return;
	
		}
		
		if(len > 4) {
			System.out.println("length more than 4 is not supported");
			return;
		}
		
		String[] singleDigit = new String[] {"zero", "one", "two", "three", "four", "five",
				"six", "seven", "eight", "nine"};
		
		String[] twoDigit = new String[] {"", "ten", "eleven", "twelve", "thirteen", "fourteen",
				"fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
		
		String[] tensMultiple = new String[] {"", "", "twenty", "thirty", "forty", "fifty",
				"sixty", "seventy", "eighty", "ninty"};
		
		String[] tensPower = new String[] {"hundred", "thousand"};
			
		if(len == 1) {
			System.out.println(singleDigit[num[0] - '0']);
			return;
			}
		
		}
	
		}

