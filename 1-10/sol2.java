/*
208 / 208 test cases passed.
Status: Accepted
Runtime: 1 ms
Memory Usage: 38 MB
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    ListNode ans = new ListNode();
	ArrayList<ListNode> answer = new ArrayList<ListNode>();
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null && l2==null) {
    		Collections.reverse(answer);
    		filler();
            if(answer.size()==0){
                return null;
            }
    		return ans;
    	}else if(l1!=null && l2==null) {
    		while(l1!=null) {
    			answer.add(l1);
    			l1=l1.next;
    		}
    		mergeTwoLists(l1,l2);
    	}else if(l1==null && l2!=null) {
    		while(l2!=null) {
    			answer.add(l2);
    			l2=l2.next;
    		}
    		mergeTwoLists(l1,l2);
    	}else {
    		if(l2.val<l1.val) {
    			answer.add(l2);
    			l2=l2.next;
    		}else {
    			answer.add(l1);
    			l1=l1.next;
    		}
    		mergeTwoLists(l1,l2);
    	}

    	return ans;
    }
    public void filler() {
        if(answer.size()==0){
            return;
        }
        ans.val=answer.get(0).val;
    	for(int i=1; i<answer.size(); i++) {
    		ans=new ListNode(answer.get(i).val,ans);
    	}
    }
}
