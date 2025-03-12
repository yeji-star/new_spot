package org.example;

class Main2 {
    public static void main(String[] args) {
        boolean result = Math5.isPrimeNumber(1);
        System.out.println("1은(는) 소수인가? : " + result);
        result = Math5.isPrimeNumber(2);
        System.out.println("2은(는) 소수인가? : " + result);
        result = Math5.isPrimeNumber(3);
        System.out.println("3은(는) 소수인가? : " + result);
        result = Math5.isPrimeNumber(4);
        System.out.println("4은(는) 소수인가? : " + result);
        /*int rs = Math.one_to_n_prime_numbers_count(10);
        System.out.println("rs : " + rs);
        // rs : 4
        rs = Math.one_to_n_prime_numbers_count(13);
         System.out.println("rs : " + rs);
        // rs :  6 */
    }
}

class Math5 {
    static boolean isPrimeNumber(int a) {
        if (a == 1) {
            return false;
        }

        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }

        return true;
    }
}