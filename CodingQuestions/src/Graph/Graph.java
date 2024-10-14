package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {

    public static  void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

   public static void createGraph(){
       int v = 5;
       ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

       for(int i = 0; i< v; i++){
           adj.add(new ArrayList<Integer>());
       }

       addEdge(adj,0,1);
       addEdge(adj,0,2);
       addEdge(adj,1,2);
       addEdge(adj,1,3);
       printGraph(adj);
   }

   public static  void printGraph(ArrayList<ArrayList<Integer>> adj){
        for(int i = 0; i < adj.size(); i++ ){
            for(int j = 0; j < adj.get(i).size(); j++){
                System.out.print(adj.get(i).get(j) + "");
            }
            System.out.println();

        }
   }

   public static void BFS(ArrayList<ArrayList<Integer>> adj, int V, int s){
           boolean visited[] = new boolean[V+1];
           Queue<Integer> q = new LinkedList<Integer>();
           visited[s] = true;
           q.add(s);

           while(!q.isEmpty()){
               var u= q.poll();
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
