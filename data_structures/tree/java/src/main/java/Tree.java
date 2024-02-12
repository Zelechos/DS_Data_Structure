public class Tree {
    TreeNode initialNode;
    public Tree(TreeNode initialNode){
       this.initialNode = initialNode;
    }

    public void insert(int value){
       if(this.initialNode == null){
           this.initialNode = new TreeNode(value);
       }else{
           this.initialNode.insert(value);
       }
    }

    public void shootPreOrder(){
       this.preOrder(this.initialNode);
    }

    public void preOrder(TreeNode node){
       if(node == null){
          return;
       }else{
           System.out.println("PreOrder Current Node => " + node.getValue());
           preOrder(node.getTreeNodeLeft());
           preOrder(node.getTreeNodeRight());
       }
    }

    public void shootInOrder(){
        this.inOrder(this.initialNode);
    }

    public void inOrder(TreeNode node){
        if(node == null){
            return;
        }else{
            inOrder(node.getTreeNodeLeft());
            System.out.println("InOrder Current Node => " + node.getValue());
            inOrder(node.getTreeNodeRight());
        }
    }
}
