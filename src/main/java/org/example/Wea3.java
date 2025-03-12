package org.example;

// 문제 : 매개변수를 사용해서 전사가 매번 다르게 공격하도록 해주세요.

class Wea3 {
    public static void main(String[] args) {
        전사1 a전사 = new 전사1();

        a전사.공격1(/* 수정가능지역 시작 */ "브라이언", "칼" /* 수정가능지역 끝 */);
        // 브라이언이(가) 칼(으)로 공격합니다.

        a전사.재공격();
        // 브라이언이(가) 칼(으)로 공격합니다.

        a전사.공격1(/* 수정가능지역 시작 */ "필립", "창" /* 수정가능지역 끝 */);
        // 필립이(가) 창(으)로 공격합니다.

        a전사.공격1(/* 수정가능지역 시작 */  "마크", "지팡이"/* 수정가능지역 끝 */);
        // 마크(가) 지팡이(으)로 공격합니다.

        a전사.재공격();
        // 마크(가) 지팡이(으)로 공격합니다.

        a전사.재공격();
        // 마크(가) 지팡이(으)로 공격합니다.
    }
}

class 전사1 {
    String 이름;
    String 무기;

    void 공격1(String 이름, String 무기) {
        this.이름 = 이름;
        this.무기 = 무기;

        재공격();
    }
    void 재공격() {
        System.out.println(이름 + "(가) " + 무기 + "(으)로 공격합니다.");
    }


    /*void 공격1(String 이름, String 무기) {
        System.out.println(이름 + "이(가) " + 무기 + "(으)로 공격합니다.");

    }

    void 재공격() {

        System.out.println(이름 + "이(가) " + 무기 + "(으)로 공격합니다.");
    }*/


}



