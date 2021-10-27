/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unilink.filehandling;

/**
 *
 * @author Marut
 */
public class WClass {
    public static void main(String[] args) {
       Double d = new Double("3.14159");
        byte b = d.byteValue();
        int i = d.intValue();
        String s = d.toString();
        double dob = d.doubleValue();
        
        System.out.println("Value of d after converting to int"+ i );
                
    }
}
