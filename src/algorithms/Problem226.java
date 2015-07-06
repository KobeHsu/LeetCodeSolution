package algorithms;

/**
 * Invert Binary Tree
 *
 * @author kobe
 *
 */
public class Problem226 {

  public TreeNode invertTree(TreeNode root) {

    if (root == null) {
      return null;
    }

    invert(root);

    return root;

  }

  private void invert(TreeNode node) {

    if (node == null) {
      return;
    }

    TreeNode tmp = node.left;
    node.left = node.right;
    node.right = tmp;

    invert(node.left);
    invert(node.right);

  }

  public static void main(String args[]) {

    TreeNode root = TestUtil.generateCompleteTree(15);
    // TestUtil.traverseTree(root);

    Problem226 p = new Problem226();
    p.invertTree(root);
    TestUtil.traverseTree(root);

  }

}
