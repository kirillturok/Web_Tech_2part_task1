package com.company.ClassesAndObjects;

public class task9 {
    public static void main(String[] args) {
        Basket basket = new Basket();
        for (int i = 0; i < 5; i++) {
            int weight = (int)Math.round(Math.random()*100);
            Ball ball = new Ball("blue", weight);
            basket.addBall(ball);
        }

        basket.addBall(new Ball("yellow", 57));
        System.out.println(basket.countBalls("blue") + " голубых");
        System.out.println("Вес " + basket.getAllWeight());
    }
}
