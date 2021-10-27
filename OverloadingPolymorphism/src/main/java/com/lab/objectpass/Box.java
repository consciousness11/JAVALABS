/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.objectpass;

/**
 *
 * @author Marut
 */
public class Box {
    int length;
    int breadth;
    
    
    public void area(){
    System.out.println("Area" +length*breadth);
    } 
    
    public void show(Box b){
    b.length = 6;
    b.breadth=5;
    b.area();
    }
}
