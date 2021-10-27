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
public class Test {
  public static void main(String[] args){
  Box b = new Box();
  b.setLength(6.8);
  b.setBreadth(5.8);
  b.setHeight(8.4);
  
  double vol;
  vol =   b.volume();
  System.out.println(vol);
  
  Box copyb = new Box(b);
 System.out.println(" Volume copyb"+copyb.volume()); 
  } 
  
  
}
