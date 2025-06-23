import java.util.ArrayList;
import java.util.List;

public class PostOrderTraversal {
    public static List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        Traversal(root, result);
        return result;
    }
    private static void Traversal(TreeNode root, List<Integer> result){
        if(root != null){
            Traversal(root.left, result);
            Traversal(root.right, result);
            result.add(root.key);
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println(postorderTraversal(root));
    }
}
