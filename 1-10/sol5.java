/*
78 / 78 test cases passed.
Status: Accepted
Runtime: 5 ms
Memory Usage: 39.3 MB
*/
class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.equals(needle)) {
        	return 0;
        }else if(haystack.length()==0) {
        	return -1;
        }else if(needle.length()==0){
            return 0;
        }
        char[] ques = haystack.toCharArray();
        char[] con = needle.toCharArray();

        int ans=0;
        int counter=0;
        for(int i=0; i<ques.length; i++) {
        	if(counter==needle.length()) {
        		return ans;
        	}
        	if(ques[i]==con[counter]) {
        		if(counter==0) {
        			ans=i;
        		}
        		counter++;
        	}else {
                if(counter!=0) {
        			i=ans+1;
        			if(ques[i]==con[0]) {
        				counter=1;
                        ans=i;
        			}else {
        				counter=0;
        			}
        			continue;
        		}
        		counter=0;
        	}
        }

        if(counter == con.length){
            if(ques[ques.length-1]==con[con.length-1]){
                return ans;
            }
        }

        return -1;
    }
}
