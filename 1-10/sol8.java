/*
203 / 203 test cases passed.
Status: Accepted
Runtime: 0 ms
Memory Usage: 39 MB
*/
class Solution {
    public int maxSubArray(int[] nums) {
        int ans=nums[0];
		int sum=0;
		for(int i : nums) {
			if(i>ans) {
				ans=i;
			}
		}
		if(nums.length==1) {
			return ans;
		}else if(ans<=0) {
			return ans;
		}
		for(int i : nums) {
			if(i<sum && sum==0) {
				continue;
			}else if(i>sum){
				if(sum>0) {
					sum=sum+i;
					if(sum>ans) {
						ans=sum;
					}
					continue;
				}
				sum=i;
				continue;
			}
			else {
				sum=sum+i;
				if(sum>ans) {
					ans=sum;
				}
			}
		}

		return ans;
    }
}
