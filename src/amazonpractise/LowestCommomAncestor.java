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

class BTNode {
        int data;
        BTNode left, right,parent;
        
        BTNode(int data)
        {
            this.data = data;
            left = right = parent = null;
        }
    }
public class LowestCommomAncestor {
    BTNode root;
    
    LowestCommomAncestor(int data)
    {
        this.root = new BTNode (data);
    }
    
    BTNode insert(BTNode node, int data)
    {
        //BTNode temp = this.root;
        
        if(node == null)
        {
            node = new BTNode(data);
        }
        
        else if(data < node.data)
        {
            node.left = insert(node.left, data);
            node.left.parent = node;
        }
        
        else
        {
            node.right = insert(node.right, data);
            node.right.parent = node;
        }
        return node;
    }
    
    static BTNode lca(BTNode n1, BTNode n2)
    {
        List<BTNode> ancestors = new LinkedList<BTNode>();
        
        while(n1 != null)
        {
            ancestors.add(n1);
            n1 = n1.parent;
        }
        
        while(n2 != null)
        {
            if(ancestors.contains(n2))
                return n2;
            n2 = n2.parent;
        }
        
        return null;
    }
    
    static void inorder(BTNode temp)
    {
        if(temp == null)
            return;
        
        inorder(temp.left);
        System.out.print(temp.data+"\t");
        inorder(temp.right);
        
    }
    
    static boolean haspath(BTNode temp, int sum)
    {        
        if(temp == null)
            return false;
        else
        {            
            sum = sum - temp.data;
            boolean found = false;
            if(sum ==0 & temp.left == null && temp.right == null)
                return true;
            if (temp.left != null)
                found = haspath(temp.left,sum);
            if(temp.right != null)
                found = haspath(temp.right, sum);
            
            return found;    
        }           
    }
    
    
    public static void main(String args[])
    {
        LowestCommomAncestor bt = new LowestCommomAncestor(18);
        bt.insert(bt.root, 10);
        bt.insert(bt.root, 3);
        bt.insert(bt.root, 21);
        bt.insert(bt.root, 19);
        bt.insert(bt.root, 6);
        
        BTNode n1 = bt.root.left.left.right;
        BTNode n2 = bt.root.right.left;
        
        inorder(bt.root);
        
        BTNode lca = lca(n1,n2);
        System.out.println("Lowest common ancestor is : "+ lca.data);
        
        System.out.println(haspath(bt.root, 58));
        
        char arr[] = new char[10];
        
        arr[0] = 'i';
        System.out.println(arr['i']);
        
    }    

   
}
