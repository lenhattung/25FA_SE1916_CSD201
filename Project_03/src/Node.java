/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungi
 */
public class Node {
    Student info;
    Node next;
    Node prev;

    public Node() {
    }

    public Node(Student info, Node next) {
        this.info = info;
        this.next = next;
    }

    public Student getInfo() {
        return info;
    }

    public void setInfo(Student info) {
        this.info = info;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
    
}
