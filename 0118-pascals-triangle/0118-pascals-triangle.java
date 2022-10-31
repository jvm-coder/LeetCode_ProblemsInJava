class Solution {
    List<List<Integer>> ls = new ArrayList<>();
    public List<List<Integer>> generate(int numRows) {
        ls.add(new ArrayList<>());
        ls.get(0).add(1);
        
        for(int i=1;i<numRows;i++) {
            ls.add(new ArrayList<>());
            ls.get(i).add(1);
            for(int j=1;j<i;j++) {
                ls.get(i).add(ls.get(i-1).get(j-1)+ls.get(i-1).get(j));
            }
            ls.get(i).add(1);
        }
        
        return ls;
    }
}