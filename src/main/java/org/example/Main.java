package org.example;

// 문제 : 정수 i가 가지고 있는 10을 double 형 변수에 넣고 해당 변수의 값을 다시 i에 넣는 코드를 작성해주세요.

class Main {
    public static void main(String[] args) {
        사람_1 사람1 = new 김철수(); //생성자가 실행이 된 시점
        사람1.이름 = "김철수";
        System.out.println("=사람1 정보=");
        System.out.printf("이름 : %s\n", 사람1.이름);
        System.out.printf("나이 : %d\n", 사람1.나이);

        사람_1 사람2 = new 사람_1();
        사람2.이름 = "최영희";
        System.out.println("=사람2 정보=");
        System.out.printf("이름 : %s\n", 사람2.이름);
        System.out.printf("나이 : %d\n", 사람2.나이);
    }
}

class 사람_1 {
    String 이름;
    int 나이;
    
    사람_1() {
        System.out.println("사람 생성자 실행됨");
        this.나이 = 26; //new만 있으면 실행이 알아서 됨
        //공간
    }

}

class 김철수 extends 사람_1 {
    김철수() {
        System.out.println("김철수 생성자 실행됨");
        //부모의 생성자를 먼저 실행시키고 자식의 생성자를 실행함
    }
}