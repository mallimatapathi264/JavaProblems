package basicproblems;
/*class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}
*/

public class CheckBT_BSTorNot {

    // Helper function to check if the tree is a BST
    public static boolean isBST(TreeNode node, Integer minValue, Integer maxValue) {
        // Base case: If node is null, it's a valid BST
        if (node == null) {
            return true;
        }

        // If the node violates the min/max constraint, return false
        if ((minValue != null && node.val <= minValue) || (maxValue != null && node.val >= maxValue)) {
            return false;
        }

        // Recursively check the left and right subtrees with updated ranges
        return isBST(node.left, minValue, node.val) && isBST(node.right, node.val, maxValue);
    }

    // Wrapper function to call the helper with initial constraints
    public static boolean isBST(TreeNode root) {
        return isBST(root, null, null);
    }

    public static void main(String[] args) {
        // Example binary tree
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);

        if (isBST(root)) {
            System.out.println("The binary tree is a Binary Search Tree (BST).");
        } else {
            System.out.println("The binary tree is NOT a Binary Search Tree (BST).");
        }
    }
}
