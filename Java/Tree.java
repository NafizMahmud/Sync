class Tree {
    static TreeNode xParent = null;
    static TreeNode yParent = null;
    static int xDepth = -1, yDepth = -1;

    public static boolean isCousins(TreeNode root, int x, int y) {
        getDepthAndParent(root, x, y, 0, null);
        return xDepth == yDepth && xParent != yParent ? true : false;
    }

    // get both the depth and parent for x and y
    public static void getDepthAndParent(TreeNode root, int x, int y, int depth, TreeNode parent) {
        if (root == null) {
            return;
        }

        if (root.val == x) {
            xParent = parent;
            xDepth = depth;
        } else if (root.val == y) {
            yParent = parent;
            yDepth = depth;
        } else {
            getDepthAndParent(root.left, x, y, depth + 1, root);
            getDepthAndParent(root.right, x, y, depth + 1, root);
        }
    }


    public static void main(String[] args) {
        TreeNode treeleft = new TreeNode(2);
        TreeNode treeright = new TreeNode(3);
        TreeNode treemain = new TreeNode(3, treeleft, treeright);
        System.out.println("Hello, World." + treemain.toString());
        System.out.println(isCousins(treemain, 4,3));
    }
}
