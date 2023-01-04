class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int num : arr) {
            mp.put(num, mp.getOrDefault(num, 0)+1);
        }
        
        HashSet<Integer> hs = new HashSet<>();
        for(int val : mp.values()) {
            if(hs.contains(val)) return false;
            hs.add(val);
        }
        return true;
    }
}