// 80. Write a program to check whether the given tree is symmetric or not.

import java.util.*;

class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;

	public TreeNode(int value){
		this.data = value;
		left=right=null;
	}
}

class BinaryTree {

	public TreeNode insertLevelOrder(int[] arr, int i){
		TreeNode root=null;
		if(i<arr.length){
			root = new TreeNode(arr[i]);
			root.left = insertLevelOrder(arr, 2*i +1);
			root.right = insertLevelOrder(arr, 2*i +2);
		}

		return root;
	}

	public boolean isSymmetricTree(TreeNode root){

		Queue<TreeNode> leftTreeQueue = new LinkedList<>();
		Queue<TreeNode> rightTreeQueue = new LinkedList<>();

		leftTreeQueue.add(root.left);
		rightTreeQueue.add(root.right);

		while(!leftTreeQueue.isEmpty() && !rightTreeQueue.isEmpty()){

			TreeNode leftNode = leftTreeQueue.poll();
			TreeNode rightNode = rightTreeQueue.poll();

			if(leftNode==null && rightNode==null){
				continue;
			}
			else if(leftNode==null || rightNode==null || leftNode.data != rightNode.data){
				return false;
			}

			leftTreeQueue.add(leftNode.left);
			leftTreeQueue.add(leftNode.right);
			rightTreeQueue.add(rightNode.right);
			rightTreeQueue.add(rightNode.left);
		}

		return true;
	}

	public void levelOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode tempNode = queue.poll();
            System.out.print(tempNode.data + " ");

            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }

        System.out.println();
    }
}

public class SymmetricTree {
	public static void main(String[] args) {
		
		int[] arr = {8, 5, 5, 3, 6, 6, 3};

		BinaryTree bTree = new BinaryTree();

		TreeNode root = bTree.insertLevelOrder(arr, 0); 
        
        System.out.print("\nLevel order Traversal of Tree : ");
        bTree.levelOrderTraversal(root);

        boolean result = bTree.isSymmetricTree(root);

        if (result) {
            System.out.println("\nThe trees are the Symmetric.");
        } else {
            System.out.println("\nThe trees are not the Symmetric.");
        } 
	}
}