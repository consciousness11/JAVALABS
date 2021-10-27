/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unilink.wrapper;

import java.util.Vector;

/**
 *
 * @author Marut
 */
public class VectorExample {
    public static void main(String[] args) {
        Vector<Integer> vec = new Vector<Integer>();
        
        for(int i = 1;i<=10;i++){
        vec.add(i);
        }
        
        System.out.println(vec);
        System.out.println("Item at 3"+ vec.get(3));
        
        vec.remove(3);
        System.out.println(vec);
        System.out.println(vec.size());
         
        vec.add(2, 60);
        System.out.println(vec);
        System.out.println(vec.size());
    }
}
