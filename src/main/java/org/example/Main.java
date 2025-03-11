package org.example;

import java.util.Scanner;

class Main {
    public static void main(String[] args) { //메인 메소드 (함수)

        car a = new car();
        a.달리다();
        a.서다();

        new car().달리다();
        new car().서다();

        car.달리다(); // 객체를 만들어내지 않아서 실행불가
        //car 안의 메소드에 static을 붙이면 해결되네?
        //static을 붙이면 객체화 없이 설계도 대로 출력하겠다
        car.서다();
        //static을 붙이지 않아서 불가능


    }
}

class car {
    //static : 객체화 하지 않고 쓰겠다, 설계도 차원에서 기능 뽑아서 쓰고싶어
    static void 달리다() {
        System.out.println("으로 달립니다.");
    }
    
    static void 서다() {
        System.out.println("섭니다.");
    }

}



