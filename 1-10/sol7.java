/*
30 / 30 test cases passed.
Status: Accepted
Runtime: 9 ms
Memory Usage: 38.5 MB
*/
class Solution {
    public String countAndSay(int n) {
        int ans=1;
        if(n>1) {
        	ArrayList<Integer> a= new ArrayList<Integer>();
        	for(int i=1;i<=n;i++) {
        		ArrayList<Integer> b= new ArrayList<Integer>();
        		if(a.size()==0) {
        			a.add(1);
        			continue;
        		}
        		int counter=0;
        		int adder=a.get(0);
        		for(int j : a) {
        			if(j==adder) {
        				counter++;
        				continue;
        			}else {
        				if(counter==0) {
        					counter=1;
        				}
        				b.add(counter);
        				b.add(adder);
        				counter=1;
        				adder=j;
        			}
        		}
        		if(counter==0) {
					counter=1;
				}
        		b.add(counter);
				b.add(adder);
				a=b;
        	}
        	String b="";
        	for(int i : a) {
        		b=b+Integer.toString(i);
        	}
        	return b;
        }

        return Integer.toString(ans);
    }
}
