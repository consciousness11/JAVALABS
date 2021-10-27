/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.inheritancetypes;

/**
 *
 * @author Marut
 */
public class Main {

    public static void main(String[] args) {
        Dog d=new Dog();
        d.barks();
        d.eat();
        d.move();
        d.sleep();

//        Puppy p = new Puppy();
//        p.eat();
//        p.move();
//        p.sleep();
//        p.barks();
//        p.cry();
        Cat c = new Cat();
        c.meow();
        c.eat();
    }
}
