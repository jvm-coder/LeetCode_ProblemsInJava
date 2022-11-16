// Using temp array
class Solution {
    public String makeGood(String s) {
        char[] arr = new char[s.length()];
        int lastInd = -1;
        
        for(int i=0; i<s.length(); i++) {
            if(lastInd >= 0 && (s.charAt(i)^32) == arr[lastInd])   --lastInd;
            else    arr[++lastInd] = s.charAt(i);
        }
        
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<=lastInd; i++)   sb.append(arr[i]);
        
        return sb.toString();
    }
}