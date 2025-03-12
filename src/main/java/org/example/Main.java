package org.example;

// 문제 : 아래와 같이 출력되도록 해주세요.
// 조건 : `숨쉬다` 기능을 중복하지 말아주세요.

class Main {
    public static void main(String[] args) {
        double d = 1;
        System.out.println(d);

        int i = (int) 1.0;
        System.out.println(i);

        무기 a무기 = new 칼();
        //a무기라는 변수는 나중에 무기 클래스로 만든 객체랑 연결할거임
        //(a무기 변수에는 무기 리모컨이 들어갈거임)
        //->무기 리모컨이기만 하면 ok

        // new 칼(); // 칼 인스턴스 생성 -> 칼 리모컨 생성

        a무기.공격();

        //리모콘 종류가 다르네?

        //칼을 조종하는 리모컨은 무기를 조종하는 리모컨이라고 볼 수 있음?

        //상속을 이용하면 칼 리모콘을 생성해도 가능

        //잘못 알려줫지만 칼은 무기라는 것을 알려주면 된다.

        //상속으로 만드는 과정에서 두 리모컨이 같게 되기에 -
        //칼 리모컨을 무기 리모컨처럼 바꿔서 칼 공격이 사라짐.
    }
}

abstract class 무기 {
     abstract void 공격(); // 빈껍데기 메소드를 하나 놔야 자식의 내용이 출력 가능
}

class 칼 extends 무기 {
    void 공격() {
        System.out.println("칼 공격");  // 형변환 하는 과정에서 이것이 빠져버림
        //하지만 class 무기 안에도 넣는다면 빠지지 않음
    }

}






