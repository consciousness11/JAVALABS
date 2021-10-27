/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.constructor;

/**
 *
 * @author Marut
 */
public class Box {
    double length;
    double breadth;
    double height;
    
    Box(){
    length=2.5;
    breadth=4.6;
    height=6.5;
    
    }
    Box(double length,double breadth,double height){
    this.length=length;
    this.breadth = breadth;
    this.height = height;
    
    }
    
    public void volume(){
    System.out.println("The volume is "+length*breadth*height);
    
    }
}
