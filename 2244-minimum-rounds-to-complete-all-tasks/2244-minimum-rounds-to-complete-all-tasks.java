class Solution {
    public int numOfRounds(int num) {
        if(num%3 == 0)  return num/3;
        if(num%3 == 2)  return 1+(num-2)/3;
        return 2+(num-4)/3;
    }
    
    public int minimumRounds(int[] tasks) {
        Arrays.sort(tasks);
        int count = 0;
        int size = tasks.length;
        
        for(int i=0; i<size;) {
            int j = i+1;
            
            while(j<size && tasks[j] == tasks[i])
                ++j;
            
            if(i+1 == j) return -1;
            else count += numOfRounds(j-i);
            i = j;
        }
        
        return count;
    }
}