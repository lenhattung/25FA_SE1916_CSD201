/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungi
 */
public class MyQueue {
    private Node head, tail;
    private int count;

    public MyQueue() {
        head = tail = null;
        count = 0;
    }
    
    public boolean isEmpty(){
        return head==null && tail == null;
    }
    
    public int size(){
        return count;
    }
    
    public void clear(){
        head=tail=null;
        count=0;
    }
    
    public void enqueue(Student st){
        Node newNode = new Node(st, null);
        if (isEmpty()){
            head = tail = newNode;
        }else{
            tail.setNext(newNode);
            tail = newNode;
        }
        count++;
    }
    public Student dequeue(){
        if(isEmpty())
            return null;
        
        Student st = head.getInfo();
        
        head = head.getNext();
        if(head==null){
            tail = null;
        }
        
        count--;
        return st;
    }
    
    public Student front(){
        if(isEmpty())
            return null;
        
        Student st = head.getInfo();
        return st;
    }
    
}
