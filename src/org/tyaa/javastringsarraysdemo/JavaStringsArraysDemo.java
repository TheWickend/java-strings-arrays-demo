/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.javastringsarraysdemo;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class JavaStringsArraysDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello Java!");
        // Test comment
        // Test comment 2
        
        // Alt + Enter for import
        /* Scanner sc = new Scanner(System.in);
        
        System.out.println("Input a number then press Enter: ");
        int x = sc.nextInt();
        System.out.println("Input the second number then press Enter: ");
        int y = sc.nextInt();
        System.out.println("Choose an option: ");
        System.out.println("1 - concatination");
        System.out.println("2 - plus");
        int action = sc.nextInt();
        if (action == 1) {
            System.out.println(String.valueOf(x) + String.valueOf(y));
        } else if (action == 2) {
            System.out.println(x + y);
        } else {
            System.out.println("Incorrect input data!");
        } */
        
        /* int x = 10;
        for (int i = 0; i < 10; i++) {
            // System.out.println(x++);
            // System.out.println(++x);
            x = x + 1;
            System.out.println(x);
        } */
        
        // double x = ((12d * 5d) / 11d) - 14d + 100d;
        // System.out.println(x);
        /*System.out.println("Input your name: ");
        Scanner sc = new Scanner(System.in);
        
        String s1 = new String("Hello");
        // s1 = "Java";
        s1 = sc.nextLine();
        
        String s2 = "Hi " + s1 + "!";
        System.out.println(s2);*/
        
        int[] intArray = new int[10];
        intArray[0] = 500;
        // System.out.println(intArray[0]);
        
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
        
        /*for (int i : intArray) {
            System.out.println(i);
        }*/
        
        //Тестовое изменение
    }
    
}
