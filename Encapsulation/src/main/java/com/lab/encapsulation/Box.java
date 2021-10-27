/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.encapsulation;

/**
 *
 * @author Marut
 */
public class Box {
    private double length;
    private double breadth;
    private double height;
    Box(){}
    Box(Box b){
    this.length = b.length;
    this.breadth = b.breadth;
     this.height = b.height;       
    }
    
    public void setLength(double length){
    
        this.length = length;
    
    }
    public double getLength(){
    return length;
    
    }

    /**
     * @return the breadth
     */
    public double getBreadth() {
        return breadth;
    }

    /**
     * @param breadth the breadth to set
     */
    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }
    
    public double volume(){
    
        return length*breadth*height;
    
    }
}
