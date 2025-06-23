
public class MinDepthHeight {
    public static int minDepth(TreeNode root) {
        if (root == null) return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if(root.left == null) return minDepth(root.right) +1;
        if(root.right == null) return minDepth(root.left) +1;

        return left > right ? left + 1 : right + 1;

    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

System.out.println(minDepth(root));
    }
}
