/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazonpractise;

import com.sun.jmx.remote.internal.ArrayQueue;
import java.util.*;
/**
 *
 * @author Kalyani
 */
public class BFS {
    
    static int numnodes;
    static Queue adj[];
    static boolean visited[];
    
    BFS(int numnodes)
    {
         visited = new boolean[numnodes];
        this.numnodes = numnodes;
        adj = new Queue[numnodes];
        
        for(int i = 0; i<numnodes; ++i)
        {
            adj[i] = new ArrayDeque();            
        }
    }
    
    static void makeGraph(int p1,int p2)
    {
        adj[p1].add(p2);
    }
    
    static void BFSTraversal(int start)
    {
        Queue q = new ArrayDeque();
        q.add(start);
        visited[start] = true;
        
        while(q.size() != 0)
        {
            start = (int)q.poll();
            System.out.print(start);
            
            Iterator iter = adj[start].iterator();
            
            while(iter.hasNext())
            {
                start = (int)iter.next();
                if(!visited[start])
                {                    
                    q.add(start);
                    visited[start] = true;
                }
            }          
        }
    }
    
    public static void main(String args[])
    {
        BFS graph = new BFS(4);
        
        graph.makeGraph(0, 1);
        graph.makeGraph(0, 2);
        graph.makeGraph(1, 3);
        graph.makeGraph(2, 3);
        
        BFSTraversal(0);
    }
}
