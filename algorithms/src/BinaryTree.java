import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
    int node;
    BinaryTree left;
    BinaryTree right;

    public void printTree() {
        if (this.left != null) {
            this.left.printTree();
        }
        System.out.print(this.node + " ");
        if (this.right != null) {
            this.right.printTree();
        }
    }

    public BinaryTree addNode(BinaryTree tree, int data) {
        if (tree == null) {
            tree = new BinaryTree();
            tree.node = data;
            return tree;
        }

        if (data < tree.node) {
            tree.left = addNode(tree.left, data);
        } else {
            tree.right = addNode(tree.right, data);
        }
        return tree;
    }

    public void BFS(BinaryTree tree) {
        if(tree == null) {
            return;
        }
        Queue<BinaryTree> queue = new LinkedList<>();
        queue.add(tree);

        while(!queue.isEmpty()) {
            BinaryTree current = queue.poll();
            System.out.print(current.node + " ");
            if(current.left != null) {
                queue.add(current.left);
            }
            if(current.right != null) {
                queue.add(current.right);
            }
        }

    }

    public void DFS(BinaryTree tree) {
        if(tree == null) {
            return;
        }
        Stack<BinaryTree> stack = new Stack<>();
        stack.push(tree);

        while(!stack.isEmpty()) {
            BinaryTree current = stack.pop();
            System.out.print(current.node + " ");
            if(current.left != null) {
                stack.push(current.left);
            }
            if(current.right != null) {
                stack.push(current.right);
            }
        }
    }
}
