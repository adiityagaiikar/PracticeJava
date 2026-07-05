package Trees;
import java.util.*;

public class maximumHeight {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<Integer,TreeNode> map=new HashMap<>();
        TreeNode root=null;

        for(int i=0;i<n;i++){
            int value=sc.nextInt();
            int parent=sc.nextInt();

            map.putIfAbsent(value,new TreeNode(value));
            TreeNode current=map.get(value);

            if(parent==-1){
                root=current;
            }else{
                map.putIfAbsent(parent,new TreeNode(parent));
                TreeNode parentNode=map.get(parent);

                if(parentNode.left==null){
                    parentNode.left=current;
                }else if(parentNode.right==null){
                    parentNode.right=current;
                }
            }
        }

        System.out.println(maxDepth(root));
        sc.close();
    }

    public static int maxDepth(TreeNode root){
        if(root==null){
            return 0;
        }

        int left=maxDepth(root.left);
        int right=maxDepth(root.right);

        return 1+Math.max(left,right);
    }
}

class TreeNode{
    int val;
    TreeNode left,right;
    TreeNode(int val){
        this.val=val;
    }
}