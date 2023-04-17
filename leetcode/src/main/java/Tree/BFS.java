package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import Tree.PreOrder.TreeNode;

public class BFS {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<PreOrder.TreeNode> queue=new LinkedList<TreeNode>();
        List<List<Integer>> list=new ArrayList<>();
        TreeNode t=root;
        queue.add(t);
        TreeNode p=root;
        TreeNode c=null;
        List<Integer> list2=new ArrayList<>();
        //判断边界值
        if(root==null){
            return list;
        }
        while(!queue.isEmpty()){
            t=queue.poll();
            list2.add(t.val);
            if(t.left!=null){
                queue.add(t.left);
                c=t.left;
            }
            if(t.right!=null){
                queue.add(t.right);
                c=t.right;
            }
            if(t==p){
                list.add(list2);
                list2=new ArrayList<>();
                p=c;
            }
        }
        return list;
    }
}
