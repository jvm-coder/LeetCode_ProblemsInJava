class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        
        List<List<Integer>> result = new ArrayList<>();
        
        List<Integer> lostOnce = new ArrayList<>();
        List<Integer> neverLost = new ArrayList<>();
        
        HashMap<Integer,Integer> wins = new HashMap<>();
        HashMap<Integer,Integer> loses = new HashMap<>();
        
        for(int i=0;i<matches.length;i++) {
            
            wins.put(matches[i][0], wins.getOrDefault(matches[i][0],0)+1);
            loses.put(matches[i][1], loses.getOrDefault(matches[i][1],0)+1);
        }
        
        for(int i : loses.keySet()) {
            int val = loses.get(i);
            if(val==1)
                lostOnce.add(i);
        }
        
        for(int i : wins.keySet()) {
            int val = wins.get(i);
            if(!loses.containsKey(i))
                neverLost.add(i);
        }
        
        result.add(neverLost);
        result.add(lostOnce);
        
        Collections.sort(result.get(0));
        Collections.sort(result.get(1));
        
        return result;
    }
}