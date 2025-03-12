package org.example;

// 문제 : 아래와 같이 출력되도록 해주세요.
// 조건 : `숨쉬다` 기능을 중복하지 말아주세요.

class Main3 {
    public static void main(String[] args) {

        무기2 a무기 = new 칼2();

        a무기.공격();
        a무기.방어();


    }
}

interface 무기2 {
    void 공격();

    void 방어();
}

interface 무기3 {
    void 공격();

    void 방어();
}



class 칼2 implements 무기2, 무기3 {
    public void 공격() {
        System.out.println("칼 공격");  // 형변환 하는 과정에서 이것이 빠져버림
        //하지만 class 무기 안에도 넣는다면 빠지지 않음
    }

    public void 방어() {
        System.out.println("칼 방어");
    }

}






