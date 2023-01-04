class Solution {
    public int minDeletionSize(String[] strs) {
           int n = strs.length, m = strs[0].length(),ans = 0;
        
        for(int j = 0;j<m;j++){
            
            int prev = 0; // largest previous character so far (we initialize this with 'a')
            
            boolean toBeDeleted = false; 
            
            for(int i = 0;i<n;i++){
                
                int cur = strs[i].charAt(j) - 'a';
                
                if(cur >= prev){   // update prev if we get a larger character
                    
                    prev = cur;
                    
                }else{  // otherwise this column will be deleted
                    
                    toBeDeleted = true;
                    
                    break;
                    
                }
                
                
            }
            
            if(toBeDeleted) 
              ans++;
    }
     return ans;
   }
}