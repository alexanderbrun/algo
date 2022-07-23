package leet;

import java.util.ArrayList;
import java.util.List;

public class NaryTreePreorderTraversal {
    /*
// Definition for a Node.

*/

    public static void main(String[] args) {

    }



//    public List<Integer> preorder(Node root) {
//        ArrayList<Integer> res = new ArrayList<>();
//
//
//        foo(root);
//        if (children != null) {
//            for (Node temp : root.children) {
//                return foo(temp);
//            }
//        }
//        return root.val;
//    }

    private int foo(Node root) {
        List<Node> children = root.children;
        if (children != null) {
            for (Node temp : root.children) {
                return foo(temp);
            }
        }
        return root.val;
    }

    public static class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}


