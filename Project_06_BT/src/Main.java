/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungi
 */
public class Main {

    public static void main(String[] args) {
        Node a = new Node('A');
        Node b = new Node('B');
        Node c = new Node('C');
        Node d = new Node('D');
        Node e = new Node('E');
        Node f = new Node('F');
        Node g = new Node('G');
        Node h = new Node('H');
        Node i = new Node('I');

        f.left = b;
        f.right = g;
        b.left = a;
        b.right = d;
        d.left = c;
        d.right = e;
        g.right = i;
        i.left = h;

        BinaryTree b1 = new BinaryTree(f);
        System.out.print("\n Pre-order traversal: ");
        b1.preOrder();

        System.out.print("\n In-order traversal: ");
        b1.inOrder();

        System.out.print("\n Post-order traversal: ");
        b1.postOrder();

        System.out.print("\n Breadth-frist traversal: ");
        b1.breadth();
    }
}
