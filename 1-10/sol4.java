/*
113 / 113 test cases passed.
Status: Accepted
Runtime: 0 ms
Memory Usage: 37.9 MB
*/
class Solution {
    public int removeElement(int[] nums, int val) {
        int ans=0;
        if(nums.length==0) {
        	return ans;
        }else {
        	for(int i=0;i<nums.length;i++) {
        		if(nums[i]==val) {
        			continue;
        		}else {
        			nums[ans]=nums[i];
        			ans++;
        		}
        	}
        }

        return ans;
    }
}
