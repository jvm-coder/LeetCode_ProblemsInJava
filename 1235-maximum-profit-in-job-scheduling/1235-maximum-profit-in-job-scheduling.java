class Solution {
    Integer[] cache;
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int[][] inputArray = new int[startTime.length][3];
        
        for (int i = 0; i < startTime.length; i++) {
            inputArray[i] = new int[]{startTime[i], endTime[i], profit[i]};
        }
        
        Arrays.sort(inputArray, (a, b) -> a[0] - b[0]);
        cache = new Integer[profit.length];
        return helper(inputArray, 0);
    }
    
    int helper(int[][] jobs, int cur) {
        if (cur == jobs.length) {
            return 0;
        }
        
        if (cache[cur] != null) {
            return cache[cur];
        }
        
        int nextNonOverLappingIndex = firstNonOverLappingIndex(cur, jobs);
        int include = (nextNonOverLappingIndex == -1 ? 0 : helper(jobs, nextNonOverLappingIndex)) + jobs[cur][2];
        int notInclude = helper(jobs, cur+1);
        return cache[cur] = Math.max(include, notInclude);
    }
    
    int firstNonOverLappingIndex(int cur, int[][] jobs) {
        for (int i = cur + 1; i < jobs.length; i++) {
            if (jobs[i][0] >= jobs[cur][1]) {
                return i;
            }
        }
        return -1;
    }
}