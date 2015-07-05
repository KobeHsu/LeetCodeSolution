/**
 *
 */
package algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kobe
 *
 */
public class TestUtil {

    public static TreeNode generateCompleteTree(int nodeCount) {

        if (nodeCount <= 0) {
            return null;
        }

        List<TreeNode> parents = new ArrayList<TreeNode>();
        TreeNode root = new TreeNode(1);
        parents.add(root);

        int i = 2;
        while (i <= nodeCount) {

            List<TreeNode> newParents = new ArrayList<TreeNode>();

            for (TreeNode parent : parents) {

                if (parent.left == null) {
                    TreeNode node = new TreeNode(i);
                    parent.left = node;
                    newParents.add(node);
                    // System.out.println(parent.val + ", left, " + node.val);
                    i++;
                }

                if (i > nodeCount) {
                    break;
                }

                if (parent.right == null) {
                    TreeNode node = new TreeNode(i);
                    parent.right = node;
                    newParents.add(node);
                    // System.out.println(parent.val + ", right, " + node.val);
                    i++;
                }

                if (i > nodeCount) {
                    break;
                }

            }

            parents = newParents;

        }

        return root;

    }

    public static void traverseTree(TreeNode node) {

        if (node == null) {
            return;
        }

        System.out.println(node.val);
        if (node.left != null) {
            traverseTree(node.left);
        }
        if (node.right != null) {
            traverseTree(node.right);
        }

        return;

    }

}
