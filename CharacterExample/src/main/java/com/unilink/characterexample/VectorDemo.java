/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unilink.characterexample;

import java.util.Vector;

/**
 *
 * @author Marut
 */
public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vect = new Vector<Integer>();
        int i;
        for(i=1;i<=10;i++){
        vect.add(i+2);
        }
        
        System.out.println(vect);
        System.out.println("index 4"+vect.get(4));
        vect.remove(4);
        System.out.println(vect);
        System.out.println("Size"+vect.size());
        vect.add(4, 50);
        vect.add(1,70);
        System.out.println(vect);
        
    }
}
