import java.util.LinkedList;
import java.util.Queue;

public class LC117 {
    public Node connect(Node root) {
        if (root==null)return null;
        LinkedList<Node> queue  = new LinkedList<>();
        queue.addLast(root);


        return root;
    }
    public void helper(LinkedList<Node> stack){
        if (stack.size()==0)return;
        LinkedList<Node> res = new LinkedList<>();
        while (stack.size()!=0){
            Node root = stack.pollFirst();
            if (root.left != null){
                res.addLast(root.left);
            }
            if (root.right != null){
                res.addLast(root.right);
            }
            if (stack.size()==0){
                root.next = null;
                break;
            }
            root.next = stack.getFirst();
        }
        helper(res);
    }
}
