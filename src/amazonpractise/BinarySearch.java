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
public class BinarySearch {
    
    static boolean binarysearch(List list,int element)
    {
        int low = 0, high = list.size()-1;
        
        while(low <= high)
        {
            int middle = (low+high)/2;
            int middleelement = (int)list.get(middle);
            
            if(middleelement == element)
                return true;
            else if(element > middleelement)
                low = middle+1;
            else
                high = middle-1;
        }
        return false;
    }
    
    public static void main(String args[])
    {
        List list = new ArrayList();
        
        list.add(18);
        list.add(12);
        list.add(1);
        list.add(30);
        list.add(2);
        
        System.out.println(BinarySearch.binarysearch(list, 30));

        
    }
    
}
