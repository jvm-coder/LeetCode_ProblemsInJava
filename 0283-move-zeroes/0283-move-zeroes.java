class Solution {
    public void moveZeroes(int[] nums) {
        int noOfNonZeroes = 0;
        int len = nums.length;
        for(int i=0; i<len; i++) {
            if(nums[i] != 0)
                nums[noOfNonZeroes++] = nums[i];
        }
        
        for(int i=noOfNonZeroes; i<len; i++)
            nums[noOfNonZeroes++] = 0;
    }
}