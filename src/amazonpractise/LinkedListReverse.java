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

class Node {
    int data;
    Node next;
    
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
public class LinkedListReverse {
    Node head;
    
    
    LinkedListReverse()
    {
        this.head = null;
    } 
    
    void insert(int data)
    {        
        Node temp = head;
        
        if(head == null)
        {
            head = new Node(data);
            return;
        }
        
        while(temp.next != null)
        {
            temp = temp.next;
        }
        
        temp.next = new Node(data);
        
    }
    
    boolean search(int data)
    {
        Node temp = head;
        
        while(temp != null)
        {
            if(temp.data == data)
                return true;
            
            temp = temp.next;
        }
        
        return false;
    }
    
    void print()
    {
        Node temp = head;
        
        while(temp != null)
        {
            System.out.print(temp.data+ "\t");
            temp = temp.next;
        }
        
        System.out.println();
    }
    
    void iterativeReverse()
    {
        Node currentnode = head, previousnode = null, nextnode;
        
        while(currentnode != null)
        {
            nextnode = currentnode.next;

            currentnode.next = previousnode;

            previousnode = currentnode;
            currentnode = nextnode;
        }      
        head = previousnode;       
    }
    void recursiveReverse()
    {
        head = recursiveRev(head);
    }
            
            
    Node recursiveRev(Node head)
    {
        Node temp = head;
        if(temp == null || temp.next == null)
            return temp;
        
        Node returned = recursiveRev(temp.next);
        
        temp.next.next = temp;
        temp.next = null;
        
        return returned;
    }
    
    void printRecursiveRev(Node node)            
    {        
        while(node != null)
        {
            System.out.print(node.data+"\t");
            node = node.next;
        }
    }
    
   void reverseHalf(LinkedListReverse list)
    {
        Node temp = head, halfHead;
        int length=0;
        
        while(temp != null)
        {
            temp = temp.next;
            length++;
        }
        
        int halfLength = length/2;
        temp = head;
        for(int i =0; i<=halfLength; i++)
        {
            temp = temp.next;
        }
        
       halfHead = list.recursiveRev(temp.next);
       temp.next = halfHead;
        
    }
    
    public static void main(String args[])
    {
        LinkedListReverse list = new LinkedListReverse();
        list.insert(0);
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.print();
        
        System.out.println("\n"+list.search(2));
        list.iterativeReverse();
        list.print();
        
        list.recursiveReverse();
        list.print();
        
        list.reverseHalf(list);
        list.print();
        
    }
    
}
