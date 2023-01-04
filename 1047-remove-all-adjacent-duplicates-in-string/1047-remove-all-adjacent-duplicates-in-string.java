class Solution {
    public String removeDuplicates(String s) {
        char[] arr = s.toCharArray();
        int lastInd = -1;
        int len = s.length();
        for(int i=0; i<len; i++) {
            if(lastInd >= 0 && (arr[lastInd] == arr[i]))   --lastInd;
            else    arr[++lastInd] = arr[i];
        }
        
        return new String(arr, 0, lastInd+1);
    }
}