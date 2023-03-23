package org.maths.model.entities;

public class Vector3D {
    private double x;
    private double y;
    private double z;
    public Vector3D(){
    }

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
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

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    public double norm(){
        return Math.sqrt((x*x)+(y*y)+(z*z));
    }
    public double sumCoordinate(){
        return (x+y+z);
    }
    public double sustraCoordinate(){
        return (x-y-z);
    }


}
