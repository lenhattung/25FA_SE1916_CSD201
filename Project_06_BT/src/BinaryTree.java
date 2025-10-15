/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungi
 */
public class BinaryTree {

    Node root;

    public BinaryTree(Node p) {
        root = p;
    }

    public void visit(Node p) {
        System.out.print(p.info + " ");
    }

    public 
    public void preOrder() {
        preOrder(root);
    }

    public void preOrder(Node p) {
        // p - left - right
        if (p == null) {
            return;
        }
        visit(p);
        preOrder(p.left);
        preOrder(p.right);
    }

    public void postOrder() {
        postOrder(root);
    }

    public void postOrder(Node p) {
        // left - right - p
        if (p == null) {
            return;
        }
        postOrder(p.left);
        postOrder(p.right);
        visit(p);
    }

    public void inOrder() {
        inOrder(root);
    }

    public void inOrder(Node p) {
        // left - p - right 
        if (p == null) {
            return;
        }
        inOrder(p.left);
        visit(p);
        inOrder(p.right);
    }

    void breadth() {
        if (root == null) {
            return;
        }
        MyQueue q = new MyQueue();
        q.enqueue(root);
        Node p;
        while (!q.isEmpty()) {
            p = (Node) q.dequeue();
            if (p.left != null) {
                q.enqueue(p.left);
            }
            if (p.right != null) {
                q.enqueue(p.right);
            }
            visit(p);
        }
    }

}
