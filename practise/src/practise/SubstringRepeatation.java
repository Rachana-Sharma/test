package practise;

//check how many times string a needs to be repeated to make string b it's substring.
//return no. of times it needs to be repeated, if it can't make b it's substr return -1.
public class SubstringRepeatation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String A = "abc";
		String B = "cabcabca";
		minRepeats( A, B);
		   // SubstringRepeatation ob = new SubstringRepeatation();
		    System.out.println(minRepeats(A, B));
		
	}
	static int minRepeats(String A, String B) {
        // code here
        String as = A;
        //we are doing +2 so that we need to have 2 extra copies
        for(int rep =1; rep <= B.length()/A.length()+2; rep++, as += A) {
        	if(as.indexOf(B) != -1)
        		return rep;
        }
        
       return -1;
    }

}

