package org.example;
/*  */

import java.util.Scanner;

import static java.lang.Integer.parseInt;

class Main2 {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);

        int i = s.nextInt();

        //이 부분을 간단히 축약할 수 있을 것 같은데 나로썬 도저히 생각나지 않음...
        int b = (i/10000)*10000;
        int c = ((i-b)/1000)*1000;
        int d = ((i-b-c)/100)*100;
        int e = ((i-b-c-d)/10)*10;
        int f = (i-b-c-d-e);


        System.out.printf("[%d]\n[%d]\n[%d]\n[%d]\n[%d]",b, c,d,e,f);



    }
}