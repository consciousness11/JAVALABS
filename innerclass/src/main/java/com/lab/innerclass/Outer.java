/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.innerclass;

/**
 *
 * @author Marut
 */
public class Outer {

    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {

        void display() {
            System.out.println("display: outer_x = " + outer_x);
        }
    }
}
