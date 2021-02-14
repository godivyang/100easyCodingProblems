/*
58 / 58 test cases passed.
Status: Accepted
Runtime: 0 ms
Memory Usage: 37.2 MB
*/
class Solution {
    public int lengthOfLastWord(String s) {
        int ans=0;
		for(int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i)==' ') {
                if(ans==0){
                    continue;
                }
				return ans;
			}else {
				ans++;
			}
		}
		return ans;
    }
}
