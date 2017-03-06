/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazonpractise;
class RepeatElement
{
    void printRepeating(int arr[], int size) 
    {
        int count[] = new int[size];
        int i;
 
        System.out.println("Repeated elements are : ");
        for (i = 0; i < size; i++) 
        {
            if (count[arr[i]] == 1)
                System.out.print(arr[i] + " ");
            else
                count[arr[i]]++;
        }
    }
 
    public static void main(String[] args)
    {
        RepeatElement repeat = new RepeatElement();
        int arr[] = {4, 2, 4, 5, 2, 3, 1};
        int arr_size = arr.length;
        repeat.printRepeating(arr, arr_size);
        
    }
}