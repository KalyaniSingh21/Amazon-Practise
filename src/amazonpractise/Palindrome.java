/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazonpractise;

import java.util.Scanner;

/**
 *
 * @author Kalyani
 */
public class Palindrome {
    public static void main(String[] args) {
        
        
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter a number");
    int num = scanner.nextInt();
    int sum = 0, last_num;
    int t = num;
    
    while(t>0)
    {
        last_num = t % 10;
        sum = (sum*10)+last_num;
        t = t/10;
    }
    
    if(sum == num)
        System.out.println("Palindrome");
    else
        System.out.println("Not a Palindrome");
       
            
    String str  = new String();
    System.out.println("Enter a string");
    str = scanner.next();
    int length = str.length(),i;
    
    for(i = 0; i<length/2; i++)
    {
        if(str.charAt(i) == str.charAt(length - i -1))
            continue;
        else
            break;            
    }  
    
    if(i == length/2)
        System.out.println("Palindrome");
    else
        System.out.println("Not a Palindrome");
        
    }
    
}
