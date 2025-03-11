package org.example;

// 문제 : 아래와 같이 출력 되도록 해주세요.

class Main2 {
    public static void main(String[] args) {
        int 결과1 = Math.nToMSum(2, 3);
        System.out.println("결과1 : " + 결과1);
        // 출력 : 결과1 : 5

        int 결과2 = Math.nToMSum(5, 10);
        System.out.println("결과2 : " + 결과2); 
        // 출력 : 결과2 : 45
    }
}

class Math {
    static int i;
    static int j;

    static int nToMSum(int a, int b) {
        j = 0;

        for (i = a; i <= b; i++) {
            j += i;

            System.out.println(j);
        }



        return j;
    }
}
