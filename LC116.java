import java.util.LinkedList;
import java.util.Queue;

public class LC116 {
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        Queue<Node> queue = new LinkedList<Node>();
        Queue<Node> queue1 = new LinkedList<Node>();
        queue.add(root);
        while (queue.size()!= 0){

            Node res = queue.poll();

            res.next = queue.peek();
            if (res.left != null) {
                queue1.add(res.left);
            }
            if (res.right != null) {
                queue1.add(res.right);
            }
            if (queue.size() == 0){
                for (Node node : queue1) {
                    queue.add(node);
                }
                queue1.clear();
            }

        }
        return root;


    }
    public Node connect1(Node root) {
        if (root == null) {
            return root;
        }
        Queue<Node> queue = new LinkedList<Node>();

        queue.add(root);
        while (queue.size()!= 0){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node res = queue.poll();
                if (i < size - 1) {
                    res.next = queue.peek();
                }
                if (res.left != null) {
                    queue.add(res.left);
                }
                if (res.right != null) {
                    queue.add(res.right);
                }

            }

        }
        return root;
    }
}
