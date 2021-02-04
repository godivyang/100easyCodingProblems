/*
91 / 91 test cases passed.
Status: Accepted
Runtime: 6 ms
Memory Usage: 39.1 MB
*/
class Solution {
    public boolean isValid(String s) {
    ArrayList<String> checker = new ArrayList<String>();
		ArrayList<String> question = new ArrayList<String>();

		for(int i=0; i<s.length(); i++)
			question.add(Character.toString(s.charAt(i)));

		for(String i : question) {
			if(checker.size()==0) {
				if(i.equals(")") || i.equals("}") || i.equals("]")) {
					return false;
				}
				checker.add(i);
				continue;
			}
			if(i.equals("(") || i.equals("{") || i.equals("[")) {
				checker.add(i);
				continue;
			}
			else if(i.equals(")")) {
				if(checker.get(checker.size()-1).equals("(")) {
					checker.remove(checker.size()-1);
					continue;
				}
				return false;
			}
			else if(i.equals("}")) {
				if(checker.get(checker.size()-1).equals("{")) {
					checker.remove(checker.size()-1);
					continue;
				}
				return false;
			}
			else if(i.equals("]")) {
				if(checker.get(checker.size()-1).equals("[")) {
					checker.remove(checker.size()-1);
					continue;
				}
				return false;
			}
			else
				return false;
		}
		if(checker.size()==0)
			return true;
		else
			return false;
    }
}
