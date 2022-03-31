package JCF.InClassTrees;

public class Node<T> {

    public T data;
    private Node left;
    private Node right;
    private int height = 0;

    public Node(T data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
    public int getHeight(){
        return this.height;
    }
    private void setHeight(int h){
        this.height = h;
    }
    public void updateH(){
        if(this.hasLeft()){
            updateH(this.left);
        }
        if(this.hasRight()){
            updateH(this.right);
        }
    }
    private void updateH(Node n){
        if(n.hasLeft() || n.hasRight()){
            if(n.hasRight()){
                updateH(n.getRight());

            }if(n.hasLeft()){
                updateH(n.getRight());

            }


        }

        if(!n.hasRight() && !n.hasLeft()){
            n.setHeight(1);
        }

    }
    public void setLeft(Node n){
        this.left = n;
    }
    public void setRight(Node n){
        this.right = n;
    }
    public Node getRight(){
        return this.right;
    }
    public Node getLeft(){
        return this.left;
    }
    public T getData(){
        return this.data;
    }
    public boolean hasRight(){
        if (this.right != null){
            return true;
        }
        return false;
    }
    public boolean hasLeft(){
        if (this.left != null){
            return true;
        }
        return false;
    }
}
