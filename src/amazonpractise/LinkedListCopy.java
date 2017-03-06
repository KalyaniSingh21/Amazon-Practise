/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazonpractise;

import java.util.*;
import static javax.swing.UIManager.get;

/**
 *
 * @author Kalyani
 * 
 */

 class RandomList {
    int data;
    RandomList next,random; 
    
    public RandomList(int data)
    {
        this.data = data;
        this.next = this.random = null;
    }
}
 class LinkedListCustom {
    RandomList head;
    
    public LinkedListCustom(RandomList rl)
    {
        this.head = rl;
    }
    
    public void push(RandomList rl)
    {
        rl.next = this.head;
        this.head = rl;
    }
}
public class LinkedListCopy {

    
    public static void main(String args[])
    {
        RandomList rl0 = new RandomList(5);
        RandomList rl1 = new RandomList(3);
        RandomList rl2 = new RandomList(1);
        RandomList rl3 = new RandomList(8);
        RandomList rl4 = new RandomList(10);
        
        LinkedListCustom list = new LinkedListCustom(rl0);
        list.push(rl1);
        list.push(rl2);
        list.push(rl3);
        list.push(rl4);   
        
        list.head.random = list.head.next.next;
        list.head.next.random =
            list.head.next.next.next;
        list.head.next.next.random =
            list.head.next.next.next.next;
        list.head.next.next.next.random =
            list.head.next.next.next.next.next;
        list.head.next.next.next.next.random =
            list.head.next;
        
        Map<RandomList,RandomList> map = new HashMap<RandomList,RandomList>();       
        
        RandomList rl = list.head;
        
        while(rl != null)
        {
            map.put(rl, new RandomList(rl.data));
            rl = rl.next;            
        }
        
        Iterator iterator = map.keySet().iterator();
        while(iterator.hasNext())
        {
            RandomList r1 = (RandomList) iterator.next(); 
            (map.get(r1)).next = r1.next;
            (map.get(r1)).random = r1.random;
        }
        
        System.out.println(map.keySet());
        System.out.println(map.values());
        
        //RandomList r10 = rl4;
        
        //System.out.print(r10);
       
        
        
        
    }
    
}
