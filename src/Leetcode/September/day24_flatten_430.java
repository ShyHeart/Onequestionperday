package Leetcode.September;

/**
 * @作者 Heart
 * @时间 2021/9/24 8:38
 */
//https://leetcode-cn.com/problems/flatten-a-multilevel-doubly-linked-list/

public class day24_flatten_430 {
    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;

        public Node(int i) {
            this.val = i;
        }
    }

    public Node flatten(Node head) {
        Node dummy = new Node(0);
        dummy.next = head;
        while (head != null) {
            if (head.child == null) {
                head = head.next;
            } else {
                Node tmp = head.next;
                Node chead = flatten(head.child);
                head.next = chead;
                chead.prev = head;
                head.child = null;
                while (head.next != null) head = head.next;
                head.next = tmp;
                if (tmp != null) tmp.prev = head;
                head = tmp;
            }
        }
        return dummy.next;
    }

}
