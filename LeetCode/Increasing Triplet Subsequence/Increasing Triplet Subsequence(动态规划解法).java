class Solution 
{
	public boolean increasingTriplet(int[] nums) 
	{
		if (nums == null || nums.length == 0)
		{
			return false;
		}
		
		int n = nums.length; 
		int[] dp = new int[n]; 
		dp[0] = 1;
		
		for (int i = 1; i < n; ++i)
		{
			int maxVal = 0;
			for (int j = 0; j < i; ++j)
			{
				if (nums[i] > nums[j])
				{
					maxVal = Math.max(dp[j], maxVal);
				}
			}
			dp[i] = maxVal + 1;
			if (dp[i] == 3)
			{
				return true;
			}
		}
		
		return false;
    }
}
