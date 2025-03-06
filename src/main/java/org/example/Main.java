package org.example;
/*  */

import java.util.Scanner;

import static java.lang.Integer.parseInt;

class Main {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);

        String str=s.nextLine();
        //변수 str에 입력받은 문자를 저장
        int len = str.length();
        // 변수 str의 안에 있는 문자열의 길이를 잼
        // length는 문자열의 길이를 알고 싶을 때

        for(int i=0;i<len;i++){ //저장된 내용을 하나하나씩 검사해서 실행하게 만들기
            System.out.printf("%d",i);
            System.out.printf("\'%s\'\n",str.charAt(i));
            //charAt : String으로 저장된 문자열 중에서 한 글자만 선택해 char타입으로 변환해줌
        }


    }
}