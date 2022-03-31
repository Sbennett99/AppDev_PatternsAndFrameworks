package JCF.InClassTrees;

import java.lang.reflect.Array;
import java.lang.reflect.TypeVariable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class BST<T extends Comparable<T>> {
    private Node<T> root;

    public BST(){
        root = null;
    }

    public void addNode(T num) {
        if (this.root == null) {
            this.root = new Node<T>(num);
            return;
        }
        Boolean runner = true;
        Node<T> current = this.root;
        while (runner) {

            if (current.data.compareTo(num) == 0) {
                System.out.println("No Duplicates");
                runner = false;
                return;
            } else if (current.data.compareTo(num) > 0) {
                if (current.hasLeft()) {
                    current = current.getLeft();
                } else {
                    current.setLeft(new Node<T>(num));
                    runner = false;
                    break;
                }
            } else if (current.data.compareTo(num) < 0) {
                if (current.hasRight()) {
                    current = current.getRight();
                } else {
                    current.setRight(new Node<T>(num));
                    runner = false;
                    break;
                }
            }
        }
    }


    public void addNodeRecursive(T num){
        // This is the caller
        if(this.root == null){
            setRoot(new Node<T>(num));
        }else {
            this.root = addNodeRecursive(num, this.root);
        }
    }
    private Node addNodeRecursive(T num, Node<T> n){
        // This is the function
        if(n == null){
             return new Node<T>(num);
        }
        else if(num.compareTo(n.data) > 0){
            n.setRight(addNodeRecursive(num,n.getRight()));
            return n;
        }
        else if(num.compareTo(n.data) < 0){
            n.setLeft(addNodeRecursive(num,n.getLeft()));
            return n;
        }
        else{

            System.out.println("if here num duplicate");
            return null;
        }

    }


    public  void InOrderTraversal(){
        InOrderTraversal(this.root);
        System.out.println();
    }
    private void InOrderTraversal(Node<T> n){
        if(n == null){}
        else{
            InOrderTraversal(n.getLeft());
            System.out.print(n.getData()+ " ");
            InOrderTraversal(n.getRight());
        }
    }


    public  void PreOrderTraversal(){
        PreOrderTraversal(this.root);
        System.out.println();
    }
    private void PreOrderTraversal(Node<T> n){
        if(n == null){}
        else{
            PreOrderTraversal(n.getLeft());
            System.out.print(n.getData()+ " ");
            PreOrderTraversal(n.getRight());
        }
    }


    public  void PostOrderTraversal(){
        PostOrderTraversal(this.root);
        System.out.println();
    }
    private void PostOrderTraversal(Node<T> n){
        if(n == null){}
        else{
            PostOrderTraversal(n.getRight());
            System.out.print(n.getData()+ " ");
            PostOrderTraversal(n.getLeft());
        }
    }
    public  void BreadthFirstTraversal(){
        BreadthFirstTraversal(this.root);
        System.out.println();
    }
    private void BreadthFirstTraversal(Node<T> n){
        if(n == null){}
        else {
            ArrayList<Node> arr = new ArrayList<>();
            arr.add(n);
            while(!arr.isEmpty()){
                if(arr.get(0).hasLeft()){
                    arr.add(arr.get(0).getLeft());
                }
                if(arr.get(0).hasRight()){
                    arr.add(arr.get(0).getRight());
                }
                System.out.print(arr.remove(0).getData()+ " " );

            }
        }

    }
    private void updateHeight(){
        this.root.updateH();
    }

    public Node getRoot(){
        return this.root;
    }
    public void setRoot(Node<T> n){
        this.root = n;
    }

}