class Solution {
    public int rob(int[] nums) {
        int r1 = 0;
        int r2 = 0;
        for(int i=0; i<nums.length; i++) {
            int t = Math.max(nums[i]+r1, r2);
            r1 = r2;
            r2 = t;
        }
        return r2;
    }
}