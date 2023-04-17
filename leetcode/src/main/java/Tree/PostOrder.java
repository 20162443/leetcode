package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrder {

    public List<Integer> postorderTraversal(TreeNode2 root) {
        List<Integer> list=new ArrayList<Integer>();
        Stack<TreeNode2> stack=new Stack<TreeNode2>();
        TreeNode2 p=root;
        TreeNode2 t=null;
        while(!stack.isEmpty()||p!=null){
            if(p!=null){
                stack.push(p);
                p=p.left;
            }else{
                p=stack.peek();

                if(p.right!=null&&t!=p.right){
                    p=p.right;
                    stack.push(p);
                    p=p.left;
                }else{
                    p=stack.pop();
                    list.add(p.val);
                    t=p;
                    p=null;
                }
            }
        }
        return list;

    }
}
class TreeNode2 {
    int val;
    TreeNode2 left;
    TreeNode2 right;
    TreeNode2() {}
    TreeNode2(int val) { this.val = val; }
    TreeNode2(int val, TreeNode2 left, TreeNode2 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
