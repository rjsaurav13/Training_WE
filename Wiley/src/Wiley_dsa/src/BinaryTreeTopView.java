import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class TreeNodeOne {
    int val;
    TreeNodeOne left;
    TreeNodeOne right;

    TreeNodeOne(int val) {
        this.val = val;
    }
}

public class BinaryTreeTopView {
    public static void printTopView(TreeNodeOne root) {
        if (root == null)
            return;

        Map<Integer, Integer> map = new TreeMap<>();
        Queue<QueueNode> queue = new LinkedList<>();
        queue.add(new QueueNode(root, 0));

        while (!queue.isEmpty()) {
            QueueNode current = queue.poll();
            if (!map.containsKey(current.hd)) {
                map.put(current.hd, current.node.val);
            }

            if (current.node.left != null) {
                queue.add(new QueueNode(current.node.left, current.hd - 1));
            }

            if (current.node.right != null) {
                queue.add(new QueueNode(current.node.right, current.hd + 1));
            }
        }

        for (int val : map.values()) {
            System.out.print(val + " ");
        }
    }

    public static void main(String[] args) {
     
        TreeNodeOne root = new TreeNodeOne(1);
        root.left = new TreeNodeOne(2);
        root.right = new TreeNodeOne(3);
        root.left.right = new TreeNodeOne(4);
        root.right.right = new TreeNodeOne(5);
        root.left.right.right = new TreeNodeOne(6);

        System.out.println("Top view of the binary tree:");
        printTopView(root);
    } 
}

class QueueNode {
    TreeNodeOne node;
    int hd;

    QueueNode(TreeNodeOne node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}

