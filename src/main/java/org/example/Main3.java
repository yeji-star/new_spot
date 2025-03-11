package org.example;

class Main3 {
    public static void main(String[] args) {
        main();

        hi a = new hi();
        a.hello();

        new hi().hello(); // 급하게 부를 때 사용가능 

    }

    static void main() { //메인 클래스 안에 있기에 리모컨이 없어도 실행가능
        System.out.println("hi");
    }

}

class hi { // 메인 클래스에 없기에 리모콘이 필요
    void hello() { // 다른 클래스에 있는 다른 메소드
        System.out.println("haha");
    }
}

