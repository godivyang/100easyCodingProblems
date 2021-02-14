/*
114 / 114 test cases passed.
Status: Accepted
Runtime: 0 ms
Memory Usage: 37.4 MB
*/
class Solution {
    public int[] plusOne(int[] digits) {
        int[] ans= digits;
        for(int i=digits.length-1;i>=0;i--) {
        	if(digits[i]!=9) {
        		ans[i]=ans[i]+1;
        		return ans;
        	}else {
        		ans[i]=0;
        	}
        }
        if(digits.length==1 && digits[0]==9) {
        	int[] ans2=new int[2];
        	ans2[0]=1;
        	for(int i:ans) {
        		ans2[i+1]=ans[i];
        	}
            return ans2;
        }else if(ans[0]==0) {
        	int[] ans2=new int[ans.length+1];
        	ans2[0]=1;
        	for(int i:ans) {
        		ans2[i+1]=ans[i];
        	}
            return ans2;
        }
        return ans;
    }
}
