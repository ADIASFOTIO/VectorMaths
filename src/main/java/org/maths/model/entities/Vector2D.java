package org.maths.model.entities;

public class Vector2D {
    private double x;
    private double y;
    public Vector2D(){

    }

    public Vector2D(double x, double y) {
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
    public double norm(){
        return Math.sqrt((x*x)+(y*y));
    }
    public double sumCoordinate(){
        return (x+y);
    }
    public double sustraCoordinate(){
        return (x-y);
    }

}
