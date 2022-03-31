package JCF.InClassTrees;

import java.util.ArrayList;
import java.util.List;

public class AssignmentThree {

    public static void main(String[] args){
        BST<Integer> myBst = new BST<>();
        myBst.addNodeRecursive(20);
        myBst.addNodeRecursive(10);
        myBst.addNodeRecursive(30);
        myBst.addNodeRecursive(5);
        myBst.addNodeRecursive(15);
        myBst.addNodeRecursive(25);
        myBst.addNodeRecursive(40);



        BST<Integer> myBst2 = new BST<>();
        myBst2.addNodeRecursive(20);
        myBst2.addNodeRecursive(10);
        myBst2.addNodeRecursive(30);
        myBst2.addNodeRecursive(50);
        myBst2.addNodeRecursive(15);
        myBst2.addNodeRecursive(25);
        myBst2.addNodeRecursive(40);


        System.out.println(Problem01Caller(myBst,myBst2));
        System.out.println(Problem02Caller(myBst,5));

        System.out.println(Problem03Caller(myBst,7));

        Problem04Caller(myBst);

    }

    public static boolean Problem01Caller(BST<Integer> b1, BST<Integer> b2){

        return Problem01(b1.getRoot(), b2.getRoot());

    }
    private static boolean Problem01(Node<Integer> n1, Node<Integer> n2){

        if(n1.data == n2.data){
            boolean b1l = n1.hasLeft();
            boolean b1r = n1.hasRight();
            boolean b2l = n2.hasLeft();
            boolean b2r = n2.hasRight();
            if((b1l && !b2l) || (!b1l && b2l)){
                return false;
            }else{
                if((b1r && !b2r) || (!b1r && b2r)){
                    return false;
                }else{
                    if(!b1l){
                        if(!b1r){
                            return true;
                        }
                        else{
                            return Problem01(n1.getRight(),n2.getRight()) && true;
                        }
                    }else{
                        if(!b1r){
                            return Problem01(n1.getLeft(),n2.getLeft()) && true;
                        }else{
                            return Problem01(n1.getRight(),n2.getRight()) && Problem01(n1.getLeft(),n2.getLeft()) && true;
                        }
                    }
                }
            }


        }else{
            return false;
        }
    }

    public static int Problem02Caller(BST<Integer> b1, int k){
        if(b1 .getRoot().data == null){
            return  -1;
        }

        return Problem02(b1.getRoot(),k,false);


    }

    private static int Problem02(Node<Integer> n, int k, boolean inRight){

        if(n.data < k){
            if(n.hasRight()){
                if(n.hasLeft()){
                    // plus 1 cancels negative 1s in right branch
                    return Problem02(n.getRight(),k,true) + getTreeSum(n.getLeft())+ n.data;
                }else{

                    return Problem02(n.getRight(),k,true) + n.data ;
                }
            }else{
                if(n.hasLeft()){
                    return getTreeSum(n.getLeft()) + n.data;
                }else{
                    return n.data;
                }
            }
        }else if(n.data == k){
            if(n.hasLeft()){
                return getTreeSum(n.getLeft()) + n.data ;
            }else{
                return n.data;
            }
        }else{
            if (n.hasLeft()){
                return Problem02(n.getLeft(),k, inRight);
            }else{
                if(!inRight) {
                    return -1;
                }else{
                    return 0;
                }
            }
        }

    }
    private static int getTreeSum(Node<Integer> n){
        if(n.hasLeft()){
            if(n.hasRight()){
                return getTreeSum(n.getRight()) + getTreeSum(n.getRight()) + n.data;
            }else{
                return getTreeSum(n.getLeft()) + n.data;
            }
        }else{
            if(n.hasRight()){
                return getTreeSum(n.getRight()) + n.data;
            }else{
                return n.data;
            }
        }
    }

    public static int Problem03Caller(BST<Integer> b1, int k){
        if(b1 .getRoot().data == null){
            return  -1;
        }
        ArrayList<Integer> BtoS = Problem03(b1.getRoot());
        if(k > BtoS.size() || k<=0){
            return -1;
        }
        return BtoS.get(k-1);
    }

    private static ArrayList<Integer> Problem03(Node<Integer> n){
        if(n == null){
            return null;
        }else{
            ArrayList<Integer> n1 = Problem03(n.getRight());
            if (n1 == null){
                n1 = new ArrayList<Integer>();
            }
            n1.add(n.getData());
            ArrayList<Integer> n2 = Problem03(n.getLeft());
            if(n2 != null){
                for( int num: n2){
                    n1.add(num);
                }
            }

            return n1;
        }
    }

    public static void Problem04Caller(BST<Integer> b1) {

        Problem04(b1.getRoot());
        System.out.println("");
    }

    private static void Problem04(Node n){
        if(n == null){}
        else {
            System.out.print(n.data + " ");
            NotPrintLevelProblem04(n.getLeft());
            NotPrintLevelProblem04(n.getRight());
        }
    }
    private static void NotPrintLevelProblem04(Node n){
        if(n == null){}
        else {
            Problem04(n.getLeft());
            Problem04(n.getRight());
        }
    }
}
