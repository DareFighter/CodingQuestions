package Graph;
import  java.util.*;

public class BFSGraphTraversal {
    public int GetConnectedComponentsCount(ArrayList<ArrayList<Integer>> adj, int V){
        int count = 0;
        boolean[] visited = new boolean[V+1];
        for(int i = 0; i < adj.size(); i++){
            if(visited[i] == false){
                count++;
                BFS(adj,i, visited);
            }
        }
        return count;
    }

    public void BFSDis(ArrayList<ArrayList<Integer>> adj, int V){
        boolean[] visited = new boolean[V+1];
        for(int i = 0; i < adj.size(); i++){
            if(visited[i] == false){
                BFS(adj,i,visited);
            }
        }
    }

    public void BFS(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited){
        Queue<Integer> q = new LinkedList<Integer>();
        visited[s] = true;
        q.add(s);

        while(!q.isEmpty()){
            var u = q.poll();
            System.out.print(u + "");
            for(int r: adj.get(u)){
                if(visited[r] == false){
                    visited[r] = true;
                    q.add(r);
                }
            }
        }
    }
}
