package org.example;


import java.util.InputMismatchException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = 0;

        while (true) {
            try {
                System.out.printf("숫자 : ");
                a = sc.nextInt();
                sc.nextLine(); // 버퍼를 지운다
                break;
            } catch (InputMismatchException e){
                System.out.println("숫자 틀림");
                sc.nextLine();
            }
        }


        System.out.println("입력된 숫자 : " + a);

        sc.close();

    }
}