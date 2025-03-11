package org.example;
// 문제 : 아래와 같이 출력 되도록 해주세요.

class exam {
    public static void main(String[] args) {
        계산기.더한_결과를_화면에_출력(10, 20);

        계산기.더한_결과를_화면에_출력(30, 40);

        계산기.뺀_결과를_화면에_출력(30, 20);
    }
}

class 계산기 {
    static void 더한_결과를_화면에_출력(int a, int b) {
        System.out.println(a + b);
    }

    static void 뺀_결과를_화면에_출력(int a, int b) {
        System.out.println(a - b);
    }
}





