/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazonpractise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import static javax.swing.UIManager.get;

/**
 *
 * @author Kalyani
 */
public class HashMapExample {
    public static void main(String args[])
    {
        Map<String,Integer> map = new HashMap<String,Integer>();
        
        map.put("Meera", 1);
        map.put("Ritu", 2);
        map.put("Aakanksha", 3);
        
        System.out.println(map);
        
        Iterator iterator = map.keySet().iterator();
        
        while(iterator.hasNext())
        {
            System.out.print((String) get(iterator.next()));
        }
        
        //iterator = (Iterator) map.values();
        
        map.remove("Meera");
        
        System.out.println(map);
    }
}
