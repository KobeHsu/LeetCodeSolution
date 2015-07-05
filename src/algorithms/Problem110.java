package algorithms;

/**
 * Balanced Binary Tree
 *
 * @author kobe
 *
 */
public class Problem110 {

    private int getHeight(TreeNode node) {

        if (node == null) {
            return 0;
        }

        return 1 + Math.max(getHeight(node.left), getHeight(node.right));

    }

    public boolean isBalanced(TreeNode root) {

        if (root == null) {
            return true;
        }

        int lh = getHeight(root.left);
        int rh = getHeight(root.right);

        if (Math.abs(lh - rh) <= 1 && isBalanced(root.left) && isBalanced(root.right)) {

            return true;
        }

        return false;

    }

    public static void main(String args[]) {

        TreeNode emptyTree = null;
        TestUtil.traverseTree(emptyTree);

        Problem110 p = new Problem110();
        System.out.println(p.isBalanced(emptyTree));

        TreeNode balancedTree = p.getHeightBalancedTree();
        // TestUtil.traverseTree(balancedTree);
        System.out.println(p.isBalanced(balancedTree));

        TreeNode NonBalancedTree = p.getNonHeightBalancedTree();
        // TestUtil.traverseTree(NonBalancedTree);
        System.out.println(p.isBalanced(NonBalancedTree));

    }

    public TreeNode getHeightBalancedTree() {

        int i = 0;
        TreeNode root = new TreeNode(i++);

        root.left = new TreeNode(i++);
        root.right = new TreeNode(i++);

        root.left.left = new TreeNode(i++);
        root.left.right = new TreeNode(i++);

        root.right.right = new TreeNode(i++);
        root.left.right.left = new TreeNode(i++);

        return root;
    }

    private TreeNode getNonHeightBalancedTree() {

        int i = 0;
        TreeNode root = new TreeNode(i++);

        root.left = new TreeNode(i++);
        root.right = new TreeNode(i++);

        root.left.left = new TreeNode(i++);
        root.left.right = new TreeNode(i++);

        root.right.left = new TreeNode(i++);
        root.right.right = new TreeNode(i++);

        root.left.left.left = new TreeNode(i++);
        root.left.left.right = new TreeNode(i++);

        root.left.right.right = new TreeNode(i++);

        root.left.left.right.left = new TreeNode(i++);
        root.left.right.right.left = new TreeNode(i++);

        return root;
    }

}
