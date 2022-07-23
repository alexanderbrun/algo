package leet;

import java.util.List;

public class MiddleOfTheLinkedList {
     public static void main(String[] args) {
        ListNode node1 = createNode(List.of(1, 2, 3, 4, 5));
//        ListNode node2 = createNode(List.of(5, 7));
        ListNode listNode = findTheMiddle(node1);

        while(listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public static ListNode findTheMiddle(ListNode head) {
        ListNode temp = head;
        int counter = 0;
        while (temp.next != null) {
            temp = temp.next;
            counter++;
        }

        for (int i = 1; i <= counter/2.0 + 0.5; i++) {
            head = head.next;
        }

        return head;
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
