package com.follower.leetcode;

import java.util.*;

/**
 * Created by lin on 19-5-28.
 */
public class CloneGraph_0133 {

    class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {}

        public Node(int _val, List<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    };


    public Node cloneGraph(Node node) {
        Map<Integer, Node> map = new HashMap<>();
        return recurseHelper(node, map);
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
        res.neighbors = new ArrayList<>();
        map.put(res.val, res);

        for (Node neighbor: node.neighbors) {
            res.neighbors.add(recurseHelper(neighbor, map));
        }

        return res;
    }
}
