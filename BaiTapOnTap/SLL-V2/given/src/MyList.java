
import java.util.*;
import java.io.*;

public class MyList {

    Node head, tail;
    int size;

    MyList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void clear() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    void ftraverse(RandomAccessFile f) throws Exception {
        Node p = head;
        while (p != null) {
            f.writeBytes(p.info + " "); // write data in the node p to the file f
            p = p.next;
        }

        f.writeBytes("\r\n");
    }

    void loadData(int k) {
        String[] a = Lib.readLineToStrArray("data.txt", k);
        int n = a.length;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(a[i]);
            addLast(number);
        }
    }

    void addLast(int n) {
        //------------------------------------------------------------------------------------
        //------ Start your code here---------------------------------------------------------

        if (head == null) {
            head = tail = new Node(n);
        } else {
            tail.next = new Node(n);
            tail = tail.next;
        }
        size++;

        //------ End your code here-----------------------------------------------------------
        //------------------------------------------------------------------------------------
    }

    // f1: ham nay se goi ham addLast nhieu lan
    void f1() throws Exception {
        clear();
        loadData(0);
        String fname = "f1.txt";
        File g123 = new File(fname);
        if (g123.exists()) {
            g123.delete();
        }
        RandomAccessFile f = new RandomAccessFile(fname, "rw");
        ftraverse(f);
        f.close();
    }

    void addFirst(int n) {
        Node newNode = new Node(n);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
        size++;
    }

    // f2: ham addFirst ==> du lieu nhap tu ban phim
    void f2() throws Exception {
        clear();
        loadData(0);
        String fname = "f2.txt";
        File g123 = new File(fname);
        if (g123.exists()) {
            g123.delete();
        }
        RandomAccessFile f = new RandomAccessFile(fname, "rw");
        //------------------------------------------------------------------------------------
        //------ Start your code here---------------------------------------------------------
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input n: ");
            int n = sc.nextInt();
            addFirst(n);
        } catch (Exception e) {
        }

        //------ End your code here-----------------------------------------------------------
        //------------------------------------------------------------------------------------
        ftraverse(f);
        f.close();
    }

    void addPos(int n, int k) {
        if (k == 0) {
            addFirst(n);
            return;
        }

        Node newNode = new Node(n);
        Node beforeK = head;
        for (int i = 0; i < k - 1; i++) {
            beforeK = beforeK.getNext();
        }
        // beforeK -> k -> q
        // beforeK -> x -> k -> q

        if (beforeK != null) {
            newNode.setNext(beforeK.getNext());
            beforeK.setNext(newNode);
            size++;
        }
    }

    // f3: ham addPos ==> them node vao vi tri thu k, trong do node moi va chi so k duoc nhap tu ban phim
    void f3() throws Exception {
        clear();
        loadData(0);
        String fname = "f3.txt";
        File g123 = new File(fname);
        if (g123.exists()) {
            g123.delete();
        }
        RandomAccessFile f = new RandomAccessFile(fname, "rw");

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
        ftraverse(f);
        f.close();
    }

    // f4: removeFirst
    void f4() throws Exception {
        clear();
        loadData(0);
        String fname = "f4.txt";
        File g123 = new File(fname);
        if (g123.exists()) {
            g123.delete();
        }
        RandomAccessFile f = new RandomAccessFile(fname, "rw");

        //------------------------------------------------------------------------------------
        //------ Start your code here---------------------------------------------------------
        if(!isEmpty()){
            head = head.getNext();
            if(head ==null){
               tail=null;
            }
            size--;
        }
        //------ End your code here-----------------------------------------------------------
        //------------------------------------------------------------------------------------
        ftraverse(f);
        f.close();
    }

    // f5: removeLast
    void f5() throws Exception {
        clear();
        loadData(0);
        String fname = "f5.txt";
        File g123 = new File(fname);
        if (g123.exists()) {
            g123.delete();
        }
        RandomAccessFile f = new RandomAccessFile(fname, "rw");
        //------------------------------------------------------------------------------------
        //------ Start your code here---------------------------------------------------------
        if (!isEmpty()) {
            if(head.getNext()==null){
                head =  null;
                tail=null;
            }else{
                Node beforeTail = head;
                // Tim ra node truoc node cuoi cung
                while (beforeTail.getNext().getNext() != null) {
                    beforeTail = beforeTail.getNext();
                }
                beforeTail.setNext(null);
                tail = beforeTail;
                // p -> q -> r -> null
            }
        }
        //------ End your code here-----------------------------------------------------------
        //------------------------------------------------------------------------------------
        ftraverse(f);
        f.close();
    }

}
