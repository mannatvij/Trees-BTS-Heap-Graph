import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversal {
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        Traversal(root, list);
        return list;
    }
    private static void Traversal(TreeNode root, List<Integer> list) {
        if(root != null){
            list.add(root.key);
            Traversal(root.left, list);
            Traversal(root.right, list);
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println(preorderTraversal(root));
    }
}
