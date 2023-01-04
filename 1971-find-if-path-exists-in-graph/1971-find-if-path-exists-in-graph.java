class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0; i<n; i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0; i<edges.length; i++){
            graph.get(edges[i][0]).add(edges[i][1]);
            graph.get(edges[i][1]).add(edges[i][0]);
        }
        boolean[] vis = new boolean[n];
        return dfs(graph,vis,source,destination);
    }
    public boolean dfs(List<List<Integer>> graph,boolean[] vis,int s, int d){
        if(s==d) return true;
        vis[s]=true;
        for(int i=0; i<graph.get(s).size(); i++){
            if(vis[graph.get(s).get(i)]==false){
                if(dfs(graph,vis,graph.get(s).get(i),d)) return true;
            }
        }
        return false;
    }
}