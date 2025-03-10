package org.example;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        

        int[] aa = new int[3]; //-> 다양한 타입 x
        aa[0] = 11;
        aa[1] = 22;
        aa[2] = 33;
        //철수 0[0]=12; -> 데이터의 의미????

        IntArr intArr = new IntArr();
        intArr.eual = 11;
        intArr.age = 23;

        //사용자 정의 객체를 만들고 싶어 -> 위의 이유 때문에
        철수 a = new 철수();
        a.이름 = "김철수";
        a.나이 = 23;
        a.키 = 95.3;

    }
}

class IntArr {
    int eual;
    int age;
}

class 철수 {
    String 이름;
    int 나이;
    double 키;
}