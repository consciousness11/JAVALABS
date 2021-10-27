/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unilink.wrapper;

/**
 *
 * @author Marut
 */
public class WClass {
    public static void main(String[] args) {
        Double d = new Double("3.14159");
       
        byte b=d.byteValue();
        short s = d.shortValue();
        int i = d.intValue();
        double d1=d.doubleValue();
        
        System.out.println(b+" "+s+" "+i+" "+d1);
        
    }
}
