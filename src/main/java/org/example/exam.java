package org.example;

// 문제 : 자동차 설계도를 만들어주세요.

class exam {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.speed = 1;
        car1.bestSpeed = 150;

        Car car2 = new Car();
        car2.speed = 2;
        car2.bestSpeed = 160;



    }
}

class Car {
    double speed;
    int bestSpeed;
}

