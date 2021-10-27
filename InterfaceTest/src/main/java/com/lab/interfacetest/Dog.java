/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.interfacetest;

/**
 *
 * @author Marut
 */
public class Dog implements Animal,Sound{
    @Override
    public void eat(){
        System.out.println("Dog eat meat");
    }
    @Override
    public void move(){
        System.out.println("Dog runs !");
    }
    @Override
    public void sleep(){
        System.out.println("Dog sleeps in kennel !");
    }
    public void makesSound(){
        System.out.println("Dog Barks !");
    }
}
