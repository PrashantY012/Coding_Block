import java.util.*;

class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer>ans= new ArrayList<>();
        int v = adj.size();
        int[] visited = new int[v];


        Queue<Integer> qu = new ArrayDeque<>();
        qu.add(0);
        visited[0]=1;

        while(qu.size()>0){

            int size = qu.size();
            for(int i=0;i<size;i++){
                int u = qu.poll();
                ans.add(u);

                for(Integer x : adj.get(u)){
                    if(visited[x]==0){
                        qu.add(x);
                        visited[x]=1;
                    }
                }
            }
        }
        return ans;

        
    }
}


class Solution2 {

    public void dfsHelper(ArrayList<ArrayList<Integer>> adj, int node, ArrayList<Integer> ans, int visited[]){
        //base case 
        if(visited[node]==1)return;
        //cal
        visited[node]=1;
        ans.add(node);

        //traverse on all its child
        for(int ch: adj.get(node)){
            if(visited[ch]==0){
                dfsHelper(adj, ch, ans, visited);
            }
        }
    }
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here\
        int v = adj.size();
        ArrayList<Integer> ans = new ArrayList<>();
        int visited[]= new int[v];
        dfsHelper(adj, 0, ans, visited);

        return ans;
        
    }
}




