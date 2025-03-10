package org.example;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {


        MyObject obj = new MyObject(); // MyObject 모양의 객체가 연결 될 떄
        obj.b = "안녕";
        System.out.println(obj.b);

        new MyObject().a = 10;
        System.out.println(new MyObject().a);
        
        //new가 3개라 객체는 일단 3개
    }
}

class MyObject {
    int a;
    String b;
    double c;
}



