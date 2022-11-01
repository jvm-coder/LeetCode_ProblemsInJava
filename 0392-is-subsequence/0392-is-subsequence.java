class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() > t.length()) return false;
        int start = -1;
        int c = 0;
        for(int i=0; i<s.length(); i++) {
            start = t.indexOf(s.charAt(i), start+1);
            if(start == -1) return false;
            else    ++c;
        }
        return true;
    }
}