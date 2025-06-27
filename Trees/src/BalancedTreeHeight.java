public class BalancedTreeHeight {
    public static void main(String args[])
    {
        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(5);
        root.right=new TreeNode(30);
        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(20);

        if(isBalanced(root)>0)
            System.out.print("Balanced");
        else
            System.out.print("Not Balanced");

    }

    public static int isBalanced(TreeNode root){
        if(root==null)
            return 0;
        int lh=isBalanced(root.left);
        if(lh==-1)return -1;
        int rh=isBalanced(root.right);
        if(rh==-1)return -1;

        if(Math.abs(lh-rh)>1)
            return -1;
        else
            return Math.max(lh,rh)+1;
    }

}
