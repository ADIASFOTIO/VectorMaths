package org.maths.model.entities;

public class Matrix2 {
    private double a11;
    private double a12;
    private double a21;
    private double a22;
    public Matrix2(){}

    public Matrix2(double a11, double a12, double a21, double a22) {
        this.a11 = a11;
        this.a12 = a12;
        this.a21 = a21;
        this.a22 = a22;
    }

    public double getA11() {
        return a11;
    }

    public void setA11(double a11) {
        this.a11 = a11;
    }

    public double getA12() {
        return a12;
    }

    public void setA12(double a12) {
        this.a12 = a12;
    }

    public double getA21() {
        return a21;
    }

    public void setA21(double a21) {
        this.a21 = a21;
    }

    public double getA22() {
        return a22;
    }

    public void setA22(double a22) {
        this.a22 = a22;
    }

    @Override
    public String toString() {
        return "Matrix2{" +
                "a11=" + a11 +
                ", a12=" + a12 +
                ", a21=" + a21 +
                ", a22=" + a22 +
                '}';
    }
    public double det(){
        return (a11*a22 - (a21*a12));
    }
}
