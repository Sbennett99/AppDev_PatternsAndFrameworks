package JCF.InClassTrees;
import JCF.InClassTrees.AssignmentThree;
public class Main {
    public static void main(String[] args){
        BST<Integer> myBst = new BST<>();
        myBst.addNodeRecursive(20);
        myBst.addNodeRecursive(10);
        myBst.addNodeRecursive(30);
        myBst.addNodeRecursive(5);
        myBst.addNodeRecursive(15);
        myBst.addNodeRecursive(25);
        myBst.addNodeRecursive(40);

        //myBst.InOrderTraversal();

        BST<Integer> myBst1 = new BST<>();
        myBst1.addNodeRecursive(40);
        myBst1.addNodeRecursive(30);
        myBst1.addNodeRecursive(50);
        myBst1.addNodeRecursive(20);
       // myBst1.addNodeRecursive(15);
       // myBst1.addNodeRecursive(25);
       // myBst1.addNodeRecursive(40);


        System.out.println(AssignmentThree.Problem01Caller(myBst,myBst1));
        System.out.println(AssignmentThree.Problem02Caller(myBst,5));
        myBst.PostOrderTraversal();
        System.out.println(AssignmentThree.Problem03Caller(myBst,7));
        myBst.BreadthFirstTraversal();
        AssignmentThree.Problem04Caller(myBst);
        myBst1.BreadthFirstTraversal();
        AssignmentThree.Problem04Caller(myBst1);
    }
}
