class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    
    public TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        insertion(root, 6);
        insertion(root, 8);
        insertion(root, 4);
        insertion(root, 7);
        display(root);
    }

    public static TreeNode insertion(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }

        if (val > root.val) {
            root.right = insertion(root.right, val);
        } else {
            root.left = insertion(root.left, val);
        }

        return root;
    }

    public static void display(TreeNode root) {
        if (root != null) {
            display(root.left);
            display(root.right);
            System.out.print(root.val + " ");
        }
    }
}