package JCF.MarThreeICP;

public class TreePractice {
	
	// Find number of nodes in a given BST
	public int numOfNodes(Node objNode)
	{
		// Think about base case or the minimum possible tree
		if (objNode.left== null && objNode.right==null)
		{
			return 1;
		}
		// Assume you know the number of edges for left subtree (Nl) and
		//right subtree (Nr) of a node and find the numOfEdges in a tree
		//rooted with the node
		// come up with an expression in term of Nl and Nr
		else if((objNode.left == null || objNode.right == null)){
			if (objNode.left == null){
				return numOfNodes(objNode.right) + 1;
			}else{
				return numOfNodes(objNode.left) + 1 ;
			}
		}
		else
		{
			return numOfNodes(objNode.left) + numOfNodes(objNode.right) + 1;
		}
	}
	
	public int numOfEdges(Node T)
	{
		// Think about base case or the minimum possible tree
		if (T.left == null && T.right == null)
		{
			return 0;
		}
		// Assume you know the number of edges for left subtree (Nl) and
		//right subtree (Nr) of a node and find the numOfEdges in a tree
		//rooted with the node
		// come up with an expression in term of Nl and Nr
		else if((T.left == null || T.right == null)){
			if (T.left == null){
				return numOfEdges(T.right) + 1;
			}else{
				return numOfEdges(T.left) + 1;
			}

		}
		else
		{
			return numOfEdges(T.right) + numOfEdges(T.left) + 2;
		}
	}
	
	public int largestSum(Node T)
	{
		// Think about base case or the minimum possible tree
		if (T.left == null && T.right == null)
		{
			return T.data;
		}
		// Assume you know the number of edges for left subtree (Nl) and
		//right subtree (Nr) of a node and find the numOfEdges in a tree
		//rooted with the node
		// come up with an expression in term of Nl and Nr
		else if((T.left == null || T.right == null)){
			if (T.left == null){
				return largestSum(T.right) + T.data;
			}else{
				return largestSum(T.left) + T.data;
			}

		}
		else
		{
			return Math.max(largestSum(T.left),largestSum(T.right)) + T.data;
		}	
	}
	
	
	public static void main(String[] args)
	{
		
		
	}

}
