/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazonpractise;

import java.sql.Array;
import java.util.Scanner;

/**
 *
 * @author Kalyani
 */
public class DescendingSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int i,j,temp;
       int arr[] = new int[20];
        
       Scanner s = new Scanner(System.in);
       System.out.println("Enter the numbers : ");
       for(i=0;i<5;i++)
       {
           arr[i] = s.nextInt();
       }
       
       System.out.println("The numbers are : ");
       
       for(i=0;i<5;i++)
       {
          System.out.print(arr[i]+"\t");
       }
       
       System.out.println();
       
       for(i=0; i<5; i++)
       {
           for(j=i+1; j<5; j++)
           {
               if(arr[i]<arr[j])
               {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
               }               
           }
       }
       
       System.out.println("The sorted numbers are : ");
       
       for(i=0;i<5;i++)
       {
          System.out.print(arr[i]+"\t");
       }
    }
    
}
