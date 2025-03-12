package org.example;

// 문제 : 아래가 실행되도록 해주세요.

class duck {
    public static void main(String[] args) {
        무기 a무기 = new 칼032();
        a무기.공격();
    }
}

class 무기 {
    void 공격() {

    }
}

class 칼032 extends 무기 {
    void 공격() {
        System.out.println("공격함");
    }

}
