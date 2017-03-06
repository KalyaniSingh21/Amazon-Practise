package amazonpractise;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kalyani
 */
class BTreeNode {
    BTreeNode left,right;
    int value;
    
    BTreeNode()
    {
        left = right = null;
        value = 0;
    }
    
    BTreeNode(int value)
    {
        left = right = null;
        this.value = value;
    }
}
public class BSTree {
    
    BTreeNode root;
    
    BSTree() {
        root = null;
    }
        
    void insert(int value)
    {
        root = insertBTNode(root,value);
    }
    
    BTreeNode insertBTNode(BTreeNode root, int value)
    {
        if(root == null)
            root = new BTreeNode(value);
        
        else if(value < root.value )
            root.left = insertBTNode(root.left, value);
        else
            root.right = insertBTNode(root.right, value);
        
        return root;
    }  
    
    boolean search(int value)
    {
         return (searchBTNode(root, value));
    }
    
    boolean searchBTNode(BTreeNode root, int value)
    {
        if(root.value == value)
            return true;
        
        else if (value < root.value)
            return(searchBTNode(root.left, value));
        
        else
            return(searchBTNode(root.right, value));       
    }
    
    void inorder()
    {
        inorderTraversal(root);
         System.out.println();
    }
    
    void inorderTraversal(BTreeNode root)
    {
        if(root != null)
        {            
        inorderTraversal(root.left);
        System.out.print(root.value+" ");
        inorderTraversal(root.right);
        }
       
    }   
    
    void postorder()
    {
        postorderTraversal(root);
        System.out.println();
    }
    
    void postorderTraversal(BTreeNode root)
    {
        if(root !=null)
        {
            
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.value+" ");
        }
        
    }
    
    void preorder()
    {
        preorderTraversal(root);
        System.out.println();
    }
    
    void preorderTraversal(BTreeNode root)
    {
        if(root != null)
        {
            
        System.out.print(root.value+" ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        }
        
    }
    
    void minpath()
    {
        int sum = minpathfromroot(root);
        System.out.println("The min path is : "+sum);
    }
    
    int minpathfromroot(BTreeNode root)
    {
        int sum = root.value;
        int leftsum = Integer.MAX_VALUE;
        int rightsum = Integer.MAX_VALUE;
        
        if(root.left == null && root.right == null)
            return root.value;
        
        if(root.left != null)
            leftsum = minpathfromroot(root.left);
        if(root.right != null)
            rightsum =  minpathfromroot(root.right);
        
        
        if(leftsum<rightsum)
            sum = sum +leftsum;
        else
            sum += rightsum;    
        
        return sum;
    }
    
    BTreeNode minSuccessor(BTreeNode node)
    {
        while(node.left != null)
            node = node.left;
        
        return node;
    }
    
    void deletenode(int key)
    {
        root = deleteNode(root,key);
    }
    
    BTreeNode deleteNode(BTreeNode root, int key)
    {
        if(root == null)
            return null;
        
        else if(key< root.value)
            root.left = deleteNode(root.left, key);
        
        else if(key > root.value)
            root.right = deleteNode(root.right, key);
        
        else
        {
            if(root.right == null)
                return root.left;
            else if(root.left == null)
                return root.right;
            else
            {
                BTreeNode minRoot = minSuccessor(root.right);
                root.right = deleteNode(root.right, minRoot.value);
            }          
        }
        return root;
    }
    
    int closestNode(int target)
    {
        int min = (int) Double.MAX_VALUE;
        int diff;
        BTreeNode temp = root;
        
        while(temp!=null)
        {
            diff = (int)Math.abs(target-temp.value);
            if(diff<min) min = diff;
            
            if(target > temp.value)
            {               
                temp = temp.right;
            }
            else 
            {
                if(target == temp.value)
                    min = temp.value;
                temp = temp.left;
            }       
        }
        
        return min;
        
    }
    public static void main(String args[])
    {
        BSTree tree = new BSTree();        
        tree.insert(10);
        tree.insert(3);
        tree.insert(18);
        tree.insert(1);
        tree.insert(6);
        tree.insert(11);
                
        System.out.println(tree.search(11));
        
        tree.inorder();
        tree.postorder();
        tree.preorder();
        
        tree.minpath();
        
        tree.deletenode(18);
        tree.preorder();
        
        System.out.println(tree.closestNode(6));
    }   
}
