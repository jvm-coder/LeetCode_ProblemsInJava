class Solution {
    class Node{
        int i,j,d;
        Node(int i,int j,int d){
            this.i=i;
            this.j=j;
            this.d=d;
        }
    }
    public int nearestExit(char[][] maze, int[] entrance) {
        int n=maze.length;
        int m=maze[0].length;
        Queue<Node> que=new LinkedList<>();
        //maze[entrance[0]][entrance[1]]='+';
        boolean visited[][]=new boolean[n][m];
        visited[entrance[0]][entrance[1]]=true;
        int dx[]={0,1,0,-1};
        int dy[]={1,0,-1,0};
        que.add(new Node(entrance[0],entrance[1],0));
        int res=Integer.MAX_VALUE;
        while(!que.isEmpty()){
            Node temp=que.poll();
            
            for(int k=0;k<4;k++){
                int ti=temp.i+dx[k];
                int tj=temp.j+dy[k];
                
                if(ti>=0 && ti<n && tj>=0 && tj<m && maze[ti][tj]=='.' && !visited[ti][tj]){
                    //System.out.println(ti+" "+tj+" "+(temp.d+1));
                    if(ti==0 || ti==n-1 || tj==0 || tj==m-1){
                        return temp.d+1;
                    }
                    visited[ti][tj]=true;
                    //maze[ti][tj] = '+';
                    que.add(new Node(ti,tj,temp.d+1));
                }
            }
        }
        return -1;
    }
}