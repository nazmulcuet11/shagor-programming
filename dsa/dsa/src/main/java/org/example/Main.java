package org.example;



public class Main {

    public  static void printTree(TreeNode root) {
        if  (root == null) return;
        // preorder - System.out.println(root.val);
        printTree(root.left);
        // inorder - System.out.println(root.val);
        printTree(root.right);
        // postorder - System.out.println(root.val);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        printTree(root);
    }
}