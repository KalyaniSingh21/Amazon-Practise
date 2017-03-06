/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazonpractise;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

/**
 *
 * @author Kalyani
 */
 class DFS {

    
    
     static int numnodes;
     static Queue adj[];
     
     DFS(int numnodes) {
         this.numnodes = numnodes;
         adj = new Queue[numnodes];
         
         for(int i = 0; i<numnodes; i++)
         {
             adj[i] = new ArrayDeque();
         }
     }
     
     void makeGraph(int v, int w)
     {
         adj[v].add(w);
     }
    
     static void dfsTraversal()
     {
        boolean visited[] = new boolean[numnodes];        
        
        
        for(int i =0; i<numnodes; i++)
        {
            if(!visited[i])
                DFSUtil(i,visited);
        }
     }
     
     static void DFSUtil(int i, boolean[] visited) {
         
        System.out.print(i+"\t");
        visited[i] = true;
        
        Iterator iterator = adj[i].iterator();
        
        while(iterator.hasNext())
        {
            int n = (int) iterator.next();
            
            if(!visited[n])
                DFSUtil(n,visited);
        }
         
     }
     
    public static void main(String args[])
    {
        DFS graph = new DFS(5);
        
        graph.makeGraph(0, 1);
        graph.makeGraph(0, 2);
        graph.makeGraph(1, 3);
        graph.makeGraph(2, 3);
        graph.makeGraph(4, 1);
        graph.makeGraph(3, 3);
        
        dfsTraversal();
        
    }    
}
