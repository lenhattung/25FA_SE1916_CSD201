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

    public MyList() {
        this.head = null;
        this.tail = null;
    }
    
    public boolean isEmpty(){
//        if (head==null && tail==null){
//            return true;
//        }else{
//            return false;
//        }

        return head==null && tail==null;
    }
    
    public void add(Student st){
        Node newNode = new Node(st, null);
        if(isEmpty()){
            // X _ _ _ _ _
            this.head = newNode;
            this.tail = newNode;
        }else{
             this.tail.next = newNode;
             this.tail = newNode;
             // X-> _ _ _ _ _
             // this.tail = X
             // X-> Y _ _ _ _ 
             // this.tail = Y
        }
    }
    
    public void treverse(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.getInfo());
            temp = temp.next;
        }
    }
}
