// 79. Write a program to check whether the given two trees are same or not.

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

	public boolean isSameTree(TreeNode root1, TreeNode root2){

		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root1);
		queue.add(root2);

		while(!queue.isEmpty()){
			TreeNode first = queue.poll();
			TreeNode second = queue.poll();

			if(first==null && second==null){
				continue;
			}
			else if(first==null || second==null || first.data != second.data){
				return false;
			}

			queue.add(first.left);
			queue.add(second.left);
			queue.add(first.right);
			queue.add(second.right);
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

public class SameTreeCheck {
	public static void main(String[] args) {
		
		int[] arr1 = {3, 5, 6, 8, 6, 5, 3};
		int[] arr2 = {8, 5, 5, 3, 6, 6, 3};

		BinaryTree bTree = new BinaryTree();

		TreeNode root1 = bTree.insertLevelOrder(arr1, 0);
        TreeNode root2 = bTree.insertLevelOrder(arr2, 0);  
        
        System.out.print("\nLevel order Traversal of Tree1 : ");
        bTree.levelOrderTraversal(root1);
        System.out.print("Level order Traversal of Tree2 : ");
        bTree.levelOrderTraversal(root2);

        boolean result = bTree.isSameTree(root1, root2);

        if (result) {
            System.out.println("\nThe trees are the same.");
        } else {
            System.out.println("\nThe trees are not the same.");
        } 
	}
}