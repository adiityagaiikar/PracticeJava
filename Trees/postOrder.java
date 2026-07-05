package Trees;
import java.util.*;

public class postOrder {
    public static void main(String []args){
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
                }else{
                    parentNode.right=current;
                }
            }
        }
        postorder(root);
        sc.close();
    }

    public static void postorder(TreeNode root){
        if(root==null){
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");

        return;
    }
}


class TreeNode{
    int val;
    TreeNode left,right;
    TreeNode(int val){
        this.val=val;
    }
}