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
        MyDoubleLinkedList list1 = new MyDoubleLinkedList();
        list1.addLast(new Student("00x", "Tung", 9.8));
        for (int i = 0; i < 10; i++) {
            list1.addLast(new Student("00" + i, "Nguyen Van " + i, i));
        }

        list1.traverse();
        System.out.println("=================");
        list1.traverseReverse();
        
        
        // test removeFirst()
        System.out.println("=================");
        list1.removeFirst();
        list1.traverse();
        System.out.println("=================");
        for (int i = 0; i < 5; i++) {
            list1.removeFirst();
        }
        list1.traverse();
        System.out.println("=================");
        list1.removeLast();
        list1.traverse();
        System.out.println("=================");
        list1.remove(4); // Xoa 009
        list1.traverse();

        System.out.println(list1.size());
        list1.remove(4); // Xoa 010
        System.out.println(list1.size());
    }
}
