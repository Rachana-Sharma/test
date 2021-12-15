package practise;

public class DaysToWeeks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "8";
		convert(input);
	}

	public static void convert(String input) {
		int x = Integer.parseInt(input);
		int day = 0;
		int week = 0;
		if(x == 0) {
			day = x;
			System.out.println(day + " day");
		}
		
		if( x > 0 && x < 7) {
			day = x;
			if(day == 1)
				System.out.println(day + " day");
			else
				System.out.println(day + " days");
				
		}
		
		if( x == 7) {
			week = x/7;
			System.out.println(week + " week");
		}
		if(x > 7) {
			week = x / 7;
			day = x % 7;
			if(day == 0) {
				System.out.println(week + " weeks");
			}else {
			if( week == 1 && day == 1)
				System.out.println(week + " week " + day + " day");
			else if(week == 1 && day > 1)
				System.out.println(week + " week " + day + " days");
			else if(week > 1 && day == 1)
				System.out.println(week + " weeks " + day + " day");
			else if(week > 1 && day > 1)
				System.out.println(week + " weeks " + day + " days");				
				
			}
		}
		
	}
}
