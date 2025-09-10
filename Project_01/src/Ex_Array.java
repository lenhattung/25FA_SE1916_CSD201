/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungi
 */
public class Ex_Array {
    public static void main(String[] args) {
        int a[] = new int[100];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        for (int value : a) {
            System.out.print(value +" ");
        }
        // Neu phat sinh them 1 gia tri thu 101 ?
        // Tao mang moi => copy du lieu
        // {0, 1, 2, 3, ..., 99}
        // Neu xoa 3 => don tu 4 -> 99 len phia truoc
    }
}
