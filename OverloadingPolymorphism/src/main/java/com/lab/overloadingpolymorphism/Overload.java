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
public class Overload {

    
    Overload(){
    //Default 
    System.out.println("Default Constructor");
    }
    
   public   Overload( int x){
    //Constructor with parameter  
    System.out.println(" Constructor with parameter x "+x);
    }
    // method without parameters 
    public void test() {
        System.out.println("No parameters");
    }

     
    
    // method with a parameter as integer 
    public void test(int a) {
        System.out.println("integer a: " + a);
    }

    // method with two parameter 
    public void test(int a, int b) {
        System.out.println("int a and b: " + a + " " + b);
    }
    // method with double type parameter 
    public double test(double a) {
        System.out.println("double a: " + a);
        return a * a;
    }
    
//    public void test(int a,float b){}
//    public void test(float b,int a){}
}
