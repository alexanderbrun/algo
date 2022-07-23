package leet;

import java.util.*;
import java.util.stream.Collectors;

public class BinaryTreeLevelOrderTraversal {
    public static void main(String[] args) {

    }


    public static List<List<Integer>> levelOrder(TreeNode root) {
        LinkedList<List<Integer>> res = new LinkedList<>(); //результаты добавляем в конец очереди
        if (root == null) return res;

        ArrayList<TreeNode> parentList = new ArrayList<>(); //временный лист
        ArrayList<TreeNode> childrenList = new ArrayList<>(); // временный лист2 чтобы положить всех детей первого временного листа
        parentList.add(root);

        while (!parentList.isEmpty()) {
            // добавляем все числа из родительского листа в результат
            res.addLast(parentList.stream().map(n -> n.val).collect(Collectors.toList()));

            for (TreeNode node :
                    parentList) {
                TreeNode leftNode = node.left;
                TreeNode rightNode = node.right;

                boolean isLeft = leftNode != null;
                boolean isRight = rightNode != null;
                if (isLeft) childrenList.add(leftNode);
                if (isRight) childrenList.add(rightNode);
            }
            parentList = childrenList; //когда все дети записаны - они становятся родительским поколением
            childrenList = new ArrayList<>(); //для детского поколения новый лист
        }
        return res;
    }

    public static List<List<Integer>> levelOrder2(TreeNode root) {
        LinkedList<List<Integer>> res = new LinkedList<>();
        if (root == null) return res;

        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> levelList = new ArrayList<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.remove();
                levelList.add(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            res.add(levelList);
            levelList = new ArrayList<>();
        }
        return res;
    }

    public static class TreeNode {

        int val;

        TreeNode left;

        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }
}
