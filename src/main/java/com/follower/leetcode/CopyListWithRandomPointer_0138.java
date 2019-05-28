package com.follower.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lin on 19-5-29.
 */
public class CopyListWithRandomPointer_0138 {

    class Node {
        public int val;
        public Node next;
        public Node random;

        public Node() {}

        public Node(int _val,Node _next,Node _random) {
            val = _val;
            next = _next;
            random = _random;
        }
    }

    public Node copyRandomList(Node head) {
        Map<Integer, Node> map = new HashMap<>();
        return recurseHelper(head, map);
    }

    public Node recurseHelper(Node node, Map<Integer, Node> map) {
        if (node == null) {
            return null;
        }
        if (map.containsKey(node.val)) {
            return map.get(node.val);
        }

        Node res = new Node();
        res.val = node.val;

        map.put(res.val, res);

        res.next = recurseHelper(node.next, map);
        res.random = recurseHelper(node.random, map);

        return res;
    }
}
