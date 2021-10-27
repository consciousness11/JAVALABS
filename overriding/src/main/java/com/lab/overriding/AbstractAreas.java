/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.overriding;

/**
 *
 * @author Marut
 */
public class AbstractAreas {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10,10);
        Triangle t= new Triangle(9,5);
       // Figure f = new Figure(10,8);
       Figure fig;
       
       fig = r;
        System.out.println("Area is "+fig.area());
        
       fig = t;
        System.out.println("Area is "+fig.area());
    }
}
