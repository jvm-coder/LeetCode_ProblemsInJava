class Solution {
    public boolean isVowel(char ch) {
        switch(ch) {
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
            case 'A' :
            case 'E' :
            case 'I' :
            case 'O' :
            case 'U' :
                return true;
            default : return false;
        }
    }
    
    public String reverseVowels(String s) {
        int len = s.length();
        StringBuilder ans = new StringBuilder("");
        int p1 = 0;
        int p2 = len-1;
        while(p1 < len || p2 >= 0) {
            while(p2 >= 0 && !(isVowel(s.charAt(p2)))) {
                --p2;
            }
            if(p2 >= 0 && isVowel(s.charAt(p1))) {
                ans.append(s.charAt(p2));
                --p2;
            }
            else
                if(p1 < len)    ans.append(s.charAt(p1));
            
            ++p1;
        }
        return ans.toString();
    }
}