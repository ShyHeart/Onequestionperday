package Leetcode.September;

import java.util.Stack;

/**
 * @作者 Heart
 * @时间 2021/9/2 8:36
 */


//https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/
public class day2_getKthFromEnd_offer22 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    //双指针
    public ListNode getKthFromEnd1(ListNode head, int k) {
        ListNode first = head;
        ListNode second = head;

        //第一个指针先走k步
        while (k-- > 0) {
            first = first.next;
        }
        //然后两个指针同时走
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        //当第一个指针到末尾的时候，返回第二个指针
        return second;
    }

    //栈
    public ListNode getKthFromEnd(ListNode head, int k) {
        Stack<ListNode> stack = new Stack<>();
        //链表节点压栈
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        //在出栈的时候，串成新的链表
        ListNode firstNode = stack.pop();
        while (--k > 0) {
            ListNode tmp = stack.pop();
            tmp.next = firstNode;
            firstNode = tmp;
        }
        return firstNode;
    }
}
