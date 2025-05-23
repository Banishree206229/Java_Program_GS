package programs;

import java.util.ArrayList;
import java.util.List;

public class InOrderTraversalTree {
    public static void main(String[] args) {
        //Inorder Traversal
        List<Integer> li = new ArrayList<>();
        TreeNode node = new TreeNode(40);
        TreeNode leftNode40 = new TreeNode(20);
        TreeNode rightNode40 = new TreeNode(60);
        TreeNode node1 = new TreeNode(50);
        TreeNode leftNode20 = new TreeNode(10);
        TreeNode rightNode20 = new TreeNode(30);

        node.left = leftNode40;
        node.right = rightNode40;
        node1.left = leftNode20;
        node1.right = rightNode20;

        List<Integer> list = inOrderTraversal(li, node);
        System.out.println(list);
    }

    public static List<Integer> inOrderTraversal(List<Integer> li, TreeNode node) {
        if (node != null) {
            if (node.left != null) {
                inOrderTraversal(li, node.left);
            }
            li.add(node.val);
            if (node.right != null) {
                inOrderTraversal(li, node.right);
            }
        }
        return li;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}