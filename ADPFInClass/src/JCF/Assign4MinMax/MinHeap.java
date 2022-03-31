/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JCF.Assign4MinMax;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author XY
 */
public class MinHeap {
    private ArrayList<Integer> A;

    
    public MinHeap()
    {
        A = new ArrayList<>();
        // Dummy entry at index 0
        A.add(-1);
    }
    
    /**
     * Display the contents of the heap
     */
    public void display()
    {
        Iterator<Integer> itr = A.iterator();
        itr.next();
        boolean flag = true;
        while(itr.hasNext())
        {
        	if (flag==true)
        	{
        		System.out.print("["+itr.next());
        		flag=false;
        	}
        	else
        	{
        		System.out.print(", "+itr.next());
        	}
        }
        System.out.print("]\n");
     
    }
    
    /**
     * Find the index of parent
     * @param indexOfChild
     * @return index: index of parent of indexOfChild
     */
    public int indexOfParent(int indexOfChild)
    {
        return (indexOfChild==1? 1:indexOfChild/2);
    }
    
    /**
     * Find the index of left child
     * @param indexOfParent
     * @return index: index of left child of indexOfParent
     */
    public int indexOfLeftChild(int indexOfParent)
    {
        return (2*indexOfParent< A.size()?2*indexOfParent:indexOfParent);
    }
    
    /**
     * Find the index of right child
     * @param indexOfParent
     * @return index: index of right child of indexOfParent
     */
    public int indexOfRightChild(int indexOfParent)
    {
        return (2*indexOfParent + 1 < A.size() ? 2*indexOfParent 
                + 1:indexOfParent);
    }
    
    /**
     * Check emptiness of the heap A
     * @return true if heap is empty otherwise false
     */
    public boolean isEmpty()
    {
        return (A.size() == 1);
    }
    
    /**
     * Insert an element in heap A
     * @param value
     */
    public void insert(int value)
    {
         A.add(value);
         heapifyUp();
    }
    
    /**
     * Ensure that A maintains min heap property after insertion
     */
    public void heapifyUp()
    {
    	// If there is only one element in the heap
        if (A.size() == 2){}
        // If heap A has more than one element
        else
        {
        	// Index of the element inserted
            int tempIndex = A.size()-1;
            while(true)
            {
            	// Find the parent index of the element inserted
                int parentIndex = indexOfParent(tempIndex);
                
                // Compare inserted element with its parent
                if (A.get(tempIndex) < A.get(parentIndex))
                {
                    swap(parentIndex, tempIndex);
                    tempIndex = parentIndex;
                }
                else
                {
                    break;
                }
            }
        }
    }
            
    public int delete()
    {
    	// Check emptiness of heap A
        if (isEmpty())
        {
            System.out.println("Heap is empty");
            System.exit(0);
            return 0;
        }
        else
        {
        	// Find the top element of heap A
        	int topElement = A.get(1);
        	
        	// Replace the top element with the last element
        	Collections.swap(A, 1, A.size()-1);
        	
        	// Remove the last element
        	A.remove(A.size()-1);
        	
        	// Ensure A satisfies MinHeap property
            heapifyDown();
            
            return topElement;
        }
    }
    
    public void heapifyDown()
    {
    	// Index of the top element
        int tempIndex = 1;
        while (true)
        {
        	// Find the index of left and right child of 
        	// element stored at tempIndex
            int leftIndex = indexOfLeftChild(tempIndex);
            int rightIndex =  indexOfRightChild(tempIndex);
            
            // When right child does not exist 
            // Note: there will be no case for left child does
            // not exist and right child exist
            if (tempIndex!=leftIndex && tempIndex == rightIndex)
            {
            	// Compare parent element with its left child
                 if(A.get(tempIndex) > A.get(leftIndex))
                {
                    swap(tempIndex, leftIndex);
                    tempIndex = leftIndex;
                }
                else
                {
                    break;
                }
            }
            // When both left and right child exist
            else if (tempIndex != leftIndex && tempIndex != rightIndex)
            {
            	// Find the child that is minimum
                int minIndex = (A.get(leftIndex)<A.get(rightIndex)?
                		leftIndex:rightIndex);
                
                // Compare the parent with its minimum of left and
                // right child
                if(A.get(tempIndex) > A.get(minIndex))
                {
                    swap(tempIndex, minIndex);
                    tempIndex = minIndex;
                }
                else
                {
                    break;
                }
            }
            else
            {
                break;
            }     
        }
    }
    
    
    /**
     * Swap the element of A stored at firstIndex and secondIndex
     * @param firstIndex
     * @param secondIndex
     */
    public void swap(int firstIndex, int secondIndex)
    {
    	Collections.swap(A, firstIndex, secondIndex);
    }

    public int findElement(int index){
        if(index > size() || index <= 0){
            throw new IndexOutOfBoundsException();
        }
        return A.get(index);
    }
    public int size(){
        return A.size()-1;
    }


}
