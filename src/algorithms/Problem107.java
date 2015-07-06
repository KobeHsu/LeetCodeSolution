package algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * Binary Tree Level Order Traversal II
 *
 * @author kobe
 *
 */
public class Problem107 {

  public List<List<Integer>> levelOrderBottom(TreeNode root) {

    List<List<Integer>> result = new ArrayList<List<Integer>>();

    List<List<TreeNode>> levelNodes = new ArrayList<List<TreeNode>>();
    if (root == null) {
      return result;
    }

    List<TreeNode> nodes = new ArrayList<TreeNode>();
    nodes.add(root);
    levelNodes.add(nodes);

    while (nodes.size() > 0) {

      List<TreeNode> tmpNodes = new ArrayList<TreeNode>();

      for (TreeNode node : nodes) {
        if (node.left != null) {
          tmpNodes.add(node.left);
        }
        if (node.right != null) {
          tmpNodes.add(node.right);
        }
      }

      if (tmpNodes.size() > 0) {
        levelNodes.add(tmpNodes);
      }
      nodes = tmpNodes;

    }

    // reverse
    for (int i = levelNodes.size() - 1; i >= 0; i--) {

      List<Integer> level = new ArrayList<Integer>();
      for (TreeNode node : levelNodes.get(i)) {
        level.add(node.val);
      }

      result.add(level);

    }

    return result;

  }



  public static void main(String args[]) {

    TreeNode root = TestUtil.generateCompleteTree(22);
    // TestUtil.traverseTree(root);

    Problem107 p = new Problem107();
    p.levelOrderBottom(root);

  }

}
