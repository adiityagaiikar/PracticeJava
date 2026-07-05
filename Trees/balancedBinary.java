
package Trees;
import java.util.*;

public class balancedBinary {
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

        System.out.println(height(root));
        
        sc.close();
    }

    public static int height(TreeNode root){
        if(root==null){
            return 0;
        }

        int left=height(root.left);
        if(left==-1){
            return -1;
        }

        int right=height(root.right);
        if(right==-1){
            return -1;
        }

        if(Math.abs(left-right)>1){
            return -1;
        }

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
