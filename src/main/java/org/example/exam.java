package org.example;
// 문제 : 아래와 같이 출력 되도록 해주세요.

public class exam {
    public static void main(String[] args) {
        boolean a = Math4.oddNumber(2);
        System.out.println(a);

        a = Math4.oddNumber(3);
        System.out.println(a);

        a = Math4.oddNumber(5);
        System.out.println(a);
    }
}

class Math4 {
    static boolean oddNumber(int a) {
        /*if (a % 2 == 0) {
            return true;
        }
        return false; */

        /* while (a % 2 == 0) {
            return true;
        }

        return false; */
        
        return a % 2 == 0;
    }
}





