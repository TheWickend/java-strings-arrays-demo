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
        System.out.println("Здравствуйте!");
        // Test comment
        // Test comment 2
        
        // Alt + Enter for import
         Scanner sc = new Scanner(System.in);
        
        System.out.println("Выберите первое число: ");
        int x = sc.nextInt();
        System.out.println("Выберите второе число: ");
        int y = sc.nextInt();
        System.out.println("Выберите операцию: ");
        System.out.println("1 - Минус");
        System.out.println("2 - Плюс");
        System.out.println("3 - Умножение");
        System.out.println("4 - Деление");
        int action = sc.nextInt();
        if (action == 1) {
            System.out.println(x - y);
        } else if (action == 2) {
            System.out.println(x + y);
        } else if (action == 3) {
            System.out.println(x * y);
        } else if (action == 4) {
            System.out.println((double)x / (double)y);
        } else {
            System.out.println("Неверная операция!");
        }
        
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
        
        
        }
        
        /*for (int i : intArray) {
            System.out.println(i);
        }*/
        
       
    }
