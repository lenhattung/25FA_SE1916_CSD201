
import java.util.*;
import java.io.*;

public class MyList {

    Node head;

    MyList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public void clear() {
        this.head = null;
    }

    void traverse() {
        Node p = head;
        while (p != null) {
            System.out.print(p.info);
            System.out.print("   ");
            p = p.next;
        }
    }

    void loadData(int k) {
        for (int i = 0; i < k; i++) {
            Random generator = new Random();
            int number = generator.nextInt(1000) + 1;
            addFirst(number);
        }
    }

    void addFirst(int n) {
        //------------------------------------------------------------------------------------
        //------ Start your code here---------------------------------------------------------
        Node newNode = new Node(n);
        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
        //------ End your code here-----------------------------------------------------------
        //------------------------------------------------------------------------------------
    }

    void addLast(int n) {
        //------------------------------------------------------------------------------------
        //------ Start your code here---------------------------------------------------------
        Node newNode = new Node(n);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node tail = head;
            // Tim ra node cuoi cung
            while (tail.getNext() != null) {
                tail = tail.getNext();
            }
            tail.setNext(newNode);
        }
        //------ End your code here-----------------------------------------------------------
        //------------------------------------------------------------------------------------
    }

    void f1() {
        System.out.print("Linked list:   ");
        this.traverse();
    }

    // f2: ham addLast ==> du lieu nhap tu ban phim
    void f2() {
        System.out.print("Before:   ");
        this.traverse();
        //------------------------------------------------------------------------------------
        //------ Start your code here---------------------------------------------------------
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input n: ");
            int n = sc.nextInt();
            addLast(n);
        } catch (Exception e) {
        }
        //------ End your code here-----------------------------------------------------------
        //------------------------------------------------------------------------------------
        System.out.print("After:    ");
        this.traverse();
    }

    void addPos(int n, int k) {
        Node newNode = new Node(n);

        if (k == 0) {
            addFirst(n);
            return;
        }

        Node beforeK = head;
        for (int i = 0; i < k - 1; i++) {
            beforeK = beforeK.getNext();
        }
        // beforeK -> k -> q
        // beforeK -> x -> k -> q

        if (beforeK != null) {
            newNode.setNext(beforeK.getNext());
            beforeK.setNext(newNode);
        }
    }

    // f3: ham addPos ==> them node vao vi tri thu k, trong do node moi va chi so k duoc nhap tu ban phim
    void f3() {
        System.out.print("Before:   ");
        this.traverse();
        //------------------------------------------------------------------------------------
        //------ Start your code here---------------------------------------------------------
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input n: ");
            int n = sc.nextInt();
            System.out.println("Input k: ");
            int k = sc.nextInt();
            addPos(n, k);
        } catch (Exception e) {
        }
        //------ End your code here-----------------------------------------------------------
        //------------------------------------------------------------------------------------
        System.out.print("After:    ");
        this.traverse();
    }

    // f4: removeFirst
    void f4() {
        System.out.print("Before:   ");
        this.traverse();
        //------------------------------------------------------------------------------------
        //------ Start your code here---------------------------------------------------------
        if (!isEmpty()) {
            head = head.getNext();
        }
        //------ End your code here-----------------------------------------------------------
        //------------------------------------------------------------------------------------
        System.out.print("After:    ");
        this.traverse();
    }

    // f5: removeLast
    void f5() throws Exception {
        System.out.print("Before:   ");
        this.traverse();
        //------------------------------------------------------------------------------------
        //------ Start your code here---------------------------------------------------------
        if (!isEmpty()) {
            if(head.getNext()==null){
                head =  null;
            }else{
                Node beforeTail = head;
                // Tim ra node truoc node cuoi cung
                while (beforeTail.getNext().getNext() != null) {
                    beforeTail = beforeTail.getNext();
                }
                beforeTail.setNext(null);
                // p -> q -> r -> null
            }
        }
        //------ End your code here-----------------------------------------------------------
        //------------------------------------------------------------------------------------
        System.out.print("After:    ");
        this.traverse();
    }
}
