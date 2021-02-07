/*
161 / 161 test cases passed.
Status: Accepted
Runtime: 0 ms
Memory Usage: 45.1 MB
*/
class Solution {
    public int removeDuplicates(int[] nums) {
        int ans = 0;
		if(nums.length==0) {
			return ans;
		}else if(nums.length==1){
			ans=1;
			return ans;
		}else {
			int checker = nums[0];
			ans++;
			for(int i=1; i<nums.length; i++) {
				if(checker==nums[i]) {
					continue;
				}else {
					checker=nums[i];
					nums[ans]=checker;
					ans++;
				}
			}
		}

		return ans;
    }
}
