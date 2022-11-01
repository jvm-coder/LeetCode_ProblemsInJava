class helper {
    int plant;
    int grow;
    helper(int p, int g) {
        plant = p;
        grow = g;
    }
}

class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        
        helper[] plantAndGrow = new helper[growTime.length];
        int days = 0;
        int maxDays = 0;
        
        for(int i=0; i<growTime.length; i++)
            plantAndGrow[i] = new helper(plantTime[i], growTime[i]);
        
        Arrays.sort(plantAndGrow, (b,a) -> Double.compare(a.grow, b.grow));
        
        for(int i=0; i<growTime.length; i++) {
            days = days + plantAndGrow[i].plant;
            maxDays = Math.max(maxDays, days + plantAndGrow[i].grow);
        }
        
        return maxDays;
    }
}