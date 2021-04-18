package Tree;
import Tree.PreOrder.TreeNode;
public class lowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null||root==p||root==q){
            return root;
        }
        TreeNode isleft=lowestCommonAncestor(root.left,p,q);
        TreeNode isright=lowestCommonAncestor(root.right,p,q);
        if(isleft==null){
            return isright;
        }
        if(isright==null){
            return isleft;
        }
        return root;
    }
}
