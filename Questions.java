package com.company.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Questions {

    public static void main(String[] args) {
	// write your code here

        Questions obj = new Questions();
        Node root = new Node(11);
        root.left = new Node(99);
        root.left.left = new Node(77);
        root.left.left.left = new Node(55);
        root.left.left.left.left = new Node(33);
        root.rite = new Node(88);
        root.rite.rite = new Node(66);
        root.rite.rite.rite = new Node(44);
        root.rite.rite.rite.rite = new Node(22);

        List<Integer> ls = new ArrayList<>();

        obj.lonelyNodes(root, ls);

        System.out.println(ls);

    }

    Node lonelyNodes(Node root, List<Integer> ls){

        if(root != null) {
            if(root.left == null && root.rite == null){
                return root;
            }


            Node left = lonelyNodes(root.left, ls);
            Node right = lonelyNodes(root.rite, ls);

            if(left == null || right == null) {
                ls.add(left == null ? right.val : left.val);
            }

        }

        return root;
    }
}
