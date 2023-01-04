class Solution {
    public String orderlyQueue(String s, int k) {
        String ans = s;
        if(k == 1) {
            for(int i=0; i<s.length(); i++) {
                String str = s.substring(i)+s.substring(0, i);
                if(str.compareTo(ans) < 0)
                    ans = str;
            }
        }
        else {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            return String.valueOf(arr);
        }
        return ans;
    }
}