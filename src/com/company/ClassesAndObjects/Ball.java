package com.company.ClassesAndObjects;

public class Ball {
    private String color;
    private int weight;

    Ball(String color, int weight){
        this.color=color;
        this.weight=weight;
    }

    public String getColor(){
        return color;
    }

    public int getWeight(){
        return weight;
    }

}
