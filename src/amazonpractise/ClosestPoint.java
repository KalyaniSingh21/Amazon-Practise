/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazonpractise;

import static java.lang.Math.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Kalyani
 */


public class ClosestPoint {
    
    int x,y;
    ClosestPoint(int x, int y)   
    {
        this.x = x;
        this.y = y;
    }
    
    int Hypotenuse()
    {
        //System.out.print("\t"+(pow(this.x,2)+pow(this.y,2)));
        return (int) (pow(this.x,2)+pow(this.y,2));
    }
    
    public static void main(String args[])
    {
        ClosestPoint cp0 = new ClosestPoint(-3,5);
        ClosestPoint cp1 = new ClosestPoint(7,8);
        ClosestPoint cp2 = new ClosestPoint(10,4);
        ClosestPoint cp3 = new ClosestPoint(0,-2);
        List<Integer> distances = new ArrayList<Integer>();
        
        int minimumdistance = cp0.Hypotenuse();
                
                
        distances.add(cp0.Hypotenuse());       
        distances.add(cp0.Hypotenuse());
        distances.add(cp1.Hypotenuse());
        distances.add(cp2.Hypotenuse());
        distances.add(cp3.Hypotenuse());
        
        Iterator iter = distances.iterator();
        
        while(iter.hasNext())
        {
            Integer i = (Integer) iter.next();
            if(i < minimumdistance)
                minimumdistance = i;
        }
        
        System.out.println(minimumdistance);
        
    }
}
