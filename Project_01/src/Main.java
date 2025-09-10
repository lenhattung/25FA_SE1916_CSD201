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
        MyList list1 = new MyList();
        list1.add(new Student("00x", "Tung", 9.8));
        for (int i = 0; i < 100; i++) {
             list1.add(new Student("00"+i, "Nguyen Van "+i,i));
        }
        
        list1.treverse();
        
        // Hãy sáng tao MyList2 => chi chap nhan nhung ban sinh vien co 
        // gpa >=5.0
    }
}
