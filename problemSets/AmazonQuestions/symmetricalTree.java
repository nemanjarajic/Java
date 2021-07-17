package AmazonQuestions;

import java.util.Queue;

import javax.swing.tree.TreeNode;

public class symmetricalTree {
    static boolean helper(TreeNode l, TreeNode r){
        if(l == null && r == null) return true;
        if(l == null || r == null) return false;

        return (l.val == r.val) && helper(l.left,r.right) && helper(l.right,r.left);
    }

    //O(N) time visiting every node
    //O(N) Space
    static boolean isSymmetric(TreeNode root){
        if(root == null) return true;
        return helper(root.left, root.right);
    }

    //O(N) Time
    //O(N) Space
    static boolean is_sym_iterative(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(root);

        while(q.size() != 0){
            TreeNode t1 = q.poll();
            TreeNode t2 = q.poll();
            if(t1 == null && t2 == null) continue;
            if(t1 == null || t2 == null) return false;
            if(t1.val != t2.val) return false;
            q.add(t1.left);
            q.add(t2.right);
            q.add(t1.right);
            q.add(t2.left);
        }

        return true;
    }
}
