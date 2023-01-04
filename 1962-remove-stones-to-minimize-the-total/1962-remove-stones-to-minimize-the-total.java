class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((val1, val2) -> (val2-val1));
        
        for(int stones : piles)
            pq.add(stones);
        
        while(k-- > 0) {
            int val = pq.poll();
            val -= (int)val/2;
            pq.add(val);
        }
        
        int output = 0;
        while(! pq.isEmpty())
            output += pq.poll();
        
        return output;
    }
}