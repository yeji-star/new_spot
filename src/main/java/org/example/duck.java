package org.example;

// 문제 : 아래가 실행되도록 해주세요.

class duck {
    public static void main(String[] args) {
        사람01 a사람 = new 사람01();

        a사람.나이 = 20;
        a사람.a왼팔 = new 팔().a왼팔;
    }
}

class 사람01 {
    // 클래스안에 변수를 정의 할 수 있다.
    int 나이;
      String a왼팔;

}

class 팔 extends 사람01 {
    String a왼팔;
}