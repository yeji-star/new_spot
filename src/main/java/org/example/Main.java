package org.example;

import java.util.ArrayList;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
//생성

        //타입설정 Int 객체만 가능
        ArrayList<Integer> members = new ArrayList<>();

        //초기 용량 지정 (Capacity가 용량이라는 뜻)
        ArrayList<Integer> num3 = new ArrayList<>(10);

        //배열을 넣어 생성

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3));

        //다른 컬렉션으로부터 그대로 요소를 받아서 생성
        //ArrayList를 인자로 받는 API를 사용하기 위해 Collection 타입 변환이필요할 떄 많이 사용
        ArrayList<Integer> list3 = new ArrayList<>(list2);
        //얘는 위에 있는 걸 가져왔네

        //추가
        ArrayList<String> list = new ArrayList<>(10);

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");


        list.size(); //크기(size)는 6

        ArrayList<String> list02 = new ArrayList<>();
        list02.add("E");
        list02.add("F");

        list02.addAll(list);

        System.out.println(list02);

        System.out.println("== 삭제 ==");

        ArrayList<String> list01 = new ArrayList<>(8);

        list01.add("1");
        list01.add("2");
        list01.add("3");
        list01.add("4");
        list01.add("5");

        list01.remove(2); // 2번째 자리의 요소 삭제

        System.out.println(list01);

        System.out.println("== 그냥 말끔히 삭제 ==");

        list01.clear();

        System.out.println(list01);

        System.out.println("== 얻기 ==");

        ArrayList<String> getlist = new ArrayList<>(18);

        getlist.add("1");
        getlist.add("2");
        getlist.add("3");
        getlist.add("4");
        getlist.add("5");

        getlist.get(2);
        getlist.get(4);

        System.out.println("== 범위를 get ==");

        ArrayList<String> Morelist = new ArrayList<>(18);

    }
}



