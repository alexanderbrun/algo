package leet;

import java.util.LinkedList;
import java.util.List;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode node1 = createNode(List.of(-9, 3));
        ListNode node2 = createNode(List.of(5, 7));
        ListNode listNode = mergeTwoLists2(node1, node2);

        while(listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public static ListNode mergeTwoLists2(ListNode list1, ListNode list2) {

        if (list1 == null && list2 == null) return null;

        ListNode head = new ListNode();
        ListNode tempNode = head;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tempNode.next = list1;
                list1 = list1.next;
            } else {
                tempNode.next = list2;
                list2 = list2.next;
            }
            tempNode = tempNode.next;
        }

        if (list1 == null) {
            tempNode.next = list2;
        }
        if (list2 == null) {
            tempNode.next = list1;
        }

        return head.next;
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
