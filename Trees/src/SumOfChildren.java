public class SumOfChildren {
    public static boolean sumOfChildren(TreeNode root) {
        if (root == null) return true;
        if(root.left == null && root.right == null){
            return true;
        }
        int sum =0;
        if(root.left != null){
            sum += root.left.key;
        }
        if(root.right != null){
            sum += root.right.key;
        }
        return (sum ==root.key && sumOfChildren(root.left) && sumOfChildren(root.right));
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        System.out.println(sumOfChildren(root));
    }
}
