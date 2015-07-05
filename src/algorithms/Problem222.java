package algorithms;

/**
 * Count Complete Tree Nodes
 *
 * @author kobe
 *
 */
public class Problem222 {

    private int totalNodes = 0;

    private int getDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int depth = 1;

        TreeNode node = root;
        while (node != null) {
            depth++;
            node = node.left;
        }
        return depth - 1;
    }

    public static void main(String args[]) {

        TreeNode root = TestUtil.generateCompleteTree(25);
        // traverseTree(root);

        Problem222 p = new Problem222();
        int count = p.countNodes(root);
        System.out.println(count);
        System.out.println(p.countNodes_loop(root));

    }

    public int countNodes(TreeNode root) {

        if (root == null) {
            return 0;
        }

        totalNodes = 0;
        countNodes_recursive(root);

        return totalNodes;

    }

    public void countNodes_recursive(TreeNode node) {

        if (node.left == null && node.right == null) {
            totalNodes++;
            return;
        }

        if (getDepth(node.left) == getDepth(node.right)) {
            totalNodes += (1 << getDepth(node.left));
            if (node.right != null) {
                countNodes_recursive(node.right);
            }
        } else {
            totalNodes += (1 << getDepth(node.right));
            if (node.left != null) {
                countNodes_recursive(node.left);
            }
        }

    }

    public int countNodes_loop(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int count = 0;

        while (true) {

            if (root.left == null && root.right == null) {
                count++;
                break;
            }

            if (getDepth(root.left) == getDepth(root.right)) {
                count += (1 << getDepth(root.left));
                if (root.right != null) {
                    root = root.right;
                }
            } else {
                count += (1 << getDepth(root.right));
                if (root.left != null) {
                    root = root.left;
                }
            }

        }

        return count;
    }

}
