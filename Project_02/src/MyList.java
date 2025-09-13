/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungi
 */
public class MyList {

    private Node head;
    private Node tail;
    private int count = 0;

    public MyList() {
        this.head = null;
        this.tail = null;
        this.count = 0;
    }

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    public void addLast(Student st) {
        Node newNode = new Node(st, null);
        if (isEmpty()) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
        count++;
    }

    public void addFirst(Student st) {
        Node newNode = new Node(st, null);
        if (isEmpty()) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        count++;
    }

    public void removeFirst() {
        if (this.isEmpty()) {
            return;
        }
        if (head != null) {
            head = head.next;
        }
        if (head == null) {
            tail = null;
        }
        count--;
    }

    public void removeLast() {
        if (this.isEmpty()) {
            return;
        }
        Node p = head;
        // Neu list chi co 1 phan tu
        if (p.next == null) {
            head = null;
            tail = null;
        } else {
            // Neu List co rat nhieu
            // 1. Tim ra phan tu ke cuoi
            while (p.next.next != null) {
                p = p.next;
            }
            // 2. Thu hien xoa
            p.next = null;
            tail = p;
        }
        count--;
    }

    public void remove(int v) {
        if (this.isEmpty()) {
            return;
        }
        if (v == 0) {
            removeFirst();
            return;
        }

        Node p = head;
        // 1. Tim ra node phia truoc
        for (int i = 0; i < v - 1; i++) {
            if (p != null) {
                p = p.next;
            }
        }
        // 2. Thuc hien xoa
        if (p != null) {
            p.next = p.next.next;
            if (p.next == null) {
                tail = p;
            }
        }
        count--;
    }

    public void treverse() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getInfo());
            temp = temp.next;
        }
    }

//    public int size(){
//        // Tra ve so phan tu trong list
//        int count = 0;
//        Node p = head;
//        while(p!=null){
//            count++;
//            p = p.next;
//        }
//        return count;
//    }
    public int size() {
        return count;
    }
    
    public void add(Student st, int position){
        // Thêm student tai vi tri position
    }
    
    public int countPass(){
        // Tra ve so luong sinh vien co gpa>=5
        return 0;
    }
    public int find(String studentId){
        // Muon biet vi tri cua ban sinh vien co studentId
        // Neu nhu khong tim thay: return -1;
        return -1;
    }
}
