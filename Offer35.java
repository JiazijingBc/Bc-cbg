public class Offer35 {
    public Node copyRandomList(Node head) {
        if(head==null) return head;
        Node newHead = new Node(head.val);
        Node a = newHead;
        Node node = head.next;
        while (node!=null){
            a.next = new Node(node.val);
            node=node.next;
            a = a.next;
        }




        return head;
    }
}
