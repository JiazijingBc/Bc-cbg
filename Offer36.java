public class Offer36 {
    Node1 head,pre;
    public Node1 treeToDoublyList(Node1 root) {
        dfs(root);




        return new Node1(1);
    }
    void dfs(Node1 root) {
        if(root == null) return;
        pre = root;
        dfs(root.left); // 左
        root.right = pre;
        System.out.println(root.val); // 根
        dfs(root.right); // 右
    }
}
