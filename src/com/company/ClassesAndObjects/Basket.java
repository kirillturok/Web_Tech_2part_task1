package com.company.ClassesAndObjects;

import java.util.ArrayList;

public class Basket {
    public ArrayList<Ball> balls;

    public Basket(){
        balls = new ArrayList<Ball>();
    }

    public void addBall(Ball ball) {
        balls.add(ball);
    }

    public int countBalls(String color){
        int count = 0;
        for (var ball : balls){
            if (ball.getColor() == color){
                count++;
            }
        }
        return count;
    }

    public int getAllWeight(){
        int sumWeight = 0;
        for (var ball : balls){
            sumWeight += ball.getWeight();
        }
        return sumWeight;
    }
}
