package org.example;

// 문제 : 객체를 사용하지 않고 2번째 플레이어를 만들어주세요.

class exam2 {
    public static void main(String[] args) {
        플레이어 a플레이어1 = new 플레이어();
        a플레이어1.나이 = 20;
        a플레이어1.이름 = "홍길동";
        a플레이어1.직업 = "의적";

        int a플레이어2_나이 = 22;
        String a플레이어2_이름 = "김철수";
        String a플레이어2_직업 = "의사";

        System.out.println("이름 : " + a플레이어2_이름);
        System.out.println("나이 : " + a플레이어2_나이);
        System.out.println("직업 : " + a플레이어2_직업);

    }
}
class 플레이어 {
    int 나이;
    String 이름;
    String 직업;

    void intro() {
        System.out.printf("이름 : %s\n");
        System.out.printf("나이 : %d\n");
        System.out.printf("직업 : %s");
    }

}


