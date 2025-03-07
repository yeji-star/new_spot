package org.example;
/*  */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double b = sc.nextDouble();

        if ( b>=50 && b<=60) {
            System.out.println("win");
        } else {
            System.out.println("lose");
        }


    }
}