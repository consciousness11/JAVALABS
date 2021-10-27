/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unilink.characterexample;

/**
 *
 * @author Marut
 */
public class WClases {
    public static void main(String[] args) {
        Double d = new Double("3.14159"); //Boxing 
       d = 3.14159;//auto boxing
        double d1 = d.doubleValue(); // Unboxing
        d1 = d; // auto unboxing
        
        byte b = d.byteValue();
        short s = d.shortValue();
        int i= d.intValue();
        float f = d.floatValue();
        String str =d.toString();
        
        System.out.println(b+s+i+f+str);
        
    }
}
