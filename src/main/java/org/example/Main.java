package org.example;
/* 어떤 형식에 맞추어 시간이 입력될 때, 그대로 출력하는 연습을 해보자.

참고
scanf( ) 함수는 지정한 형식(format)에 따라 입력받는 함수이다.
따라서, 입력받고자 하는 형식으로 표현해주면 된다.

예시
scanf("%d:%d", &h, &m); //콜론(:) 기호를 기준으로 두 수가 각 변수에 저장된다. */

import java.util.Scanner;
import static java.lang.Integer.parseInt;

class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String year[] = s.next().split("\\.");
        int y = parseInt(year[0]);
        int m = parseInt(year[1]);
        int d = parseInt(year[2]);

        System.out.printf("%04d.%02d.%02d", y, m, d);


    }
}