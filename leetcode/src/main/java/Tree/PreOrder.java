package Tree;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrder {

      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
         TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }

    class Solution {

        public List<Integer> preorderTraversal(TreeNode root) {
            ArrayList<Integer> list=new ArrayList<>();
            visit(root,list);
            return list;
        }
        //递归
        public void visit(TreeNode root,List<Integer> list){
            if(root==null){

            }else{
                list.add(root.val);
                visit(root.left,list);
                visit(root.right,list);
            }
        }
        //非递归
        public List<Integer> preorderTraversal2(TreeNode root) {
            ArrayList<Integer> list=new ArrayList<>();
            Stack<TreeNode> stack=new Stack<>();
            TreeNode p=root;
            while(!stack.isEmpty()||p!=null){
                if(p!=null){
                    list.add(p.val);
                    stack.push(p);
                    p=p.left;
                }else{
                    p=stack.pop();
                    p=p.right;
                }
            }
            return list;
        }
    }

}