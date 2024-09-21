import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Node {
    int value;
    Node left, right;

    Node(int value) {
        this.value = value;
        left = right = null;
    }
}


public class BinaryTree {
    Node root;

    public void addNode(Node current, int value) {
        if (value < current.value) {
            if (current.left == null) {
                current.left = new Node(value);
                System.out.println("Added " + value + " to the left of " + current.value);
            } else {
                addNode(current.left, value);
            }
        } else {
            if (current.right == null) {
                current.right = new Node(value);
                System.out.println("Added " + value + " to the right of " + current.value);
            } else {
                addNode(current.right, value);
            }
        }
    }

    public void BFS(Node root) {
        if (root == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.value + " ");
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
    }

    public void DFS(Node root) {
        if (root == null) return;
        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node current = stack.pop();
            System.out.print(current.value + " ");
            if (current.right != null) stack.push(current.right); // Right first for correct order
            if (current.left != null) stack.push(current.left);
        }
    }
}