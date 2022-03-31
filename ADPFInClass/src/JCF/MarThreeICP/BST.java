/**
 * 
 * @author XY
 *
 */
package JCF.MarThreeICP;
import java.util.*;

/**
 * Class for binary search tree
 */

public class BST {
	
	private Node root;
	
	// Getter for the root node
	public Node getRoot()
	{
		return root;
	}
	
	// Setter for the root node
	public void setRoot(Node root)
	{
		this.root = root;
	}
	
	// Constructor
	public BST()
	{
		root = null;
	}
	
	// Non-recursive insertion function
	public void insert(int data)
	{
		if(root == null)
			root = new Node(data);
		else
		{
			Node temp = root;
			while(true)
			{  
				// If node is needed to add in the left subtree of temp node
				if (data < temp.data)
				{
					if (temp.left == null)
					{
						temp.left = new Node(data);
						break;
					}
					else
					{
						temp = temp.left;
					}
				}
				else
				{
					// If node is needed to add in the right subtree of temp node
					if (temp.right == null)
					{
						temp.right = new Node(data);
						break;
					}
					else
					{
						temp = temp.right;
					}
					
				}
			}
		}
		
	}

	// Recursive insertion function
	public void addRecursive(Node objNode, int data)
	{
			if (root == null)
			{
				root = new Node(data);
			}
			else if (data < objNode.data)
			{
				if (objNode.left!= null)
					addRecursive(objNode.left, data);
				else
				{
					objNode.left = new Node(data);
				}
			}
			else
			{
				if (objNode.right!= null)
					addRecursive(objNode.right, data);
				else
				{
					objNode.right = new Node(data);
				}
			}		
	}
	
	// Immediate successor of a node
	public Node immediateSuccessor(Node objNode)
	{
		if (objNode.right == null)
		{
			return null;
		}
		else
		{
			return immediateSuccessorRec(objNode.right);
		}
	}
	private Node immediateSuccessorRec(Node objNode)
	{
		if (objNode.left == null)
			return objNode;
		else
			return immediateSuccessorRec(objNode.left);
	}
	
	// Find a node based on its value
	public Node find(int data)
	{
		if (root==null)
			return null;
		else
			return findRecursive(root, data);
	}
	private Node findRecursive(Node objNode, int data)
	{
		if (objNode == null)
			return null;
		else if (data == objNode.data) 
			return objNode;
		else if (data < objNode.data)
			return findRecursive(objNode.left, data);
		else
			return findRecursive(objNode.right, data);
	}
	
	// find a parent node based on a value of a node
	public Node findParent(int data)
	{
		if (root==null)
			return null;
		else if (root.data==data)
			return root;
		else
			return findParentRec(root, root, data);	
	}
	
	public Node findParentRec(Node parentNode, Node objNode, int data)
	{
		if (objNode == null)
			return null;
		else if (data == objNode.data) 
			return parentNode;
		else if (data < objNode.data)
		{
			return findParentRec(objNode, objNode.left, data);
		}
		else
		{
			return findParentRec(objNode, objNode.right, data);
		}
	}
	
	// Deletion of a data
	public void delete(int data)
	{
		
		if (root == null) {}
		else
		{
			Node objNode = find(data);
			Node objNodeParent = findParent(data);
			if (objNode == null) {}
			else if (objNode == objNodeParent)
			{
				objNodeParent = null;
			}
			else if (objNode.left==null && objNode.right==null)
			{
				if(objNodeParent.left.data == objNode.data)
				{
					objNodeParent.left = null;
				}
				else
					objNodeParent.right = null;
			}
			else if (objNode.left != null && objNode.right==null)
			{
				if(objNodeParent.left.data == objNode.data)
				{
					objNodeParent.left = objNode.left;
				}
				else
					objNodeParent.right = objNode.left;
			}
			else if(objNode.right != null && objNode.left==null)
			{
				if(objNodeParent.left.data == objNode.data)
				{
					objNodeParent.left = objNode.right;
				}
				else
					objNodeParent.right = objNode.right;
			}
			else
			{
				Node objNodeSuccessor = immediateSuccessor(objNode);
				objNodeParent = findParent(objNodeSuccessor.data);
				objNode.data = objNodeSuccessor.data;
				if(objNodeParent.left.data == objNodeSuccessor.data)
				{
					objNodeParent.left = objNodeSuccessor.right;
				}
				else
					objNodeParent.right = objNodeSuccessor.right;
					
			}
		}
	}
	
	
	public void inorderTraversal(Node objNode)
	{
		if (objNode==null) {}
		else
		{
			inorderTraversal(objNode.left);
			System.out.print(objNode.data +" ");
			inorderTraversal(objNode.right);
		}
		
	}
	
	
	public void preorderTraversal(Node objNode)
	{
		if (objNode==null) {}
		else
		{
			System.out.print(objNode.data +" ");
			preorderTraversal(objNode.left);
			preorderTraversal(objNode.right);
		}
		
	}
	
	public void postorderTraversal(Node objNode)
	{
		if (objNode==null) {}
		else
		{
			postorderTraversal(objNode.left);
			postorderTraversal(objNode.right);
			System.out.print(objNode.data +" ");
		}
		
	}
	public void BFT(Node objNode)
	{
		
		Deque<Node> objDeque = new ArrayDeque<>();
		if (objNode != null)
		{
			objDeque.add(objNode);
		}
		while(!objDeque.isEmpty())
		{
			Node temp = objDeque.remove();
			System.out.print(temp.data+" ");
			if(temp.left!= null)
				objDeque.add(temp.left);
			if(temp.right!=null)
				objDeque.add(temp.right);    
		}
		
	}

} 
