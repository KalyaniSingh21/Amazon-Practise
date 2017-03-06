/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazonpractise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Kalyani
 */
public class FindTerm {
    
    static boolean findString(String str, String searchStr)
    {
        boolean found = false;
        int i;
        
        String pattern = String.valueOf(searchStr.charAt(0));
        
        for(i = 1; i<searchStr.length(); i++)
        {
            pattern = pattern + "\\w*"+String.valueOf(searchStr.charAt(i));            
        }       
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(str);
        
        if(m.find()) {
            found = true;
        }
         
        
        System.out.println(found);
        
        return found;
    }
    
    public static void main(String args[])
    {
        FindTerm.findString("bbbbabbxxxxxxbb", "aba");
        FindTerm.findString("bbbbabbxxxxxxab", "aba");
        
    }
}
