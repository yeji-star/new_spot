package org.example;

class Main {
    public static void main(String[] args) {
        사람 a사람1 = new 사람("김철수", 22);
        사람 a사람2 = new 사람("철영희", 26);

        System.out.println(a사람1);
        System.out.printf("이름 : %s , 나이 : %d\n", a사람1.name, a사람1.age);
        System.out.println(a사람2);
        System.out.printf("이름 : %s , 나이 : %d", a사람2.name, a사람2.age);
    }
}

class 사람 extends Object {
    String name;
    int age;

    @Override //주석이랑 다를 바가 없음
    public String toString() {
        return "사람[이름 = " + name + ", 나이 = " + age +"]";
    }

    사람(String name, int age) {
        this.name = name;
        this.age = age;
    }
}