package Tree;
import  Tree.PreOrder.TreeNode;
public class isBalanced {

    public boolean isBalanced(TreeNode root) {
        Res res=help(root);
        return res.isBalanced;

    }
    public Res help(TreeNode root){
        if(root==null){
            Res res=new Res(true,0);
            return res;
        }
        Res res1=help(root.left);
        Res res2=help(root.right);
        if(res1.isBalanced&&res2.isBalanced&&Math.abs(res2.height-res1.height)<2){
            int height=1+Math.max(res1.height,res2.height);
            return new Res(true,height);
        }else{
            int height=1+Math.max(res1.height,res2.height);
            return new Res(false,height);
        }
    }

     //不用定义返回值类型的方法
    class Solution {
        public boolean isBalanced(TreeNode root) {
            return recur(root) != -1;
        }

        private int recur(TreeNode root) {
            if (root == null) return 0;
            int left = recur(root.left);
            if(left == -1) return -1;
            int right = recur(root.right);
            if(right == -1) return -1;
            return Math.abs(left - right) < 2 ? Math.max(left, right) + 1 : -1;
        }
    }

}
class Res{
    boolean isBalanced;
    public int height;
    public Res(boolean isBalanced,int height){
        this.isBalanced=isBalanced;
        this.height=height;
    }
}
