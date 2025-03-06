package org.example;
/*  */

import java.util.Scanner;

import static java.lang.Integer.parseInt;

class Main3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();

        if (i < 0) {
            System.out.println("minus");
        } else {
            System.out.println("plus");
        } if ( i % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }



    }
}