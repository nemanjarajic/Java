package AmazonQuestions;

public class sameTree {
    
    //O(N) all nodes are visited 
    //O(log N) if balanced and O(N) worst case
    static boolean is_same(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null) return true;
        if(root1 == null || root2 == null) return false;

        return root1.val == root2.val && is_same(root1.left,root2.left) && is_same(root1.right,root2.right);
    }

    static boolean check(TreeNode p, TreeNode q){
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;

        return p.val == q.val;
    }

    //O(N) Time
    //O(logN)
    static boolean is_same_iterative(TreeNode root1, TreeNode root2){
        if(!check(root1,root2))return false;

        Queue<TreeNode> q = new LinkedList<>();
        Queue<TreeNode> p = new LinkedList<>();

        q.add(root1);
        p.add(root2);

        while(q.size() != 0){
            TreeNode t1 = q.poll();
            TreeNode t2 = p.poll();

            if(!check(t1,t2)) return false;
            if(t1 != null){
                if(!check(t1.left , t2.left)) return false;
                if(t1.left != null){
                    q.add(t1.left);
                    p.add(t2.left);
                }
                if(!check(t1.right , t2.right)) return false;
                if(t1.right != null){
                    q.add(t1.right);
                    p.add(t2.right);
                }
            }
        }

        return true;
    }
}
