package Graph;
import java.util.*;

public class DFSGraphTraversal {

    private void CallForDFSRec(ArrayList<ArrayList<Integer>> adj, int V, int count){
        boolean[] visited = new boolean[V+1];
        for(int i = 0; i < V; i++){
            if(visited[i] == false){
                DFSRec(adj,i, visited);
                count++;
            }
        }
    }

    public int GetConnectedComponentsCount(ArrayList<ArrayList<Integer>> adj, int V){
        int count = 0;
        CallForDFSRec(adj,V,count);
        return count;
    }

    public void DFS(ArrayList<ArrayList<Integer>> adj, int V ){
        CallForDFSRec(adj,V,0);
    }

    public void DFSRec(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited){

        visited[s] = true;
        System.out.print(s+"");
        for(int r:adj.get(s)){
            if(visited[s] == false){
                DFSRec(adj, r, visited);
            }
        }
    }
}
