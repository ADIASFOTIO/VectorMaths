package org.maths;

import org.maths.model.entities.Matrix2;
import org.maths.model.entities.Vector2D;
import org.maths.model.entities.Vector3D;

public class Main {
    public static void main(String[] args) {
      Vector2D  X1 = new Vector2D(2,3);

      Vector3D X2 = new Vector3D(1,1,1);
      Vector3D X3 = X2.alMultiplication(4);
      String s = X3.toString();
      System.out.println(s);
      Matrix2 M1 = new Matrix2(1,1,1,1);
      double detM1   =  M1.det();
      System.out.println(detM1);




    }
}