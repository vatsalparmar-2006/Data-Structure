// 77,78. Write a menu driven program to implement Binary Search Tree (BST) & perform
// following operations
// -> Insert a node, Delete a node, Search a node
// -> Preorder Traversal, Postorder Traversal, Inorder Traversal

import java.util.*;

class Node {
	int data;
	Node lptr;
	Node rptr;

	public Node(int value){
		this.data = value;
	}
}

class BSTImplement {
	Node root;

	// insert a node in BST
	public Node insert(Node root, int value){
		if(root==null){
			root = new Node(value);
			return root;
		}

		if(root.data>value){
			root.lptr = insert(root.lptr,value);
		}
		else{
			root.rptr = insert(root.rptr,value);
		}

		return root;
	}

	// search a node in BST
	public boolean search(Node root, int searchValue){
		if(root==null){
			return false;
		}

		if(root.data==searchValue){
			return true;
		}
		else if(root.data>searchValue){
			return search(root.lptr,searchValue);
		}
		else{
			return search(root.rptr,searchValue);
		}
	}

	// delete a node in BST
	public Node delete(Node root, int deleteValue){
		if(root==null){
			return root;
		}

		if(root.data>deleteValue){
			root.lptr = delete(root.lptr,deleteValue);
		}
		else if(root.data<deleteValue){
			root.rptr = delete(root.rptr,deleteValue);
		}
		else{
			if(root.lptr==null && root.rptr==null){
				return null;
			}
			if(root.lptr==null){
				return root.rptr;
			}
			if(root.rptr==null){
				return root.lptr;
			}

			// if both side's subtrees available
			Node temp = getSuccessor(root.rptr);
			root.data = temp.data;
			delete(root.rptr,temp.data);
		}

		return root;
	}

	// helper function
	public Node getSuccessor(Node root){
		while(root.lptr!=null){
			root = root.lptr;
		}
		return root;
	}

	// print inorder
	public void inOrder(Node root){
		if(root==null){
			return;
		}

		inOrder(root.lptr);
		System.out.print(root.data + " ");
		inOrder(root.rptr);
	}

	// print preorder
	public void preOrder(Node root){
		if(root==null){
			return;
		}

		System.out.print(root.data + " ");
		preOrder(root.lptr);
		preOrder(root.rptr);
	}

	// print postorder
	public void postOrder(Node root){
		if(root==null){
			return;
		}

		postOrder(root.lptr);
		postOrder(root.rptr);
		System.out.print(root.data + " ");
	}
}

public class BST {
	public static void main(String[] args) {
		
		int[] arr = {50,25,75,22,40,60,80,15,30,90};

		BSTImplement bstTree = new BSTImplement();

		Node root=null;
		for(int i=0; i<arr.length; i++){
			root = bstTree.insert(root,arr[i]);
		}

		// print
		System.out.print("\nInorder : ");
        bstTree.inOrder(root);
        System.out.println();

        System.out.print("Preorder : ");
        bstTree.preOrder(root);
        System.out.println();

        System.out.print("Postorder : ");
        bstTree.postOrder(root);
        System.out.println();

        // search
        int searchValue = 60;
        if(bstTree.search(root, searchValue)){
            System.out.println("\n"+searchValue +" Found.");
        }
        else{
            System.out.println("\n"+searchValue +" Not Found.");
        }

        // delete
        int deleteValue = 25;
        System.out.print("\nAfter Delete Node : "+deleteValue);
        bstTree.delete(root, deleteValue);

        System.out.print("\nInorder : ");
        bstTree.inOrder(root);
        System.out.println();
        System.out.print("Preorder : ");
        bstTree.preOrder(root);
        System.out.println();
        System.out.print("Postorder : ");
        bstTree.postOrder(root);
        System.out.println(); 
	}
}