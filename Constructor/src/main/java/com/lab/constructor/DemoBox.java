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
public class DemoBox {
    public static void main(String[] args){
    Box box= new Box();
    box.volume();
    
    
    Box box1= new Box(4.5,6.9,3.2);
    box1.volume();
    }
}
