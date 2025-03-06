package org.example;
/*  */

import java.util.Scanner;

import static java.lang.Integer.parseInt;

class Main3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();

        if (i % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        if (j % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        if (k % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

    }
}