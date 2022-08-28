package Day8;


import java.util.Stack;

public class MergTwoBinaryTrees {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
      if(root1==null) return root2;
      
        
        Stack<TreeNode[]>dq=new Stack<>();
        dq.push(new TreeNode[] {root1, root2});
        while (!dq.isEmpty()) {
            var t=dq.pop();
            if (t[0] == null || t[1] == null) {
                continue;
            }
            t[0].val += t[1].val;
            if (t[0].left == null) {
                t[0].left = t[1].left;
            } else {
                dq.push(new TreeNode[] {t[0].left, t[1].left});
            }
            if (t[0].right == null) {
                t[0].right = t[1].right;
            } else {
                dq.push(new TreeNode[] {t[0].right, t[1].right});
            }
        }
        
        return root1;
    
    }
}
