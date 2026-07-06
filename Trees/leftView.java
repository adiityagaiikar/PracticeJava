package Trees;
import java.util.*;

public class leftView {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<Integer,TreeNode> map=new HashMap<>();
        TreeNode root=null;
        for(int i=0;i<n;i++){
            int parent=sc.nextInt();
            int value=sc.nextInt();
            

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
        leftView1(root);
        sc.close();
    }

    public static void leftView1(TreeNode root){
        if(root==null){
            return;
        }

        Queue<TreeNode>q=new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode current=q.poll();
                if(i==0){
                    System.out.println(current.val+" ");
                }

                if(current.left!=null){
                    q.offer(current.left);
                }

                if(current.right!=null){
                    q.offer(current.right);
                }
            }
        }
        return;
    }
}

class TreeNode{
    int val;
    TreeNode left,right;
    TreeNode (int val){
        this.val=val;
    }
}