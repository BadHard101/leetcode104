public class Main {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int temp1 = maxDepth(root.right);
        int temp2 = maxDepth(root.left);
        return Math.max(temp1, temp2) + 1;
    }

    public static void main(String[] args) {

    }
}