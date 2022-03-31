/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JCF.MarThreeICP;

import java.util.*;
import java.lang.Math;
/**
 *
 * @author XY
 * @param <T>
 */



public class GBST<T extends Comparable<T>> {
    
    private GNode<T> root;
    
    public GBST()
    {
        root = null;
    }
    
   
    public void add(T value)
    {
        if (root==null)
        {
            root = new GNode<>(value);
            
        }
        else
        {
            addRecursive(root, value);
        }
    }
    
    private void addRecursive(GNode<T> objNode, T value)
    {
       if (objNode.data.compareTo(value) > 0)
       {
           if(objNode.left != null)
           {
            addRecursive(objNode.left, value);
           }
           else
           {
               objNode.left = new GNode<>(value);
           }
       }
       else
       {
            if(objNode.right != null)
           {
            addRecursive(objNode.right, value);
           }
           else
           {
               objNode.right = new GNode<>(value);
           }
       }  
    }
    
    public void display(TraversalType TT)
    {
        if (root == null){}
        else
        {
            switch(TT)
            {
                case INORDER:
                    displayInOrder(root);
                    break;
                case PREORDER:
                    displayPreOrder(root);
                    break;
                case POSTORDER:
                    displayPostOrder(root);
                    break;
                default:
                    Deque<GNode<T>> objQueue = new ArrayDeque<>();
                    objQueue.add(root);
                    displayBFT(root);
            }
        }
    }
    
    
    
    private void displayInOrder(GNode<T> objNode)
    {
        if (objNode.left != null)
        {
            displayInOrder(objNode.left);
        }
        
        System.out.println(objNode.data);
        
        if (objNode.right != null)
        {
            displayInOrder(objNode.right);
        }
    }
    
    private void displayPreOrder(GNode<T> objNode)
    {
        System.out.println(objNode.data);
        if (objNode.left != null)
        {
            displayPreOrder(objNode.left);
        }
        if (objNode.right != null)
        {
            displayPreOrder(objNode.right);
        }
    }
    
    private void displayPostOrder(GNode<T> objNode)
    {
        if (objNode.left != null)
        {
            displayPostOrder(objNode.left);
        }

        if (objNode.right != null)
        {
            displayPostOrder(objNode.right);
        }
        System.out.println(objNode.data);
    }
    
    public void displayBFT(GNode<T> objNode)
    {
        Deque<GNode<T>> objQueue = new ArrayDeque<>();
        if (root != null)
        {
            objQueue.add(root);
            BFTRecursive(objQueue);
        }
       
    }
    
    private void BFTRecursive(Deque<GNode<T>> objQueue)
    {
        if (objQueue.isEmpty()){}
        else
        {
            GNode<T> objNode = objQueue.element();
            System.out.println(objNode.data);
            if(objNode.left != null)
            {
                objQueue.add(objNode.left);
            }
            if(objNode.right != null)
            {
                objQueue.add(objNode.right);
            }
            objQueue.remove();
            BFTRecursive(objQueue);
        }
   }
    
    public int height()
    {
        if (root == null)
        {
            return -1;
        }
        else
        {
            return heightRecursive(root) - 1;  
        }
    }
    
    private int heightRecursive(GNode<T> objNode)
    {
        if (objNode == null)
        {
            return 0;
        }
        else
        {
            return Math.max(heightRecursive(objNode.left),heightRecursive(objNode.left))+1;
        }     
    }
}
