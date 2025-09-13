/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungi
 */
public class MyList2 {

    private Node head;
    private Node tail;

    public MyList2() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    public void add(Student st) {
        if (st != null && st.getGpa() >= 5) {
            Node newNode = new Node(st, null);
            if (isEmpty()) {
                this.head = newNode;
                this.tail = newNode;
            } else {
                this.tail.next = newNode;
                this.tail = newNode;
            }
        }
    }

    public void treverse() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getInfo());
            temp = temp.next;
        }
    }
}
