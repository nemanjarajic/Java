package test;

public class test{
  
    //function to find maximum path sum in a binary tree
    public static int maxPathSum(Node root){
        if(root == null)    
            return 0;
        int leftSum = maxPathSum(root.left);
        int rightSum = maxPathSum(root.right);
        int max = Math.max(leftSum, rightSum) + root.data;
        return Math.max(max, leftSum + rightSum + root.data);
    }
    
    

    public static void main(String args[]){
        System.out.println("hello");
    }
}