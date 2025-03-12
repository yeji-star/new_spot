package org.example;

// 문제 : 매개변수를 사용해서 전사가 매번 다르게 공격하도록 해주세요.

class wea2 {
    public static void main(String[] args) {
        전사 a전사 = new 전사();

        a전사.공격(/* 수정가능지역 시작 */ "브라이언", "칼"/* 수정가능지역 끝 */);
        // 브라이언이(가) 칼(으)로 공격합니다.

        a전사.공격(/* 수정가능지역 시작 */ "필립", "창" /* 수정가능지역 끝 */);
        // 필립이(가) 창(으)로 공격합니다.

        a전사.공격(/* 수정가능지역 시작 */ "마크", "지팡이" /* 수정가능지역 끝 */);
        // 마크(가) 지팡이(으)로 공격합니다.
        
        //해결이 어려웠다 싶다면 28강 다시 해보기
    }
}

class 전사 {
    void 공격(String 이름, String 무기) {
        System.out.println(이름 + "이(가) " + 무기 + "(으)로 공격합니다.");
    }
}

/* interface 브라이언 {
    void 공격(String a, String b);
}

interface 필립 {
    void 공격(String a, String b);
}

interface 마크 {
    void 공격(String a, String b);
}

class 전사 implements 브라이언, 필립, 마크 {
    public void 공격(String a, String b) {
        System.out.println(a + "이(가) " + b + "(으)로 공격합니다.");
    }

} */
