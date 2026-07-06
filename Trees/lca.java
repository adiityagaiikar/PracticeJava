package Trees;

import java.util.*;

public class lca {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        HashMap<Integer, TreeNode> map = new HashMap<>();

        TreeNode root = null;

        for (int i = 0; i < n; i++) {

            int value = sc.nextInt();
            int parent = sc.nextInt();

            map.putIfAbsent(value, new TreeNode(value));
            TreeNode current = map.get(value);

            if (parent == -1) {
                root = current;
            } else {

                map.putIfAbsent(parent, new TreeNode(parent));
                TreeNode parentNode = map.get(parent);

                if (parentNode.left == null)
                    parentNode.left = current;
                else
                    parentNode.right = current;
            }
        }

        int p = sc.nextInt();
        int q = sc.nextInt();

        TreeNode ans = lca1(root, p, q);

        if (ans != null)
            System.out.println(ans.val);
        else
            System.out.println("Node Not Found");

        sc.close();
    }

    public static TreeNode lca1(TreeNode root, int p, int q) {

        if (root == null)
            return null;

        if (root.val == p || root.val == q)
            return root;

        TreeNode left = lca1(root.left, p, q);
        TreeNode right = lca1(root.right, p, q);

        if (left != null && right != null)
            return root;

        if (left != null)
            return left;

        return right;
    }
}

class TreeNode {

    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}