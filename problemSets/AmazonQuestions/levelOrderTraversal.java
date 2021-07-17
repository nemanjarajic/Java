package AmazonQuestions;
import java.util.*;

import javax.swing.tree.TreeNode;

public class levelOrderTraversal {
    

    static List<List<Integer>> level_order(TreeNode root){
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(q.size() != 0){
            int size = q.size();
            List<Integer> level = new LinkedList<>();
            for(int i = 0; i < size; i++){
                TreeNode temp = q.poll();
                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
                level.add(temp.val);
            }

            res.add(level);
        }

        return res;

    }
}
