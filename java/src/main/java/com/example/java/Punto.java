package com.example.java;

public class Punto {
    private double x;
    public double y;


    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punto{}";
    }

    public double distancia(Punto i){
        double res = Math.sqrt((Math.pow(i.x,2)) + Math.pow(i.y,2));
        return res;
    }
}
