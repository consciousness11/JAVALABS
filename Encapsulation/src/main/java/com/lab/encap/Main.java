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
public class Main {
    public static void main(String[] args){
    Student s = new Student();
    s.setName("abc");
    s.setAddress("ktm");
    s.setRoll(3);
    s.setMarks(78.9);
    s.info();
    System.out.println("Name  " + s.getName());
    }
}
