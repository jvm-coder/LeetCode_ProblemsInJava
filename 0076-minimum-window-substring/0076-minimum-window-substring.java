class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> mp  = new HashMap<>();
        for(int i=0;i<t.length();i++){
            char c = t.charAt(i);
            mp.put(c, mp.getOrDefault(c, 0)+1);
        }
        int i=0, j=0;
        int left = 0, right = s.length()-1;
        int min = s.length();
        int flag = 0;
        int count = mp.size();
        
        while(j < s.length()){
            char c = s.charAt(j++);
            if(mp.containsKey(c)){
                mp.put(c, mp.get(c)-1);
                if(mp.get(c)==0){
                    count -= 1;
                }
            }
            if(count>0)continue;
            while(count==0){
              char ch = s.charAt(i++);
              if(mp.containsKey(ch)){
                  mp.put(ch, mp.get(ch)+1);
                  if(mp.get(ch)>0){
                     count += 1;
                  }
              }
            }
            if((j-i)<min){
                left = i;
                right = j;
                min = j-i;
                flag = 1;
            }
        }
        return flag==1?s.substring(left-1, right):"";

    }
}