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
public class LongestPalindromicSubstring {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        
        String str = scanner.next();
        int length = str.length(),i,low,high,maxlength = 1,start = 0;
        
             
        for(i=1; i<length; i++)
        {
            if(length % 2 == 0)
            {
                low = i-1;
                high = i;
            }
            else
            {
                low = i-1;
                high = i+1;
            }
            
            while(low>=0 && high < length && str.charAt(low) == str.charAt(high))
            {
                if(high-low+1 > maxlength)
                {
                    maxlength = high-low+1;
                    start = low;
                }
                low--;
                high++;
            }
        }
        
        System.out.print("Longest palindrome is : ");
        for(i=start ; i< start+maxlength; i++)
        {
            System.out.print(str.charAt(i));
        }
        
    }    
}
