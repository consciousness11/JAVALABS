/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.overloadingpolymorphism;

/**
 *
 * @author Marut
 */
public class Main {
    public static void main(String[] args){
    Overload ov = new Overload();
    ov.test();
    ov.test(5);
    ov.test(8, 11);
    
    double d;
    d=ov.test(3.45);
    System.out.println("Double squared "+d);
    
    Overload a = new Overload(7);
    
   
 
    }
}
