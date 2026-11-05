class Solution {
    Node insertAtEnd(Node head, int x) {
        Node node = new Node(x);
        if (head == null) return node;
        Node current = head;
        while (current.next != null) current = current.next;
        current.next = node;
        return head;
    }
}
