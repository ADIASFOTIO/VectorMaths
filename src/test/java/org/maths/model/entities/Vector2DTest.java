package org.maths.model.entities;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class Vector2DTest {
    private Vector2D X1;
    @BeforeEach
    void setUp(){
        X1 = new Vector2D(3,4);
    }
    @AfterEach
    void tearDown(){}

    @org.junit.jupiter.api.Test
    void norm() {
       double norm = X1.norm();
       assertEquals(5,norm);
       }


    @org.junit.jupiter.api.Test
    void sumCoordinate() {
    }

    @org.junit.jupiter.api.Test
    void sustraCoordinate() {
    }
}