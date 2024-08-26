package basicproblems;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class LowestCommonAncestor {

    public static TreeNode findLCA(TreeNode root, TreeNode p, TreeNode q) {
        // Base case: if root is null, or root is one of the nodes, return root
        if (root == null || root == p || root == q) {
            return root;
        }

        // Recursively search in left and right subtrees
        TreeNode leftLCA = findLCA(root.left, p, q);
        TreeNode rightLCA = findLCA(root.right, p, q);

        // If both left and right subtree calls return non-null values,
        // this means p and q are found in different subtrees, so root is their LCA
        if (leftLCA != null && rightLCA != null) {
            return root;
        }

        // Otherwise, return the non-null value (either from left or right)
        return leftLCA != null ? leftLCA : rightLCA;
    }

    public static void main(String[] args) {
        // Example binary tree
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        TreeNode p = root.left;  // Node 5
        TreeNode q = root.left.right.right;  // Node 4

        TreeNode lca = findLCA(root, p, q);
        if (lca != null) {
            System.out.println("Lowest Common Ancestor of " + p.val + " and " + q.val + " is: " + lca.val);
        } else {
            System.out.println("No common ancestor found.");
        }
    }
}

