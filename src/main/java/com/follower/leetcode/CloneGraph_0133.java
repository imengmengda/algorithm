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
        List<Node> list = new ArrayList<>();
        return recurseHelper(node, list);
    }

    public Node recurseHelper(Node node, List<Node> list) {
        if (node == null) {
            return null;
        }
        if (list.contains(node.val)) {
            return null;
        }

        Node res = new Node();
        res.val = node.val;
        res.neighbors = new ArrayList<>();
        list.add(res);

        for (Node neighbor: node.neighbors) {
            Node tempNeighbor = contains(neighbor.val, list);

            if (tempNeighbor == null) {
                res.neighbors.add(recurseHelper(neighbor, list));
            } else {
                res.neighbors.add(tempNeighbor);
            }
        }

        return res;
    }

    public Node contains(Integer val,List<Node> nodes) {
       return nodes.stream()
               .filter(node -> node.val == val)
               .findFirst()
               .orElse(null);
    }
}
