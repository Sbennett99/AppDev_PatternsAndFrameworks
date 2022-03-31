/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JCF.MarThreeICP;
/**
 *
 * @author XY
 * @param <T>
 */
public class GNode<T> 
{
     T data;
     GNode left;
     GNode right;
    public GNode(T x)
    {
        data = x;
        left = null;
        right = null;
    }
}
