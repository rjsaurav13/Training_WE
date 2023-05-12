

import java.util.*;
import java.util.*;

class TreeNodeTwo {
    int val;
    TreeNodeTwo left;
    TreeNodeTwo right;

    TreeNodeTwo(int val) {
        this.val = val;
    }
}

class QueueNodeOne {
    TreeNodeTwo node;
    int hd;

    QueueNodeOne(TreeNodeTwo node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}

public class BinaryTreeBottomView {
    public static void printBottomView(TreeNodeTwo root) {
        if (root == null)
            return;

        Map<Integer, Integer> map = new TreeMap<>();
        Queue<QueueNodeOne> queue = new LinkedList<>();
        queue.add(new QueueNodeOne(root, 0));

        while (!queue.isEmpty()) {
            QueueNodeOne current = queue.poll();
            map.put(current.hd, current.node.val);

            if (current.node.left != null) {
                queue.add(new QueueNodeOne(current.node.left, current.hd - 1));
            }

            if (current.node.right != null) {
                queue.add(new QueueNodeOne(current.node.right, current.hd + 1));
            }
        }

        for (int val : map.values()) {
            System.out.print(val + " ");
        }
    }

    public static void main(String[] args) {
      
        TreeNodeTwo root = new TreeNodeTwo(1);
        root.left = new TreeNodeTwo(2);
        root.right = new TreeNodeTwo(3);
        root.left.left = new TreeNodeTwo(4);
        root.left.right = new TreeNodeTwo(5);
        root.right.right = new TreeNodeTwo(6);
        root.left.right.right = new TreeNodeTwo(7);

        System.out.println("Bottom view of the binary tree:");
        printBottomView(root);
    }
}

