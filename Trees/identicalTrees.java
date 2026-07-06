package Trees;

import java.util.*;

public class identicalTrees {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ---------- First Tree ----------

        int n1 = sc.nextInt();

        HashMap<Integer, TreeNode> map1 = new HashMap<>();
        TreeNode root1 = null;

        for (int i = 0; i < n1; i++) {

            int value = sc.nextInt();
            int parent = sc.nextInt();

            map1.putIfAbsent(value, new TreeNode(value));
            TreeNode current = map1.get(value);

            if (parent == -1) {
                root1 = current;
            } else {

                map1.putIfAbsent(parent, new TreeNode(parent));
                TreeNode parentNode = map1.get(parent);

                if (parentNode.left == null)
                    parentNode.left = current;
                else
                    parentNode.right = current;
            }
        }

        // ---------- Second Tree ----------

        int n2 = sc.nextInt();

        HashMap<Integer, TreeNode> map2 = new HashMap<>();
        TreeNode root2 = null;

        for (int i = 0; i < n2; i++) {

            int value = sc.nextInt();
            int parent = sc.nextInt();

            map2.putIfAbsent(value, new TreeNode(value));
            TreeNode current = map2.get(value);

            if (parent == -1) {
                root2 = current;
            } else {

                map2.putIfAbsent(parent, new TreeNode(parent));
                TreeNode parentNode = map2.get(parent);

                if (parentNode.left == null)
                    parentNode.left = current;
                else
                    parentNode.right = current;
            }
        }

        if (isIdentical(root1, root2))
            System.out.println("Identical");
        else
            System.out.println("Not Identical");

        sc.close();
    }

    public static boolean isIdentical(TreeNode root1, TreeNode root2) {

        if (root1 == null && root2 == null)
            return true;

        if (root1 == null || root2 == null)
            return false;

        if (root1.val != root2.val)
            return false;

        return isIdentical(root1.left, root2.left)
                && isIdentical(root1.right, root2.right);
    }
}

class TreeNode {

    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}