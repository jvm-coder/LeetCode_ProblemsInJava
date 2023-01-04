class Solution {
    public String frequencySort(String s) {
        // to count frequency of letters and digits
        Map<String, Integer> map = new HashMap<>();
        String key;
        for(int i=0; i < s.length(); i++) {
            key = String.valueOf(s.charAt(i));
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        // custom comparator to sort based on values i.e descending
        Comparator<Integer> comparator = (i,j) -> j-i;
        map = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(comparator))
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1, e2)->e1,LinkedHashMap::new));
        // to add characters based on their frequency 
        StringBuilder stringBuilder = new StringBuilder();
        for(Map.Entry<String, Integer> entrySet : map.entrySet()) {
            String ch = entrySet.getKey();
            int value = entrySet.getValue();
            while(value-- > 0) {
                stringBuilder.append(ch);
            }
        }
        return stringBuilder.toString();
    }
}