/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazonpractise;

/**
 *
 * @author Kalyani
 */
public class RectangleOverlap {
    public static void main(String args[])
    {
        int A = -3,B = 0,C = 3, D = 4, E = 0, F = -1, G = 9, H = 2;
        
        int areaABCD = (D-B)*(C-A);
        int areaEFGH = (H-F)*(G-E),overlap = 0;
        
        int left = Math.max(A, E);
        int right = Math.min(C, G);
        int top = Math.min(D,H);
        int bottom = Math.max(B,F);
        
        if(right>left && top>bottom)
            overlap = (right-left)*(top-bottom);
        
        System.out.println(overlap);
    }
    
}
