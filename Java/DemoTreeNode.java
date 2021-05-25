class DemoTreeNode {
       int val;
       DemoTreeNode left;
       DemoTreeNode right;

       DemoTreeNode() {
       }

       DemoTreeNode(int val) {
              this.val = val;
       }

       DemoTreeNode(int val, DemoTreeNode left, DemoTreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
       }
}