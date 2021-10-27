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
public class Cat implements Animal,Sound{
    @Override
    public void eat(){
        System.out.println("Cats eat mice");
    }
    @Override
    public void move(){
        System.out.println("Cat walks !");
    }
    @Override
    public void sleep(){
        System.out.println("Cat sleeps in sofa !");
    }
    public void makesSound(){
        System.out.println("Cat meow !");
    }
}
