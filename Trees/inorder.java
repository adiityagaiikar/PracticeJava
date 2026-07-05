package Trees;
import java.util.*;

public class inorder {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<Integer,TreeNode> map=new HashMap<>();
        TreeNode root=null;
        

        for(int i=0;i<n;i++){
            int value=sc.nextInt();
            int parent=sc.nextInt();

            map.putIfAbsent(value, new TreeNode(value));
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

        inorder1(root);
            sc.close();
    }

    public static TreeNode inorder1(TreeNode root){
        if(root==null){
            return root;
        }

        inorder1(root.left);
        System.out.print(root.val+" ");
        inorder1(root.right);

        return root;
    }
}

class TreeNode{
    int val;
    TreeNode left,right;
    TreeNode(int val){
        this.val=val;
    }
}
