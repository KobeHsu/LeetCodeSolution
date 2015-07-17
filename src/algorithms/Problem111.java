package algorithms;

/**
 * Minimum Depth of Binary Tree
 *
 * @author kobe
 *
 */
public class Problem111 {

  public int minDepth(TreeNode root) {

    if (root == null)
      return 0;

    int leftDepth = minDepth(root.left);
    int rightDepth = minDepth(root.right);

    int depth = Math.min(leftDepth, rightDepth);
    if (depth == 0) {
      depth = Math.max(leftDepth, rightDepth);
    }

    return 1 + depth;
  }

  public static void main(String args[]) {

    Problem111 p = new Problem111();
    TreeNode root = TestUtil.generateCompleteTree(13);

    long start = System.currentTimeMillis();
    System.out.println(p.minDepth(root));
    long end = System.currentTimeMillis();
    System.out.println(end - start + "ms");

  }
}
