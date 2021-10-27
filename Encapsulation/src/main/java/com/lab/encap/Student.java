/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.encap;

/**
 *
 * @author Marut
 */
public class Student {
   private int roll;
   private double marks;
   private  String name;
   private String address;
    
  public String getName(){
  return name;
  }
  
  public void setName(String name){
  this.name =name;
  }
   
    public void info(){
    System.out.println("Roll "+getRoll()+" Marks "+getMarks()+" Name "
            +name+" Address "+getAddress());
    
    }

    /**
     * @return the roll
     */
    public int getRoll() {
        return roll;
    }

    /**
     * @param roll the roll to set
     */
    public void setRoll(int roll) {
        this.roll = roll;
    }

    /**
     * @return the marks
     */
    public double getMarks() {
        return marks;
    }

    /**
     * @param marks the marks to set
     */
    public void setMarks(double marks) {
        this.marks = marks;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
}
