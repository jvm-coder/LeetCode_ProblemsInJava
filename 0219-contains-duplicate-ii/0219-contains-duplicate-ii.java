class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k == 0)  return false;
        int len = nums.length;
        HashMap<Integer, Integer> mp = new HashMap<>(len);
        
        for(int i=0;i<len;i++) {
            Integer val = mp.put(nums[i], i);
            if(val != null && (i-val) <= k)
                return true;
        }
        
        return false;
    }
}