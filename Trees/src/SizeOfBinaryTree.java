public class SizeOfBinaryTree {
    public static void main(String args[])
    {
        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(20);
        root.right=new TreeNode(30);
        root.left.left=new TreeNode(40);
        root.left.right=new TreeNode(50);
        root.right.right=new TreeNode(60);

        System.out.print(getSize(root));
    }

    public static int getSize(TreeNode root){
        if(root==null)
            return 0;
        else
            return 1+getSize(root.left)+getSize(root.right);
    }

}
