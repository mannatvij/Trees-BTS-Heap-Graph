class TreeNode {
    int key;
    TreeNode left;
    TreeNode right;
    TreeNode(int k){
        key = k;
        left = right = null;
    }
}

public class BinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
    }
}
