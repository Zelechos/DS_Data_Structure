public class Main {
    public static void main(String[] args) {
        int value = 99;
        TreeNode node = new TreeNode(value);
        Tree tree = new Tree(node);
        tree.insert(56);
        tree.insert(14);
        tree.insert(106);
        tree.insert(36);
        tree.insert(27);
        System.out.println("===============Depth tour-first===========");
        System.out.println("=============PreOrder=============");
        tree.shootPreOrder();
        System.out.println("=============InOrder=============");
        tree.shootInOrder();
    }
}
