class Solution {
 public int minimumAverageDifference(int[] nums) {

        int ans[] = new int[nums.length];
        long answer = Integer.MAX_VALUE;
        long mainindex = 0;
        long totalsum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalsum += nums[i];
        }
        long firstsum=0;
        long second =totalsum;
        for(int i=0;i<nums.length;i++){
            firstsum += nums[i];
            long first=firstsum/(1+i);
            second -= nums[i];
            long se = 0;
            if(second==0){
                 se =Math.abs(first-second);
            }
            else {
                long seconds = second / (nums.length - i - 1);
                 se = Math.abs(first - seconds);
            }
                if(answer>se){
                answer=se;
                mainindex=i;
            }
        }
        return (int)mainindex;
    }
}