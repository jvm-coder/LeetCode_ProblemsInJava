class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] output = new int[2];
        int len = nums.length;
        int[] count = new int[len+1];
        int flag = 0;
        
        for(int num : nums)
            ++count[num];
        
        for(int i=1; i<len+1; i++) {
            if(count[i] == 0) {
                output[1] = i;
                ++flag;
            }
            if(count[i] == 2) {
                output[0] = i;
                ++flag;
            }
            if(flag == 2)   break;
        }
        
        return output;
    }
}