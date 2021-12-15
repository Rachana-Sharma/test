package practise;

public class LIS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {10,9,2,5,3,7,101,18};
		int n = lengthOfLIS(num);
		System.out.println(n);
	}
	public static int lengthOfLIS(int[] nums) {
		//10,9,2,5,3,7,101,18
		  if (nums.length == 0) return 0;
		  
		  int n = nums.length, max = 0;
		  int[] dp = new int[n];
		  
		  for (int i = 0; i < n; i++) {
		    dp[i] = 1;
		    
		    for (int j = 0; j < i; j++) {
		    	System.out.println("i= "+i+" j="+j);
		      if (nums[i] > nums[j] && dp[j] + 1 > dp[i]) {
		    	  System.out.println("entering if");
		    	  System.out.println("dp[j]= "+dp[j]);
		        dp[i] = dp[j] + 1;
		        System.out.println("dp[i]= "+dp[i]);
		      }
		    }
		    
		    max = Math.max(max, dp[i]);
		    System.out.println("max = "+max);
		    System.out.println("exiting main for");
		  }
		  
		  return max;
		}
}
