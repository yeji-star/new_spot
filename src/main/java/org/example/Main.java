package org.example;

import java.util.Scanner;

class Main {
    public static void main(String[] args) { //메인 메소드 (함수)

        사람 a = new 사람();
        System.out.println(a.age);
        a.hello();
        a.introduct();
    }
}

class 사람 { // 필드
    int age = 22;
    String name = "김철수";
    boolean c;

    void introduct() {
        System.out.println("hi");
    }

    void hello() {//여기 안에 있는 걸 불러서 활용할 수 있다.
        //메소드는 개수 제한이 없다.
        System.out.println("안녕하세요");
    }
}



