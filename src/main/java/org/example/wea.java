package org.example;

// 문제 : 아래가 실행되도록 해주세요.

class wea {
    public static void main(String[] args) {
        전사3 a전사 = new 전사3();

        String 이름 = "칸";
        a전사.이름 = 이름;
        a전사.나이 = 20;
        a전사.자기소개();

        a전사.나이++;
        a전사.자기소개();

        a전사.나이 = 30;
        a전사.이름 = "카니";
        a전사.자기소개();

        a전사.a무기 = new 활2();
        a전사.공격();
        // 출력 : 카니가 활로 공격합니다.

        a전사.a무기 = new 칼1();
        a전사.공격();
        // 출력 : 카니가 칼로 공격합니다.
    }
}

class 전사3 {
    String 이름;
    int 나이;
    무기 a무기;


    void 자기소개() {
        System.out.println("안녕하세요. 저는 " + this.나이 + "살 " + this.이름 + " 입니다.");
    }

    void 공격() {
        a무기.작동();

    }

}

class 무기 {
    void 작동() {

    }
}

class 활2 extends 무기 {
    void 작동() {
        System.out.println("카니가 칼로 공격합니다.");
    }
}

class 칼1 extends 무기 {
    void 작동() {
        System.out.println("카니가 활로 공격합니다.");
    }
}


