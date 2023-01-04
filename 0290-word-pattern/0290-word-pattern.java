class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        
        if(arr.length != pattern.length())    return false;
        
        char[] patternArr = pattern.toCharArray();
        Map<Character, String> mp1 = new HashMap<>();
        Map<String, Character> mp2 = new HashMap<>();
        
        for(int i=0; i<arr.length; i++) {
            if(mp1.containsKey(patternArr[i]) && !(mp1.get(patternArr[i]).equals(arr[i])))
                return false;
            else    mp1.put(patternArr[i], arr[i]);
            
            
            if(mp2.containsKey(arr[i]) && !(mp2.get(arr[i]).equals(patternArr[i])))
                return false;
            else    mp2.put(arr[i], patternArr[i]);
        }
        return true;
    }
}