/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazonpractise;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author Kalyani
 */
public class SlidingWindow {
    
    public static void maximumarray(int[] arr, int n)
    {
        int result[] = new int[arr.length-n+1];
        int index = 0; 
        
        Deque<Integer> deque = new ArrayDeque<Integer>();
        
        for(int i = 0; i< arr.length; i++)
        {
            while(!deque.isEmpty() && deque.peek() < i - n + 1)
                deque.poll();
            
            while(!deque.isEmpty() && (deque.peekLast() < arr[i]))
                deque.pollLast();
            
            deque.offer(arr[i]);
            
            if(i >= n-1)
                result[index++] = deque.peek();
        }
        
        for(int j : result)
            System.out.print(j+"\t");
    }
    
    public static void main (String args[])
    {
        int arr[] = {7,3,10,11,1,9,12};
        SlidingWindow.maximumarray(arr, 3);        
    }
}
