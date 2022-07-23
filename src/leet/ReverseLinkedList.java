package leet;

import java.util.List;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode node1 = createNode(List.of(1, 2, 3, 4, 5));
//        ListNode node2 = createNode(List.of(5, 7));
        ListNode listNode = reverseList(node1);

        while(listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public static ListNode reverseList(ListNode head) {
        // 1 2 3 4 5
        if (head == null) return null;
        ListNode res = new ListNode(head.val);

        while (head.next != null) {
            res = new ListNode(head.next.val, res);
            head = head.next;
        }
        return res;
    }

    public static ListNode createNode(List<Integer> list) {
        ListNode node = new ListNode(list.get(0));
        ListNode tempNode = node;
        for (int i = 1; i < list.size(); i++) {
            tempNode.next = new ListNode(list.get(i));
            tempNode = tempNode.next;
        }
        return node;
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
