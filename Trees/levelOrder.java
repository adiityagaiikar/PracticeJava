package Trees;
import java.util.*;

public class levelOrder {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<Integer,TreeNode> map=new HashMap<>();
        TreeNode root=null;
        for(int i=0;i<n;i++){
            int value=sc.nextInt();
            int parent=sc.nextInt();

            map.putIfAbsent(value,new TreeNode(value));
            TreeNode current=new TreeNode(value);

            if(parent==-1){
                root=current;
            }else{
                map.putIfAbsent(parent,new TreeNode(parent));
                TreeNode parentNode=new TreeNode(parent);

                if(parentNode.left==null){
                    parentNode.left=current;
                }else{
                    parentNode.right=current;
                }
            }
        }

        levelorder(root);

        sc.close();
    }

    public static void levelorder(TreeNode root){
        if(root==null){
            return;
        }

        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            TreeNode current=q.poll();
            System.out.println(current.val+" ");

            if(current.left!=null){
                q.offer(current.left);
            }

            if(current.right!=null){
                q.offer(current.right);
            }
        }
    }
}


class TreeNode{
    int val;
    TreeNode left,right;
    TreeNode(int val){
        this.val=val;
    }
}