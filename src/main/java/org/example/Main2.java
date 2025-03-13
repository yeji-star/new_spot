package org.example;

// 문제 : 아래가 실행되도록 해주세요.
//전사가 가지고 있는 변수 a무기가 칼과 활에 모두 호환되게 해주세요.
class Main2 {
    public static void main(String[] args) {
        전사2 a전사 = new 전사2();

        a전사.나이 = 20;
        a전사.a무기 = new 활1();
        a전사.a무기 = new 칼6();
    }
}

class 전사2 {
    int 나이;
    무기11 a무기;

}

class 무기11 {

}

class 칼6 extends 무기11{

}

class 활1 extends 무기11{

}

//정답을 봐버림

