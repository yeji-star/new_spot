package org.example;

import java.util.Scanner;
//name, inMarried 또한 this를 활용해서 객체 내부의 데이터를 introduce가 쓸 수 있도록
class Main {
    public static void main(String[] args) { //메인 메소드 (함수)

       사람 a = new 사람();
       a.name = "김철수";
       a.age = 23;
       a.inMarried = false;
       a.introduce();

       사람 b = new 사람();
       b.name = "최영희";
       b.age = 26;
       b.inMarried = true;
       b.introduce();

    }
}

class 사람 { // 설계도 (필드)
    String name;
    int age;
    boolean inMarried;

    void introduce() {
        String name = this.name;
        int age = this.age;
        boolean inMarried = this.inMarried;

        System.out.println("==자기소개==");
        System.out.printf("이름 : %s\n", name);
        System.out.printf("나이 : %d\n", age);
        System.out.printf("결혼여부 : %b", inMarried);
        System.out.println("");
    }


}



