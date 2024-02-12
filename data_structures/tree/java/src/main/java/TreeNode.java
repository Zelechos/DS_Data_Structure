public class TreeNode {

    private int value;
    private TreeNode treeNodeLeft;
    private TreeNode treeNodeRight;

    public TreeNode(int value){
        this.value = value;
        this.treeNodeLeft = null;
        this.treeNodeRight= null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TreeNode getTreeNodeLeft() {
        return treeNodeLeft;
    }

    public TreeNode getTreeNodeRight() {
        return treeNodeRight;
    }

    // Insert values
    public void insert(int value){
        if(value > this.value){
            if(this.treeNodeRight ==  null){
                this.treeNodeRight = new TreeNode(value);
            }else{
                this.treeNodeRight.insert(value);
            }
        }
        if(value < this.value){
            if(this.treeNodeLeft == null){
                this.treeNodeLeft = new TreeNode(value);
            }else{
                this.treeNodeLeft.insert(value);
            }
        }
        showTree(this.value, this.treeNodeLeft, this.treeNodeRight);
    }

    public void showTree(int root, TreeNode nodeLeft, TreeNode nodeRight){
        System.out.println("==========================");
        System.out.println("Root node => " + root);
        if(nodeLeft == null){
            System.out.println("Left node => null");
        }else{
            System.out.println("Left node => " + nodeLeft.getValue());
        }

        if(nodeRight == null){
            System.out.println("Right node => null");
        }else{
            System.out.println("Right node => " + nodeRight.getValue());
        }
        System.out.println("==========================");
    }
}
