/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazonpractise;
import java.util.*;

/**
 *
 * @author Kalyani
 */
public class TopologicalSort {
    
    int numnodes;
    Queue adj[];
    
    TopologicalSort(int numnodes)
    {
        this.numnodes = numnodes;
        adj = new Queue[numnodes];
        
        for(int i = 0;i<numnodes; i++)
        {
            adj[i] = new ArrayDeque();
        }
        
    }
    
    void addEdge(int u, int v)
    {
        adj[u].add(v);
    }
    
    void topologicalSort()
    {
        boolean visited[] = new boolean[numnodes];
        Stack stack = new Stack();
        
        if(adj.length == 1)
        {
            stack.push(adj[0]);
            return;
        }
        
        for(int i =0; i<numnodes; i++)
        {
            if(!visited[i])
                topologicalUtil(i,visited,stack);
        }
        
        while(!stack.isEmpty())
        {
            System.out.print(stack.pop()+"\t");
        }
    }
    
    void topologicalUtil(int i, boolean[] visited, Stack stack)
    {
        
            
        visited[i] = true;
        int n;
        Iterator iter = adj[i].iterator();
        
        while(iter.hasNext())
        {
            n = (int)iter.next();
            if(!visited[n])
                topologicalUtil(n, visited, stack);
        }
        
        stack.push(i);
        
    }
    
    public static void main(String args[])
    {
        TopologicalSort g = new TopologicalSort(6);
        
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);
        
        g.topologicalSort();       
        
    }    
}
