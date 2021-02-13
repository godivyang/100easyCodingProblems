/*
62 / 62 test cases passed.
Status: Accepted
Runtime: 0 ms
Memory Usage: 38.8 MB
*/
class Solution {
    public int searchInsert(int[] nums, int target) {
        int in=0;
		int fi=nums.length-1;
		int i=0;
		if(nums.length==1) {
			if(nums[0]==target) {
				return 0;
			}else if(nums[0]<target){
				return 1;
			}else {
				return 0;
			}
		}else if(nums.length==2) {
            if(nums[0]>=target){
                return 0;
            }else if(nums[1]>=target){
                return 1;
            }else{
                return 2;
            }
        }else {
			if(nums[0]>=target) {
				return in;
			}else if(nums[nums.length-1]==target) {
				return fi;
			}else if(nums[nums.length-1]<target) {
				return fi+1;
			}else {
				while(fi-in>1) {
                    i=(in+fi)/2;
					if(nums[i]==target) {
						return i;
					}else if(nums[i]>target){
						fi=i;
						continue;
					}else {
						in=i;
						continue;
					}
				}
			}
		}
		if(nums[i]<target){
            return i+1;
        }
		return i;
    }
}
