/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myexception;

/**
 *
 * @author saichon.ja
 */
public class Lab3 {
    public static void main(String[] args) {
        try {
		int[] list = new int[10];
                // ArrayIndexOutOfBoundsException
		System.out.println("list[10] is " + list[10]);
	}
	catch (ArithmeticException ex) {
		System.out.println("ArithmeticException");
	}
        finally {
            System.out.println("statement4");
        }
        System.out.println("statement5");
    }
}
